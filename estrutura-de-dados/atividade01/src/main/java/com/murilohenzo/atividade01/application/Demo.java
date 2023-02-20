package main.java.com.murilohenzo.atividade01.application;


import main.java.com.murilohenzo.atividade01.factory.FactoryRepository;
import main.java.com.murilohenzo.atividade01.factory.RepositoryType;
import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;
import main.java.com.murilohenzo.atividade01.usecases.*;

import javax.swing.*;

public class Demo {
    public static final String SUCCESS = "Sucesso";
    public static final String BACK_MENU = "backMenu";

    public static RepositoryInMemory repository;


    public static void main(String[] args) {


        String optionMenu = JOptionPane.showInputDialog(null,
                "1 - VETOR\n2 - LISTA\n3 - EXIT",
                "Menu", JOptionPane.INFORMATION_MESSAGE);

        while (isValidOptionMenu(optionMenu)) {
            if ("".equals(optionMenu)) {
                exit();
            } else if (BACK_MENU.equals(optionMenu)) {
                optionMenu = JOptionPane.showInputDialog(null,
                        "1 - VETOR\n2 - LISTA\n3 - EXIT",
                        "Menu", JOptionPane.INFORMATION_MESSAGE);
            }
            repository = (
                    optionMenu.equals("1")
                            ? FactoryRepository.getRepository(RepositoryType.ARRAY)
                            : FactoryRepository.getRepository(RepositoryType.LIST));


            while (isValidOptionMenuOperations(optionMenu)) {

                if ("3".equals(optionMenu)) exit();

                String optionOperation = null;

                if (optionMenu.equals(1)) {
                    optionOperation = JOptionPane.showInputDialog(null,
                            "1 - Inserir dado\n2 - Alterar dado\n3 - Pesquisar dado\n4 - Mostrar dados\n5 - voltar",
                            "Menu", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    optionOperation = JOptionPane.showInputDialog(null,
                            "1 - Inserir dado\n2 - Alterar dado\n3 - Excluir dado\n4 - Pesquisar dado\n5 - Mostrar dados\n6 - voltar",
                            "Menu", JOptionPane.INFORMATION_MESSAGE);
                }


                while (isValidOptionOperations(optionOperation)) {

                    if (isBackOption(optionOperation)) {
                        optionMenu = BACK_MENU;
                        break;
                    } else if (isCreateOption(optionOperation)) {
                        String data = JOptionPane.showInputDialog(null,
                                "Inserir dado", JOptionPane.INFORMATION_MESSAGE);
                        add(data, repository);
                        break;
                    } else if (isUpdateOption(optionOperation)) {
                        String data = JOptionPane.showInputDialog(null,
                                "Alterar dado\nEntrar com valor do index e numero, separados por virgula", JOptionPane.INFORMATION_MESSAGE);
                        update(data, repository);
                        break;
                    } else if (isSearchOption(optionOperation)) {
                        String data = JOptionPane.showInputDialog(null,
                                "Pesquisar index, pelo elemento", JOptionPane.INFORMATION_MESSAGE);
                        find(data, repository);
                        break;
                    } else if (isDeleteOption(optionOperation)) {
                        String data = JOptionPane.showInputDialog(null,
                                "Deleta elemento pelo index", JOptionPane.INFORMATION_MESSAGE);
                        delete(data, repository);
                        break;
                    } else if (isFindAllOption(optionOperation)) {
                        findAll(repository);
                        break;
                    }
                }
            }
        }
    }

    private static boolean isCreateOption(String option) {
        return "1".equals(option);
    }

    private static boolean isUpdateOption(String option) {
        return "2".equals(option);
    }

    private static boolean isDeleteOption(String option) {
        return "3".equals(option);
    }

    private static boolean isSearchOption(String option) {
        return "4".equals(option);
    }

    private static boolean isFindAllOption(String option) {
        return "5".equals(option);
    }


    private static boolean isBackOption(String option) {
        return "6".equals(option);
    }

    private static boolean isValidOptionOperations(String option) {
        return "1".equals(option) || "2".equals(option) || "3".equals(option) || "4".equals(option) || "5".equals(option) || "6".equals(option);
    }

    private static boolean isValidOptionMenu(String option) {
        return "1".equals(option) || "2".equals(option) || "3".equals(option) || BACK_MENU.equals(option);
    }

    private static boolean isValidOptionMenuOperations(String option) {
        return "1".equals(option) || "2".equals(option) || "3".equals(option);
    }

    private static void exit() {
        JOptionPane.showMessageDialog(null, "Bye", SUCCESS, JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }

    private static void add(String data, RepositoryInMemory repository) {
        AddNumberUseCase addNumberUseCase = new AddNumberUseCase(repository);
        addNumberUseCase.execute(Integer.valueOf(data));

        JOptionPane.showMessageDialog(null, "Numero adicionado", SUCCESS, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void update(String data, RepositoryInMemory repository) {
        UpdateNumberUseCase updateNumberUseCase = new UpdateNumberUseCase(repository);
        String[] indexAndNumber = data.trim().split(",");

        updateNumberUseCase.execute(Integer.valueOf(indexAndNumber[0].trim()), Integer.valueOf(indexAndNumber[1].trim()));

        JOptionPane.showMessageDialog(null, "Numero atualziado", SUCCESS, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void findAll(RepositoryInMemory repository) {
        FindAllNumberUseCase findAllNumberUseCase = new FindAllNumberUseCase(repository);
        var numbers = findAllNumberUseCase.execute();
        JOptionPane.showMessageDialog(null, "Numeros: " + numbers , SUCCESS, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void find(String data, RepositoryInMemory repository) {
        FindNumberUseCase findNumberUseCase = new FindNumberUseCase(repository);
        JOptionPane.showMessageDialog(null, "Index: " + findNumberUseCase.execute(Integer.valueOf(data)) , SUCCESS, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void delete(String data, RepositoryInMemory repository) {
        DeleteNumberUseCase deleteNumberUseCase = new DeleteNumberUseCase(repository);
        deleteNumberUseCase.execute(Integer.valueOf(data));
        JOptionPane.showMessageDialog(null, "Eletemento " + data + " removido" , SUCCESS, JOptionPane.INFORMATION_MESSAGE);
    }

}
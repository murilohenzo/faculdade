package main.java.com.murilohenzo.atividade01.factory;

import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;
import main.java.com.murilohenzo.atividade01.repositories.impl.NumberArrayRepositoryInMemory;
import main.java.com.murilohenzo.atividade01.repositories.impl.NumberListRepositoryInMemory;

public class FactoryRepository {

    public FactoryRepository() {
    }

    public static RepositoryInMemory getRepository(RepositoryType type) {
        switch (type) {
            case ARRAY:
                return new NumberArrayRepositoryInMemory();
            case LIST:
                return new NumberListRepositoryInMemory();
            default:
                throw new IllegalArgumentException("Tipo desconhecido " + type);
        }
    }
}

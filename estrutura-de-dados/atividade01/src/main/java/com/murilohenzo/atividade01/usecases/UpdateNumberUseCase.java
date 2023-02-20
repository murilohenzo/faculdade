package main.java.com.murilohenzo.atividade01.usecases;

import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;

public class UpdateNumberUseCase {
    private final RepositoryInMemory repository;

    public UpdateNumberUseCase(RepositoryInMemory repository) {
        this.repository = repository;
    }

    public void execute(Integer index, Integer number) {
        try {
            repository.update(index, number);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Index nao existe dentro do array");
        }
    }
}

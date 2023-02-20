package main.java.com.murilohenzo.atividade01.usecases;

import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;

public class DeleteNumberUseCase {
    private final RepositoryInMemory repository;

    public DeleteNumberUseCase(RepositoryInMemory repository) {
        this.repository = repository;
    }

    public void execute(Integer index) {
        try {
            repository.delete(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Index nao existe dentro do array");
        }
    }
}

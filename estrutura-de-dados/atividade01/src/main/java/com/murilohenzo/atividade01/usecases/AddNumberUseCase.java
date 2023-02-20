package main.java.com.murilohenzo.atividade01.usecases;

import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;

public class AddNumberUseCase {
    private final RepositoryInMemory repository;

    public AddNumberUseCase(RepositoryInMemory repository) {
        this.repository = repository;
    }

    public void execute(Integer number) {
        repository.add(number);
    }
}

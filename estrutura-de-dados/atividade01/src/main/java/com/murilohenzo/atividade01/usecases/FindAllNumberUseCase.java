package main.java.com.murilohenzo.atividade01.usecases;

import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;

public class FindAllNumberUseCase {
    private final RepositoryInMemory repository;

    public FindAllNumberUseCase(RepositoryInMemory repository) {
        this.repository = repository;
    }

    public String execute() {
        return repository.findAll();
    }

}

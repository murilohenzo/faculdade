package main.java.com.murilohenzo.atividade01.usecases;

import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;

public class FindNumberUseCase {
    private final RepositoryInMemory repository;

    public FindNumberUseCase(RepositoryInMemory repository) {
        this.repository = repository;
    }

    public Integer execute(Integer number) {
        return repository.find(number);
    }
}

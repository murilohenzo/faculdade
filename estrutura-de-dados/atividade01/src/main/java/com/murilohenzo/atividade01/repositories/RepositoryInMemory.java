package main.java.com.murilohenzo.atividade01.repositories;

import java.util.Collection;

public interface RepositoryInMemory {
    void add(Integer number);
    void update(Integer index, Integer number);
    void delete(Integer index);
    Integer find(Integer number);
    String findAll();
}

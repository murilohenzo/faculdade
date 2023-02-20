package main.java.com.murilohenzo.atividade01.repositories.impl;

import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberListRepositoryInMemory implements RepositoryInMemory {
    private final List<Integer> arrayNumber;
    public NumberListRepositoryInMemory() {
        this.arrayNumber = new ArrayList<>();
    }

    @Override
    public void add(Integer number) {
        arrayNumber.add(number);
    }

    @Override
    public void update(Integer index, Integer number) {
        arrayNumber.set(index, number);
    }

    @Override
    public void delete(Integer index) {
        arrayNumber.remove(index);
    }

    @Override
    public Integer find(Integer number) {
        var aux = -1;
        for (int i = 0; i < arrayNumber.size(); i++) {
            if (Objects.equals(arrayNumber.get(i), number)) aux = i;
        }
        return aux;
    }

    @Override
    public String findAll() {
        return arrayNumber.toString();
    }
}

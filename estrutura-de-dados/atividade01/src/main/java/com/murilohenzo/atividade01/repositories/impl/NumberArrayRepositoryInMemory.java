package main.java.com.murilohenzo.atividade01.repositories.impl;

import main.java.com.murilohenzo.atividade01.repositories.RepositoryInMemory;

import java.util.Arrays;

public class NumberArrayRepositoryInMemory implements RepositoryInMemory {
    private Integer[] arrayNumber;
    private int size;
    private int capacity;
    public NumberArrayRepositoryInMemory() {
        this.arrayNumber = new Integer[2];
        this.size = 0;
        this.capacity = 2;
    }

    @Override
    public void add(Integer number) {
        if (size == capacity) {
            increaseArraySize();
        }
        arrayNumber[size] = number;
        size++;

    }

    @Override
    public void update(Integer index, Integer number) {
        arrayNumber[index] = number;

    }

    @Override
    public void delete(Integer index) {
        for (int i = index; i < arrayNumber.length - 1; i++) {
            arrayNumber[i] = arrayNumber[i + 1];
        }
    }

    @Override
    public Integer find(Integer number) {
        var aux = -1;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] == number) aux = i;
        }
        return aux;
    }

    @Override
    public String findAll() {
        return Arrays.toString(arrayNumber);
    }

    private void increaseArraySize() {
        Integer[] tempArray = null;
        if (size == capacity) {
            tempArray = new Integer[capacity * 2];
            {
                if (capacity >= 0) {
                    System.arraycopy(arrayNumber, 0, tempArray, 0, capacity);
                }
            }
        }
        arrayNumber = tempArray;
        capacity = capacity * 2;
    }
}

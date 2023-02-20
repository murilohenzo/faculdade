package org.example.recursao;

public class Fatorial {
    // 5! = 5 4 3 2 1
    // 4! = 4 3 2 1
    // 3! = 3 2 1
    // 2! = 2 1
    // 1! = 1
    public static long factorial(int n) {
        if (n <= 2) return n;
        return n * factorial(n -
    public static void main(String[] args) {

        var result = factorial(5);
        System.out.println(result);

    }
}
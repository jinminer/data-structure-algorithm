package com.jinm.algorithm.recursion;

public class Recurision {

    public static void main(String[] args) {
        System.out.println(f(6));
    }

    private static int f(int n) {
        if (n == 1) return 1;
        return f(n-1) + 1;
    }

}

package br.edu.ifs.singleton;

public class TestIncremental {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Incremental.getnstance());
        }
    }
}

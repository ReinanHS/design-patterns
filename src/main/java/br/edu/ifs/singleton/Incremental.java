package br.edu.ifs.singleton;

public class Incremental {
    private static Integer count = null;
    private int numero;

    private Incremental() { }

    public static Integer getnstance(){
        if(count == null){
            count = new Integer(0);
        }

        return count++;
    }

    @Override
    public String toString() {
        return "Incremental{" +
                "numero=" + numero +
                '}';
    }
}


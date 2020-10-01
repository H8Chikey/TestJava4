package sapt;

import java.io.IOException;

public class Programm {
    public static void main (String[] args) throws IOException{
        Lorry lorry = new Lorry("Gazel", 3000, 150, 10000);
        System.out.println(lorry.toString());
    }
}

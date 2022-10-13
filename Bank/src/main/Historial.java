package main;

import java.util.List;

public class Historial {
    public static void show(List<String> movimientos){
        System.out.println("Lista de movimientos");
        for(String mov : movimientos){
            System.out.println(mov);
        }
    }
}

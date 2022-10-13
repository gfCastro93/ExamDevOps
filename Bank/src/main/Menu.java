package main;

import java.util.Scanner;

public class Menu {
    public static String showMenu(){
        int count = 0;
        System.out.println(
            "Qué operacion desea realizar?\n"+
            "1. Consultar saldo\n"+
            "2. Retirar de efectivo\n"+
            "3. Historico de Movimientos\n"+
            "4. Salir"
        );
        Scanner scan = new Scanner(System.in);
        String valorMenu = scan.next();

        while (!(valorMenu.matches("[1-4]"))){
            count++;
            if(count<6) {
                if(count == 5){
                    System.out.println("Ultimo intento");
                }
                System.out.println("Ingrese un valor valido");
                valorMenu = scan.next();

            }else{
                valorMenu = null;
                break;
            }
        }
        return valorMenu;
    }
}

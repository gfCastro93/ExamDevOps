package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Retiro {
    public static float retiro (float saldo){
        float nSaldo=0;
        float cantidad;
        System.out.println("Su saldo es de: $"+(int)saldo+"\nQue cantidad desea retirar(Centavos no permitidos)?");
        Scanner scan = new Scanner(System.in);
        try {
            cantidad = scan.nextFloat();
            if(cantidad < 0){
                System.out.println("Operacion imposible\nRegresando a Menu");
            }else if(cantidad > saldo){
                System.out.println("Fondos insuficientes");
            }
            else{
                nSaldo = saldo - cantidad;
            }
        }catch (InputMismatchException e){
            System.out.println("No se permiten centavos en sus operaciones");
        }
        return nSaldo;
    }
}

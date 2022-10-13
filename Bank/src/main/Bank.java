package main;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public Bank(){}
    public static void main(String[] args) {
        float saldo;
        String opcion;
        List <String> movimientos;
        System.out.println(
                "Bienvenido al banco\n"+
                "Ingrese su contraseña para ingresar:"
        );
        if(Verify.verifyPass()) {
            boolean online = true;
            movimientos = new ArrayList<>();
            saldo = (float) 1000;
            movimientos.add(RegistroMovimientos.regitry(saldo));
            System.out.println("Contraseña correcta");
            while (online){
                opcion = Menu.showMenu();
                if (opcion != null && !opcion.equals("4")) {
                    switch (opcion) {
                        case "1":
                            System.out.println("Su saldo actual es de: $" + (int)saldo);
                            online = Exit.close();
                            break;
                        case "2":
                            float aSaldo = saldo;
                            saldo = Retiro.retiro(saldo);

                            if (saldo == 0) {
                                movimientos.add(RegistroMovimientos.regitry("Operacion negada"));
                                saldo = aSaldo;
                            } else {
                                movimientos.add(RegistroMovimientos.regitry(aSaldo, saldo));
                                System.out.println("A usted le quedan $" + (int)saldo);
                                online = Exit.close();
                            }
                            break;
                        case "3":
                            Historial.show(movimientos);
                            online = Exit.close();
                            break;
                        default:
                            System.out.println("Se ingreso una opcion no valida");
                            break;
                    }
                } else {
                    if (opcion == null) {
                        System.out.println("No se ingreso ningun valor correcto");
                        online = false;
                        System.out.println("Usted Salio");
                    }
                }
            }
        }else{
            System.out.println("Usted Salio");
        }
    }
}

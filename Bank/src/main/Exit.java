package main;

import java.util.Scanner;

public class Exit {
    public static boolean close(){
        boolean resBo = false;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        String res;
        while (flag) {
            System.out.println("Desea realizar otra operacion(s/n)?");
            res = scan.next();
            if (res.equals("s") || res.equals("S")) {
                flag = false;
                resBo = true;
            } else if (res.equals("n") || res.equals("N")) {
                flag = false;
                resBo = false;
                System.out.println("Usted salio");
            }
        }
        return resBo;
    }
}

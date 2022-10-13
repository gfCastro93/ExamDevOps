package main;

import java.util.Scanner;

public class Verify {
    private static final String PASSWORD = "12345";

    public static boolean verifyPass(){
        boolean flag = false;
        Scanner lec = new Scanner(System.in);
        String pass;
        int count = 0;
        while(!flag) {
            pass = lec.next();
            if (pass.equals(PASSWORD)) {
                flag = true;
                return flag;
            } else {
                count++;
                if(count<3) {
                    System.out.println(
                        "Contraseña incorrecta\n" +
                        "Por favor escriba de nuevo su contraseña"
                    );
                }else{
                    break;
                }

            }
        }
        return flag;
    }
}

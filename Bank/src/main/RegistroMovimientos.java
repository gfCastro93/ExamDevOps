package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistroMovimientos {
    private static final String PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
    public static String regitry(float saldo){
        String fecha = sdf.format(new Date());
        return fecha +" Saldo Inicial por $"+(int)saldo;
    }
    public static String regitry(float saldo,float cantidad){
        String fecha = sdf.format(new Date());
        return fecha +" Retiro de efectivo por $"+(int)(saldo - cantidad)+", saldo anterior $"+(int)saldo;
    }
    public static String regitry(String fallo){
        String fecha = sdf.format(new Date());
        return fecha +" "+ fallo;
    }
}

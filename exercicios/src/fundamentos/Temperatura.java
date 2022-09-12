package fundamentos;

import javax.security.auth.Destroyable;

public class Temperatura {
    public static void main(String[] args) {
        
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double farenheit = 86.0;
        double celsius = (farenheit - AJUSTE) * FATOR;
        System.out.println("A temperatura em Celsius é: " + celsius);

    }
}


package funcamentos;

import java.util.Scanner;

public class DesafioMediaSalarios {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro salário: ");
        String salario1 = entrada.next().replace(",",".");

        System.out.println("Digite o segundo salário: ");
        String salario2 = entrada.next().replace(",",".");

        System.out.println("Digite o terceiro salário: ");
        String salario3 = entrada.next().replace(",",".");
 
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double somaSalarios = valor1 + valor2 + valor3;

        System.out.println("A media salarial é de: "+ somaSalarios/3);

        entrada.close();
    }
}

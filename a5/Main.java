import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe a sua altura:");
        double altura = sc.nextDouble();

        System.out.println("Informe o seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();


        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);

        sc.close();


    }
}


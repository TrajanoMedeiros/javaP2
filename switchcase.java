import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite 1 o cafe da manhã 2 para almoço ou 3 para o jantar");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("cafe da manha");
                    break;
                case 2:
                    System.out.println("almoco");
                    break;
                case 3:
                    System.out.println("jantar");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            System.out.println("para continuar digite S, N para sair");
            r = sc.next();
        } while (r.equalsIgnoreCase("s"));
    }
}

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, z;
        System.out.print("Digite o valor de X: ");
        x = entrada.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = entrada.nextInt();
        System.out.println("Digite: 1.Soma, 2.Subtração, 3.Multiplicação, 4.Divisão: ");
        z = entrada.nextInt();

        switch (z){
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                System.out.println(x / y);
                break;
        }
    }
}

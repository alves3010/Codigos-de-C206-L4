import java.util.Scanner;
public class Litros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int produto;
        double litros, valordesconto;
        System.out.print("Digite 1. Para Gasolina, 2. Para Álcool.");
        produto = entrada.nextInt();
        switch (produto){
            case 1:
                System.out.println("Quantos litros gostaria de abastecer: ");
                litros = entrada.nextInt();
                if(litros <= 20){
                    litros = litros * 6;
                    valordesconto = litros * (4 / 100);
                    System.out.println("Você ira pagar ");
                    System.out.println(litros - valordesconto);
                    System.out.println(" Reais");
                }
                else{
                    litros = litros * 6;
                    valordesconto = litros * (6 / 100);
                    System.out.println("Você ira pagar ");
                    System.out.println(litros - valordesconto);
                    System.out.println(" Reais");
                }
                break;
            case 2:
                System.out.println("Quantos litros gostaria de abastecer: ");
                litros = entrada.nextInt();
                if(litros <= 20){
                    litros = litros * 4.90;
                    valordesconto = litros * (3 / 100);
                    System.out.println("Você ira pagar ");
                    System.out.println(litros - valordesconto);
                    System.out.println(" Reais");
                }
                else{
                    litros = litros * 4.90;
                    valordesconto = litros * (5 / 100);
                    System.out.println("Você ira pagar ");
                    System.out.println(litros - valordesconto);
                    System.out.println(" Reais");
                }
                break;
        }
    }
}

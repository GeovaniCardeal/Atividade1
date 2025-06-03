import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a distancia que será percorrida em Km: ");
        float distancia = teclado.nextInt();
        
        System.out.println("Informe o preço da gasolina: ");
        float valor = teclado.nextInt();
        
        float  gasolina = distancia / 12;
        
        float gastoTotal = gasolina * valor;
        
        System.out.println("Você irá precisar de " + gasolina + " litros de gasolina para realizar essa viagem o que lhe custara " + gastoTotal + " reais." );
        
     
    }
}
    
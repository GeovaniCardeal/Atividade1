import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int horas = teclado.nextInt();
        
        int salario = horas * 20;
        
        System.out.println( "Você irá receber " + salario);
        
        
    }
}
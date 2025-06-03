import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota.");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Digite a segunda nota.");
        float nota2 = teclado.nextFloat();
        
        float media = (nota1 + nota2)/2;
        
        if(media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
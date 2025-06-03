import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite primeiro numero: ");
        int num1 = teclado.nextInt();
        
         System.out.println("Digite segundo numero: ");
        int num2 = teclado.nextInt();
           
        if(num1 == num2){
            System.out.println("Escreva dois numeros diferentes");
        }
        
        if(num1 > num2){
            System.out.println("O maior numero é " + num1);
        }else{
            System.out.println("O maior numero é " + num2);
        }
        
        
        }
    }
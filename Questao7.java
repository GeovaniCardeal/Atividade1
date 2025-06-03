import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Infome o peso");
        float peso = teclado.nextFloat();
        
        System.out.println("Infome a altura");
        float altura = teclado.nextFloat();
        
        float imc = peso/altura;
        
        if(imc > 30){
            System.out.println("O usuario está obeso.");
        }else{
            System.out.println("O usuario está na media");
        }
            
}
}
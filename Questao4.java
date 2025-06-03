import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a temperatura medida pelo termometro");
        float temp = teclado.nextFloat();
        
        if(temp < 37){
            System.out.println("O paciente está com a temperatura normal");
        }else{
            System.out.println("O paciente está com febre");
        }
    }
}
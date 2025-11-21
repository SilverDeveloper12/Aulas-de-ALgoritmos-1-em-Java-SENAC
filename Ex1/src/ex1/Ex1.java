package ex1;
import java.util.Scanner;

public class Ex1{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    
    int n1,n2,result;

    System.out.println("Multiplicadora Easy em Java");
    System.out.println("---------------------------");    
        
    System.out.print("Por favor digite o primeiro numero: ");
        n1 = input.nextInt();
    System.out.print("Agora digite o segundo: ");
        n2 = input.nextInt();
     
     result = n1 * n2;
     System.out.println("A multiplicação dos numeros foi: " + result);
    
    }

}



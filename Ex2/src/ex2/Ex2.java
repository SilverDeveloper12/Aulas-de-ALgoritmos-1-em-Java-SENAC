package ex2;
import java.util.Scanner;

public class Ex2{
    public static void main(String []args){
    
    Scanner input = new Scanner(System.in);    
     int n1,n2,pot1,pot2;
     double result;
     
      System.out.println("Calculo de quadrados e soma Easy em Java");
      System.out.println("---------------------------");  
  
     System.out.print("Por favor digite seu numero: ");
        n1 = input.nextInt();
     System.out.print("Agora, digite o segundo numero: ");       
        n2 = input.nextInt();
        
        pot1 = n1 * n1;
        pot2 = n2 * n2;
     
        result = pot1 + pot2;
     
     System.out.println("O resultado da soma dos quadrados e: " + result);
        
    }
}
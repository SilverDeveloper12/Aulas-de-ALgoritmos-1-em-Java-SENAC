package ex6_c;
import java.util.Scanner;

public class Ex6_C{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    
    float A,B,C,result;
    
    System.out.print("Digite o valor da maior base do trapezio: ");
      A = input.nextFloat();
    System.out.print("Agora digite o valor da menor base: ");
      B = input.nextFloat();
    System.out.print("Por fim, digite o valor da altura do trapezio: ");
      C = input.nextFloat();
      
    result = ((A+B)/2) * C; 
    
    System.out.println("O valor da area do trapezio e: " + result);
    }
}
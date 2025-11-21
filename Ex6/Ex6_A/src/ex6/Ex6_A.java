package ex6;
import java.util.Scanner;

  public class Ex6_A{
      public static void main(String []args){
       Scanner input = new Scanner(System.in);
      float A,B,C;
      
      System.out.print("Digite o valor da base do triangulo: ");
        A = input.nextFloat();
      System.out.print("Digite o valor da altura do triangulo: ");
        C = input.nextFloat();
      
      B = (A * C)/2;
      
      System.out.println("A area do seu triangulo retangulo e: " + B); 
        
            
        }
    }
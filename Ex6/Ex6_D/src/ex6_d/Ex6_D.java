package ex6_d;
import java.util.Scanner;

public class Ex6_D{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    
    int A,B;
    
    System.out.print("Por favor digite valor do lado do quadrado: ");
        B = input.nextInt();
        
     A = B * B;
     
    System.out.println("A area do quadrado e: " + A);
        
    }
}
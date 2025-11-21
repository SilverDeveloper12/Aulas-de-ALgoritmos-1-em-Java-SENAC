package ex5;
import java.util.Scanner;

public class Ex5{
    public static void main(String []args){
    
    Scanner input = new Scanner(System.in);
    int lado, result;
    
    System.out.print("Digite o valor do lado do quadrado: ");
        lado = input.nextInt();
    
    result = lado * lado;
    
    System.out.println("A area do seu quadrado e de: " + result);
        
    }
}

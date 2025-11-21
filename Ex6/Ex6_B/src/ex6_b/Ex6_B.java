package ex6_b;
import java.util.Scanner;

public class Ex6_B{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    
    float C;
    double A, B;
    
    System.out.print("Digite o valor do Raio da circunferencia: ");
        C = input.nextFloat();
    B = 3.14159;
    
    A = B *(C*C);
    
    System.out.println("A area da circunferencia e: " + A);
        
    }

}

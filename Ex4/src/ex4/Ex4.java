package ex4;
import java.util.Scanner;

    public class Ex4{
        public static void main(String []args){
         
         int n1, n2;   
         Scanner input = new Scanner(System.in);
         
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();
        System.out.print("Digite agora o segundo numero: ");
        n2 = input.nextInt();
        
        n1++;
        n2++;
        
        System.out.println(n1);
        System.out.println(n2);
            
        }
    }

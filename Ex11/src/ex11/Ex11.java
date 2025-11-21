package ex11;
import java.util.Scanner;

    public class Ex11{
        public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        //declaracao de variavel
        int n;
        
        //entrada de dados
        System.out.print("Digite algum numero do conjunto de numeros inteiros: ");
            n = input.nextInt();
            
        //processamento/saida
        if( n < 0 ){
            System.out.println("Numero negativo");
            }
        
        }
    }
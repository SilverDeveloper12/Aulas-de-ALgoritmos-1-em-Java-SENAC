import java.util.Scanner;

public class Exemplo2 {
    
    
    public static void main(String[] args) {
       //int n = 10; // tamanho do vetor
       int[] vetor = new int[10];
       
       //populando o vetor
       Scanner sc = new Scanner(System.in);
       for(int i=0; i<vetor.length; i++){
           System.out.printf(" vetor[%d]: ",i);
           vetor[i] = sc.nextInt();
       }
       
       int maior = vetor[0];
       int menor = vetor[0];
       int soma = 0;
       
       //verifica o tamanho
       
       for(int i=0; i < vetor.length; i++){
           soma += vetor[i];
           
           if(vetor[i] < menor){
               menor = vetor[i];
           }
           if(vetor[i] > maior){
               maior = vetor[i];
           }
       }
       //printa os valores alterados
        System.out.println("------------------------");
        for(int i=0; i<vetor.length; i++){
            System.out.print(" vetor["+i+"]: " + vetor[i]);
            if(vetor[i] == maior){
                System.out.print(" <---- MAIOR!");            }
            if(vetor[i] == menor){
                System.out.print(" <---- MENOR!");
            }
            System.out.println(" ");
        }
        System.out.println("Soma: "+soma);
    }
}

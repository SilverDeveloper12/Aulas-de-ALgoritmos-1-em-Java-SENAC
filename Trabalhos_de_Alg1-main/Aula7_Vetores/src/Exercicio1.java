import java.util.Scanner;

public class Exercicio1 {
    
    static int tamanhoVetor(){
        System.out.println(">>>tamanho do vetor<<<");
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho: ");
        int size = sc.nextInt();
        return size;
    }
    
    static int[] criarVetor(int size){
        System.out.println(">>>criar vetor<<<");
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[size];
        
        for(int i=0; i<vetor.length; i++){
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = sc.nextInt();
        }
        
        return vetor;
    }
    
    //escrever uma funcao em Java que receba 
    //um array de inteiros por parâmetro e retorna
    //o somatorio de todos os elementos do array
    static int calcularSoma(int[] v){
        System.out.println(">>>calcular soma<<<");            
        int soma = 0;
        for(int i=0; i < v.length; i++){
            soma += v[i];
        }
        return soma;
    }
    
    static int[] obterMaiorMenor(int[] vetor){
        System.out.println(">>>Maior e Menor<<<");
       
       int maior = vetor[0];
       int menor = vetor[0];
       
       //verifica o tamanho
       
       for(int i=0; i < vetor.length; i++){
           
           if(vetor[i] < menor){
               menor = vetor[i];
           }
           if(vetor[i] > maior){
               maior = vetor[i];
           }
       }
       int[] vMM = {maior,menor};
      return vMM;
    }
    static void imprimir(int soma, int[] v){
        System.out.println(">>>imprimir<<<");
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + v[0]);    
        System.out.println("Menor: "+ v[1]);
    }
  //teste
    public static void main(String[] args) {
        int t = tamanhoVetor();
        int[] v = criarVetor(t);
        int s = calcularSoma(v);
        int[] vMM = obterMaiorMenor(v);
        imprimir(s,vMM);
    }
}

package aula8_Matrizes;

import java.util.Scanner;


public class Exemplo1 {
    
    static int[] tamanhoMatriz(){
        System.out.println(">>> definindo o tamanho da matriz <<<");
        Scanner sc = new Scanner(System.in);
        System.out.print("Linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Colunas: ");
        int colunas = sc.nextInt();
        int[] vetorLC = {linhas, colunas};
        return vetorLC;
    }
    static int[][] criarMatriz(int[] vetorLC){
        System.out.println(">>> criar matriz <<<");
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[vetorLC[0]][vetorLC[1]];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: \n",i,j);
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }
    static void imprimir(int[][] matriz){
        System.out.println(">>>imprimindo<<<");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("matriz[%d][%d]: %d\n",i,j,matriz[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
    int[] vetor = tamanhoMatriz();
    int[][] matriz = criarMatriz(vetor);
    imprimir(matriz);
        
    }
    
}

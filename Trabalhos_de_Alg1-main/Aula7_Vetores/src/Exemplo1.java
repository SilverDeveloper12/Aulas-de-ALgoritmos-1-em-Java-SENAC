public class Exemplo1 {
    
    public static void main(String[] args) {
    //define o tamanho do array
    
    int tamanho = 10;
    
    //instanciando um array com "tamanho" 
    
    int[] vetor = new int [tamanho];
   
    //atribuir 100 a posição
    vetor[5] = 100;
    //imprimir o vetor 
    for(int i=0; i<tamanho; i++){
        System.out.println("Vetor["+i+"]: "+vetor[i]);
    }
    }   
}

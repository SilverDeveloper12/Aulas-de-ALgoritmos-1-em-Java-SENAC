import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,anteriorN = 0, maiorN = 0,menorN = 0;
        
     
        do{
            System.out.print("Digite numero: ");
            N = sc.nextInt();
            if(anteriorN < N){
                anteriorN = N;
                if(anteriorN >= 0){
                maiorN = anteriorN;
                }
            }
            if(anteriorN > N){
                anteriorN = N;
                if(anteriorN >= 0){
                menorN = anteriorN;
                }
            }
            
        }while(N >= 0);
        System.out.println("O maior valor foi: "+ maiorN);
        System.out.println("O menor valor foi: "+menorN);
    }
}

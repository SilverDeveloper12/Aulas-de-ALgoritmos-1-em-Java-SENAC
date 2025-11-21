import java.util.Scanner;
public class Exemplo1 {
   
    //especificacao da function m8;
    static int minimo(int n1, int n2){
        System.out.println(">>> Verificar o minimo >>>");
        int menor = 0;
        if(n1 < n2){
            menor = n1;
        }else{
            menor = n2;
        }
        return menor;
    }
    static int obterNumero(){
        System.out.println(">>> Obter um numero >>>");
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();
        return n;
    }
    static void imprimir(int menor){
        System.out.println(">>> Imprimir o menor >>>");
        System.out.println("Menor: " + menor);
    }   
    public static void main(String[] args){
        int x = obterNumero(), y = obterNumero();
        //int menor = minimo(x,y);
        //imprimir(menor);
        imprimir(minimo(x,y));
    }
}

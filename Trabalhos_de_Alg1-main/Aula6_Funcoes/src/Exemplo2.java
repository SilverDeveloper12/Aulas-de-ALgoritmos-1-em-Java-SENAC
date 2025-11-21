import java.util.Scanner;

public class Exemplo2 {
    static float obterNota(){
        System.out.println(">>> Obter nota >>>");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        float nota = sc.nextFloat();
        return nota;
    }
    static float calculaMedia(float n1, float n2, float n3){
        System.out.println(">>> Calcular a media >>>");
        float media = (n1+n2+n3)/3;
        return media;
    }
    static String verificaStatus(float media){
        System.out.println(">>> Verificar Status >>>");
        String status;
        if(media >= 6){
         status = "Aprovado!";
        }else{
         status = "Reprovado.";   
        }
        return status;
    }
    static void imprimirStatus(String status){
        System.out.println(">>> Verifica Status >>>");
        System.out.println("Status "+status);
    }
    public static void main(String[] args){
        float n1 = obterNota(), n2 = obterNota(), n3 = obterNota();
        float media = calculaMedia(n1, n2, n3);
        String status = verificaStatus(media);
        imprimirStatus(status);
    }
}

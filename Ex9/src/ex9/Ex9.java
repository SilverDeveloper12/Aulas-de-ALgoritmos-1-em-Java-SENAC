package ex9;
import java.util.Scanner;

public class Ex9{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        //declaração de variavel
        int id,hrsWeek,hrsMonth;
        float valHr,salario;
        
        //Entrada de dados
        System.out.print("Digite o numero de cadastro do funcionario: ");
        id = input.nextInt();
        System.out.print("Digite o total de horas semanais do funcionario: ");
        hrsWeek = input.nextInt();
        System.out.print("Digite o quanto o funcionario recebe por hora: ");
        valHr = input.nextFloat();
        
        //processamento
        hrsMonth = hrsWeek * 5; //aqui professor, o 5 representa 5 semanas, ou 1 mes
        salario = valHr * hrsMonth;
        
        //saida de dados
        System.out.print("O funcionario com numero de cadastro " + id);
        System.out.print(" recebe " + salario);
        System.out.println("por mes.");
        input.close();
    }
    
}
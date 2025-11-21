import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salary,salaryDesc,result,option;
        do{
        System.out.print("Qual o valor do salario do contribuinte: ");
        salary = sc.nextDouble();
        if(salary <= 1_903.98){
            System.out.println("salario bruto: "+salary);
            
        }
        else if((salary > 1_903.99) && (salary <= 2_826.65)){
            salaryDesc = salary * 7.5/100;
            result = salary - salaryDesc;
            System.out.println("Salario bruto: "+salary);
            System.out.println("salario com desconto: "+result);
            System.out.println("A aliquota foi de 7.5%");

        }else if((salary > 2_826.66) && (salary <= 3_751.05)){
            salaryDesc = salary * 15/100;
            result = salary - salaryDesc;
            System.out.println("Salario bruto: "+salary);
            System.out.println("salario com desconto: "+result);
            System.out.println("A aliquota foi de 15%");
        }else if((salary > 3_751.06) && (salary <= 4_664.68)){
            salaryDesc = salary * 22.5/100;
            result = salary - salaryDesc;
            System.out.println("Salario bruto: "+salary);
            System.out.println("salario com desconto: "+result);
            System.out.println("A aliquota foi de 22.5%");
        }else if(salary > 4_664.69){
            salaryDesc = salary * 27.5/100;
            result = salary - salaryDesc;
            System.out.println("Salario bruto: "+salary);
            System.out.println("salario com desconto: "+result);
            System.out.println("A aliquota foi de 27.5%");
        }
            System.out.println("voce deseja continuar a consulta?\n(1)sim\n(2)nao");
            System.out.print("R: ");
            option = sc.nextInt();
        }while(option != 2);
    }
}

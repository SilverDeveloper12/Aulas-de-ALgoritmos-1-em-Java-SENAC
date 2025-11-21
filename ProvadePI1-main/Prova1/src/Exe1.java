import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double valEtanol = 3.65, valGas = 5.79, newValGas, newValEtanol,desc,result;    
    int user,gasType = 1,etanolType = 2,qntGas,qntEtanol,option;
    
        do{
        System.out.println("Escolha o tipo de combustivel:\n(1)Gasolina\n(2)Etanol");
        System.out.print("R: ");
        user = sc.nextInt();
        
        if(user == gasType){
            System.out.print("Digite a quantidade em litros do combustivel(gasolina): ");
            qntGas = sc.nextInt();
            if(qntGas <= 10){
                desc = valGas * 5/100;
                newValGas = valGas - desc;
                result = newValGas * qntGas;
                System.out.println("O valor com 5% de desconto do litro da gasolina foi de: "+result);
                
            }else if(qntGas > 10){
                desc = valGas * 7 /100;
                newValGas= valGas - desc;
                result = newValGas * qntGas;
                System.out.println("O valor com 7% de desconto do litro da gasolina foi de: "+result);
            }
        
        }
        if(user == etanolType){
            System.out.print("Digite a quantidade em litros do combustivel(etanol): ");
            qntEtanol = sc.nextInt();
            
            if(qntEtanol <= 5){
                result = valEtanol * qntEtanol;
                System.out.println("O valor sem desconto do litro do etanol foi de: "+result);
            }else if(qntEtanol > 5){
                desc = valEtanol * 10/100;
                newValEtanol = valEtanol - desc;
                result = newValEtanol * qntEtanol;
                System.out.println("O valor com desconto de 10% do litro do etanol foi de: "+result);
            }
        }
            System.out.println("Voce deseja realizar a operacao novamente?\n(1)sim\n(2)nao");
            option = sc.nextInt();
    
        }while(option != 2);
    }
}

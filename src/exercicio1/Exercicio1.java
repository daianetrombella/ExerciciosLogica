package exercicio1;

import java.util.Scanner;
/**
 *
 * @author Daiane
 */
public class Exercicio1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Funcionarios[] listaFun = new Funcionarios[11];
        for(int i=0; i < 5; i++){
            System.out.println("Funcionário "+ (i+1) + ":");
            System.out.print("Informe o número da mátricula:");
            if(i !=0){
                 scn.skip("[\t\n\r] *");
            }
            String mat = scn.nextLine();
            System.out.print("Informe o nome: ");
            String nome = scn.nextLine();
            System.out.print("Informe o setor [A | B | C | D]: ");
            char setor = scn.next().charAt(0);
            System.out.print("Informe o salário atual: ");
            float salario = scn.nextFloat();
            
            Funcionarios f1 = new Funcionarios(mat, nome, setor, salario);
            if(f1.getSalarioA() < 3000){
                if(f1.getSetor() == 'A' || f1.getSetor() == 'a'){
                    f1.reajustarSalario(8);
                }else if(f1.getSetor() == 'B' || f1.getSetor() == 'b'){
                    f1.reajustarSalario(10);
                }else if(f1.getSetor() == 'C' || f1.getSetor() == 'c'){
                    f1.reajustarSalario(11);
                }else if(f1.getSetor() == 'D' || f1.getSetor() == 'd'){
                    f1.reajustarSalario(12);
                }
            }else if(f1.getSalarioA() >= 2500 && f1.getSalarioA() < 5000){
                if(f1.getSetor() == 'A' || f1.getSetor() == 'a' ){
                    f1.reajustarSalario(7);
                }else if(f1.getSetor() == 'B' || f1.getSetor() == 'b'){
                    f1.reajustarSalario(9);
                }else if(f1.getSetor() == 'C' || f1.getSetor() == 'c'){
                    f1.reajustarSalario(10);
                }else if(f1.getSetor() == 'D' || f1.getSetor() == 'd'){
                    f1.reajustarSalario(11);
                }
            }else if(f1.getSalarioA() >= 5000){
                if(f1.getSetor() == 'A' || f1.getSetor() == 'a'){
                    f1.reajustarSalario(6);
                }else if(f1.getSetor() == 'B' || f1.getSetor() == 'b'){
                    f1.reajustarSalario(8);
                }else if(f1.getSetor() == 'C' || f1.getSetor() == 'c'){
                    f1.reajustarSalario(9);
                }else if(f1.getSetor() == 'D' || f1.getSetor() == 'd'){
                    f1.reajustarSalario(9);
                }
            }else{
                System.out.println("Não deu bom");
            }
            listaFun[i] = f1;
            
        }
        
        boolean troca;
        do{
            troca = false;
            for(int i=0; i<9; i++){
                if(listaFun[i].getSalarioR() < listaFun[i+1].getSalarioR()){
                    Funcionarios aux = listaFun[i];
                    listaFun[i] = listaFun[i+1];
                    listaFun[i+1]=aux;
                    troca=true;
                }
            }
        }while(troca);
        
        
        for(int i=0; i<10; i++){
            System.out.println("Funcionario "+ (i+1) + ":");
            System.out.println("Nome: "+ listaFun[i].getNome());
            System.out.println("Matricula: "+ listaFun[i].getNM());
            System.out.println("Salario: "+ listaFun[i].getSalarioA());
            System.out.println("Setor: "+ listaFun[i].getSetor());
            System.out.println("Valor do reajuste: "+ listaFun[i].getReajuste());
            System.out.println("Salario após reajuste: "+ listaFun[i].getSalarioR());
            System.out.println("porcentagem de reajuste: "+ listaFun[i].getN1());
            System.out.println("---------------------------------");
        }
        
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package exercicio2;

import java.util.Scanner;
/*
 * @author Daiane
 */
public class Exercicio2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Produto[] vetor = new Produto[20];
        char r = 's';
        int c =1;
        int i = 0;
        while(r == 's' || r == 'S'){
            System.out.println("Informe o nome do produto:");
            String nome = scn.nextLine();
            System.out.println("Informe o preço do produto:");
            Float p = scn.nextFloat();
            
            Produto p1 = new Produto(nome ,p , c, 1);
            vetor[i] =  p1;
            System.out.println("Quer cadastrar outro produto? [S/N]");
            r = scn.next().charAt(0);
            c++;
            i++;
            
            scn.nextLine();
        }
        
        for(int j=0; j < i; j++){
            System.out.println("Quer mudar o preço do(a) " + vetor[j].getNome()+"? [S/N]");
            char a = scn.next().charAt(0);
            if(a == 's' || a == 'S'){
                System.out.println("Informe o novo valor: ");
                Float v = scn.nextFloat();
                vetor[j].ajustarPreco(v);
            }
            
            System.out.println("Quer fazer uma compra do(a) " + vetor[j].getNome()+" para acrescentar em seu estoque? [S/N]");
            char b = scn.next().charAt(0);
            if(b == 's' || b == 'S'){
                System.out.println("Informe a quantidade: ");
                int v = scn.nextInt();
                vetor[j].comprar(v);
            }
            
            System.out.println("Quer fazer uma venda do(a) " + vetor[j].getNome()+" em seu estoque? [S/N]");
            char d = scn.next().charAt(0);
            if(d == 's' || d == 'S'){
                System.out.println("Informe a quantidade: ");
                int v = scn.nextInt();
                vetor[j].vender(v);
            }
            
        }
        
        
        System.out.println("-----------------------------------------------");
        for(int j=0; j < i; j++){
            System.out.println("Código: " + vetor[j].getCodigo());
            System.out.println("Descrição: " + vetor[j].getNome());
            System.out.println("Preço: " + vetor[j].getPrecoUnitario());
            System.out.println("Estoque: " + vetor[j].getEstoque());
            System.out.println("-----------------------------------------------");
        }
 
        
    }
}

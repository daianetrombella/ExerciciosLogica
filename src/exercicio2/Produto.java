/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;
/**
 *
 * @author Daiane
 */
public class Produto {
    private int codigo;
    private String nome;
    private float precoUnitario;
    private int estoque;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setUnidadeMedida(int unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getNome() {
        return nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getUnidadeMedida() {
        return unidadeMedida;
    }
    private int unidadeMedida;
    
    public Produto(String nome, float precoUnitario, int codigo, int estoque){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.codigo = codigo;
        this.estoque = estoque;
    }
    
    public void vender(int quant){
        if(estoque - quant < 0){
            System.out.println("Não foi possivel efetuar a venda pois não temos "+ quant+" unidade(s) de "+ nome);
        }else{
            estoque = estoque - quant;
        }
     }
     
    public void comprar(int quant){
        estoque = estoque + quant;
    }
    
    public void ajustarPreco(float valor){
        precoUnitario = valor;
    }
    
    
    @Override
    public String toString(){
        return String.format("Nome: "+ nome + "; código: "+ codigo);
    }
}

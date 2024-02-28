package exercicio1;
/**
 *
 * @author Daiane
 */
public class Funcionarios {
    private String nM;
    private String nome;
    private char setor;
    private float salarioA;
    private float reajuste;
    private float n1;
    private float salarioR;
    
    public Funcionarios(String nM, String nome, char setor, float salarioA){
        this.nM = nM;
        this.nome = nome;
        this.setor = setor;
        this.salarioA = salarioA;
    }
    
    public void setN1(float n1){
        this.n1 = n1;
    }
    
    public float getN1(){
        return n1;
    }
    
    public void setReajuste(float reajuste){
        this.reajuste = reajuste;
    }
    
    public float getReajuste(){
        return reajuste;
    }
    
    public void setNM(){
        this.nM = nM;
    }
    
    public void setNome(){
        this.nome = nome;
    }
    
    public void setSetor(){
        this.setor = setor;
    }
    
    public void setSalarioA(){
        this.salarioA = salarioA;
    }
    
    public String getNM(){
        return nM;
    }
    
    public String getNome(){
        return nome;
    }
    
    public char getSetor(){
        return setor;
    }

    public float getSalarioR() {
        return salarioR;
    }
    
    public float getSalarioA(){
        return salarioA;
    }
    
    public void reajustarSalario(float n){
        n1= n/100;
        reajuste = salarioA*n1;
        n1 = n1*100;
        salarioR = salarioA+reajuste;
        
    }
}

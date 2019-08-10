/*
 * @author Victoria Regina Oliveira Brito Almeida
 * RA: 1850383-5
 */
package aplicativo.java;

public class Conta {
    
    private int agencia;
    private int numero;
    private int digito;
    private int saldo;
        
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }
    
    public void setDigito(int digito) {
        this.digito = digito;
    }

    public int getSaldo() {
        return saldo;
    }
 
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void saque(Double valor){
    
    }
    
    public void deposito(Double valor){
    
    }
    
    public void transferencia(Double valor, Conta conta){
    
    }
    
    public void saldo(){
    
    }
}

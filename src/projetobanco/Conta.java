
package projetobanco;


public class Conta {
    
    String nome;
    double saldo;
    
    public void depositar(double valor){
    
        saldo += valor;
        System.out.println("Operação de depósito no valor de R$: " + valor);
    }
    
    public void exibirSaldo(){
        System.out.println(nome + " Seu saldo é R$: " + saldo);
    }
    
    public void sacar(double valor){
        
        if(saldo > valor){
            saldo -= valor;
            System.out.println("Operação de saque no valor de R$: " + valor);
        }else{
            System.out.println("Operação não realizada, SALDO INSUFICIENTE!!! ");
            System.out.println("Seu saldo é : " + saldo + " | Saque de R$: " + valor);
        }
    }
}











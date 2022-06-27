package br.com.caelum.contas.modelo;

public class Conta {
    private static int identificador=0;
    private String titular;
    private String agencia;
    private int numero;
    private double saldo;
    private double rendimento;
    private Data dataDeAbertura;

    public Conta (String titular) {
        //faz mais uma série de inicializações e configurações
        this.titular = titular;
        identificador++;
        }
    
    public double getRendimento(){
            return this.saldo * 0.1;
        
    }
    public String getDadosParaImpressao(){
        String dados = "\nTitular: " + this.titular + 
        "\nSaldo atual: "+ getSaldo() + 
        "\nRendimento: "+ getRendimento();
        dados += "\nData da Abertura: " + this.getData();
        return dados;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public Data getData(){
        return this.dataDeAbertura;
    }
    public boolean getSacar(double valor){
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    public int getIdentificador(){
        return this.identificador;
    }
    public void setDepositar(double quantidade){
        this.saldo += quantidade;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setData(Data dataAbertura){
        this.dataDeAbertura = dataAbertura;
    }
}

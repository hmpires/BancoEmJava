package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;
public class Principal {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("Henrique");
        minhaConta.setAgencia("Brasill");
        minhaConta.setNumero(1234);
        minhaConta.setDepositar(5000.0);
        minhaConta.setData(new Data(27,06,2022));

        System.out.println(minhaConta.getDadosParaImpressao());
    }
}

package br.com.sorrudo.model;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private boolean status;
    private double saldo;

    public ContaBanco() {
        status = false;
        saldo = 0;
    }

    public boolean abrirConta() {
        return status = true;
    }

    public String fecharConta() {
        if (saldo != 0) {
            return "Para fechar a sua conta você precisa sacar todo o seu dinheiro da conta";
        } else {
            status = false;
            return "A sua conta foi fechada com sucesso";
        }

    }

    public double depositar(double x) {
        return saldo += x;
    }

    public void sacar(double x) {
        if (saldo != 0 && saldo >= x) {
            saldo -= x;
        }

    }

    public void pagarMensal() {
        if (tipoConta.equalsIgnoreCase("cp") && saldo != 0){
            saldo -= 20;
        }else {
            saldo -= 12;
        }
    }


    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipoConta(String tp) {
        this.tipoConta = tp;
        if (tp.equalsIgnoreCase("cp")) {
            saldo += 150;
            String tipoConta = "cp";
        }
        if (tp.equalsIgnoreCase("cc")) {
            saldo += 50;
            String tipoConta = "cc";
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}










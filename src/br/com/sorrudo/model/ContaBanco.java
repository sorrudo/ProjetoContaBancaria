package br.com.sorrudo.model;

import br.com.sorrudo.controler.Controler;

public  class ContaBanco implements Controler{

    protected String tipoConta;
    private boolean status;
    private double saldo;

    public ContaBanco() {
        status = false;
        saldo = 0;
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


    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public boolean  abrirConta() {
        return status = true;
    }

    @Override
    public String fecharConta() {
        if (saldo != 0) {
            return "Para fechar a sua conta você precisa sacar todo o seu dinheiro da conta";
        } else {
            status = false;
            return "A sua conta foi fechada com sucesso";
        }
    }

    @Override
    public double depositar() {
        return 0;
    }

    @Override
    public void sacar() {

    }

    @Override
    public double depositar(double x) {
        return saldo += x;
    }

    @Override
    public void sacar(double x) {
        if (saldo != 0 && saldo >= x) {
            saldo -= x;
        }
    }

    @Override
    public void pagarMensal() {
        if (tipoConta.equalsIgnoreCase("cp") && saldo != 0){
            saldo -= 20;
        }else {
            saldo -= 12;
        }
    }
}










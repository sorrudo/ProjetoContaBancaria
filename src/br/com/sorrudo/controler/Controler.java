package br.com.sorrudo.controler;

public interface Controler {
    boolean abrirConta();
    String fecharConta();
    double depositar();
    void sacar();
    double depositar(double x);
    void sacar(double x);
    void pagarMensal();



}

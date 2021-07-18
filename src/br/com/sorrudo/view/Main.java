package br.com.sorrudo.view;

import br.com.sorrudo.model.Cliente;
import br.com.sorrudo.model.ContaBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Cliente cliente1 = new Cliente();
        ContaBanco contaCliente1 = new ContaBanco();
        Scanner leitor = new Scanner(System.in);




        System.out.println("Banco Do Radan.... Seja bem vindo!\nVamos abrir uma conta :");
        System.out.println("Digite seu nome");
        cliente1.setNome(leitor.nextLine());
        System.out.println("Digite o seu CPF");
        cliente1.setCpf(leitor.nextLine());
        System.out.println("Seja bem vindo, " + cliente1.getNome() + " Espero que seja feliz conosco\nAgora vamos abrir uma conta");
        System.out.println("Você gostaria de abrir uma conta corrente ou conta poupança :\nDigite a opção desejada");
        System.out.println(("(CP) conta poupança ou (CC) conta corrente"));
        contaCliente1.setTipoConta(leitor.next());
        if(contaCliente1.getTipoConta().equalsIgnoreCase("cp") ) {
            System.out.println("Parabéns, estamos te presenteando com um valor de R$ 150,00, termine o processo de abertura de conta\ne o valor estará disponivel");
        }else {
            System.out.println("Parabéns, estamos te presenteando com um valor de R$ 50,00, termine o processo de abertura de conta\ne o valor estará disponivel");
        }
        System.out.println("Para terminar o processo, você terá que fazer um deposito de no minímo R$ 100,00\n\n ");
        System.out.println("Escolha o valor");
        contaCliente1.depositar(leitor.nextDouble());
        System.out.println("Parabéns, agora você tem R$ "+ contaCliente1.getSaldo() + " na sua conta");
        contaCliente1.abrirConta();










    }
}

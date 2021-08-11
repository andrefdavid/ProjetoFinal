package entregadores;

import java.util.Scanner;

public class SistemaEntregadores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String[] nomesEntregadores = new String[QUANTIDADE_ENTREGADORES];
		String[] telefonesEntregadores = new String[QUANTIDADE_ENTREGADORES];
		double[] avaliacoesEntregadores = new double[QUANTIDADE_ENTREGADORES];
		int opcao = 0;
		String usuario, senha;
		System.out.println("Para entrar no sistema você deve informar seu usuário e sua senha");
		System.out.println("Digite seu usuário");
		usuario = leitor.next();
		System.out.println("Digite sua senha");
		senha = leitor.next();

		if(FuncoesEntregadores.login(usuario, senha)){
			System.out.println("Login bem sucedido!");
		}else {
			System.out.println("Usuário ou senha incorretos.");
			System.exit(1);
		}
		
		
		
		while(opcao!=4) {
			FuncoesEntregadores.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				//Cadastrar os 20 entregadores da plataforma, pela funcao.
				//Dentro do loop que solicita a digitação dos dados de cada entregador, chamar a funcao abaixo
				FuncoesEntregadores.cadastrarEntregador(nomesEntregadores, telefonesEntregadores, avaliacoesEntregadores, novoNome, novoTelefone, novaAvaliacao);
				break;
				
			case 2:
				//Alterar a avaliação de um entregador pelo nome
				FuncoesEntregadores.alterarAvaliacao(nomesEntregadores, avaliacoesEntregadores, novaAvaliacao);
				break;
				
			case 3:
				//Exibir o nome e telefone do entregador mais bem avaliado
				FuncoesEntregadores.melhorAvaliado(nomesEntregadores, telefonesEntregadores, avaliacoesEntregadores);
				break;
			case 4:
				//Mensagem de saída
				break;	
			default:
				//Mensagem de opção inválida
				break;
				
			}
			
		}

	}

}

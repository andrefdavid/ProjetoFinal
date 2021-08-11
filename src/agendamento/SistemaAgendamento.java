package agendamento;

import java.util.Scanner;

public class SistemaAgendamento {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String[] agendamentos = new String[QUANTIDADE_AGENDAMENTOS];
		int opcao = 0;
		String usuario, senha;
		System.out.println("Para entrar no sistema você deve informar seu usuário e sua senha");
		System.out.println("Digite seu usuário");
		usuario = leitor.next();
		System.out.println("Digite sua senha");
		senha = leitor.next();

		if(FuncoesAgendamento.login(usuario, senha)){
			System.out.println("Login bem sucedido!");
		}else {
			System.out.println("Usuário ou senha incorretos.");
			System.exit(1);
		}
		
		
		
		while(opcao!=4) {
			FuncoesAgendamento.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				//Digitar todos os 10 horários de agendamento disponíveis para o dia
				
				//Dentro do loop que solicita a digitação de cada horário, chamar a seguinte função para cada horário digitado
				FuncoesAgendamento.inserirHorario(agendamentos, horarioDigitado);
				break;
				
			case 2:
				//Digitar um horário de agendamento desejado. Se estiver disponível, solicitar o nome do cliente e substituir no vetor o horário original por horário + nome do cliente
				//Fazer a verificação com a seguinte funcao
				//FuncoesAgendamento.verificaDisponibilidade(agendamentos, horarioDesejado)
				
				//Fazer a substituição com a seguinte função
				FuncoesAgendamento.agendar(agendamentos, horarioDesejado, nomeCliente);
				
				break;
				
			case 3:
				//Exibir a agenda completa
				FuncoesAgendamento.exibirAgenda(agendamentos);
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

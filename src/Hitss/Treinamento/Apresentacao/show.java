package Hitss.Treinamento.Apresentacao;
/// *** Pacote Principal do Programa
import java.util.Scanner; /// *** Assembly do Programa

public class show { /// *** A Classe onde est� o main
	public static void main(String[] args) { /// *** O M�todo do Main
		System.out.println(""); /// *** Pula 1 linha para o enunciado n�o ficar muito em cima
		System.out.println("         Hitss Treinamento"); /// *** Enunciado do Programa
		System.out.println(""); /// *** Pula 1 linha
		try { /// *** Inicializa��o do Tratamento
			Scanner teclado = new Scanner(System.in); /// *** Comando para Digitar o Valor pelo Teclado
			Integer senha; /// *** Vari�vel Senha
			do { /// *** Inicializa��o do Comando do While
				
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("Digite a senha:"); /// *** O Programa pedepara digitar a senha
				System.out.println(""); /// *** O Programa pede para pular a linha
				senha = teclado.nextInt(); /// *** O Comando para digitar o valor pelo teclado
				if (senha == 1234) { /// *** Se a senha for igual a 1234
					System.out.println(""); /// *** Pula 1 linha
					System.out.println("Senha correta"); /// *** O Programa informa que a senha est� correta
				} else { 
				System.out.println("");
				System.out.println("Senha incorreta.");
				System.out.println("");
				}
				
			} while (senha != 1234);
			
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}

package executavel;

import javax.swing.JOptionPane;

import classes.Diretor;
import classes.Secretario;
import classesauxiliares.FuncaoAutenticacao;

/*Testando autenticação do Secretário*/
public class TestandoSecretario {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");

		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {
			JOptionPane.showMessageDialog(null, "Acesso permitido!");
			JOptionPane.showMessageDialog(null, "Escolha uma das opções abaixo:");
		}

		else {
			JOptionPane.showMessageDialog(null, "Acesso negado!");
		}
	}

}

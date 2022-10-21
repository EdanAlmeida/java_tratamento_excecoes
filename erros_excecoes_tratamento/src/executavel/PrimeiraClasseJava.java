package executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Diretor;
import classes.Disciplina;
import classesauxiliares.FuncaoAutenticacao;
import constantes.StatusAluno;

public class PrimeiraClasseJava {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		try {
		
			new File("arquivo.txt");

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");

		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {
			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * é uma lista que dentro dela temos uma chave que identifica uma sequêancia de
			 * valores também
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 1; qtd++) {
				/* new Aluno() é uma instância (Criação de objeto) */
				/* aluno1 é uma referência para o objeto aluno */

				String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + ": ");
				String idade = JOptionPane.showInputDialog("Idade do aluno: ");

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				aluno1.setIdade(Integer.valueOf(idade));

				for (int pos = 1; pos <= 1; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Disciplina " + pos + ": ");
					String notaDisciplina = JOptionPane.showInputDialog("Nota " + pos + ": ");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

				if (escolha == 0) {
					int continuarRemover = 0;
					int posicao = 1;

					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4: ");
						System.out.println(aluno1.getDisciplinas()
								.remove(Integer.valueOf(disciplinaRemover).intValue() - posicao));
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}
				}

				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {

				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else if ((aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO))) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("====================LISTA DOS APROVADOS =====================");

			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome: " + aluno.getNome() + " | Resultado = " + aluno.getAlunoAprovado()
						+ " | Média: " + aluno.getMediaNota());
			}

			System.out.println("====================LISTA DOS REPROVADOS =====================");

			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno.getNome() + " | Resultado = " + aluno.getAlunoAprovado()
						+ " | Média: " + aluno.getMediaNota());
			}

			System.out.println("====================LISTA DOS ALUNOS EM RECUPERAÇÃO =====================");

			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome: " + aluno.getNome() + " | Resultado = " + aluno.getAlunoAprovado()
						+ " | Média: " + aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso negado! ");
		}

		}catch (NumberFormatException e) { /*sempre imprimir o log no console*/
			e.printStackTrace(); /*imprime o erro no console Java*/
			
			/*Mensagem do erro ou causa*/
			System.out.println("Mensagem: " + e.getMessage());
			
			/*Varrendo um array*/
			for (int i = 0; i < e.getStackTrace().length; i++) {
				System.out.println(e.getStackTrace()[i]);
			}
			
			
			
			JOptionPane.showMessageDialog(null, "Erro de conversão de número.");
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Null Pointer Exception.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

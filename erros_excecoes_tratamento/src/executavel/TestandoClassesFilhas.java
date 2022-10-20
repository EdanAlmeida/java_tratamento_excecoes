package executavel;

import classes.Aluno;
import classes.Diretor;
import classes.Pessoa;
import classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Edan");
		aluno1.setIdade(16);
		
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Cesar");
		diretor1.setIdade(50);
		
		Secretario secretario1 = new Secretario();
		secretario1.setNome("Maria");
		secretario1.setIdade(27);
		
		System.out.println("Aluno: " + aluno1);
		System.out.println("Diretor: " + diretor1);
		System.out.println("Secretario: " + secretario1);
		
		System.out.println(aluno1.pessoaMaiorIdade() + " " + aluno1.msgMaiorIdade());
		System.out.println(diretor1.pessoaMaiorIdade());
		System.out.println(secretario1.pessoaMaiorIdade());
		System.out.println("");
		System.out.println("Salário Aluno: " + aluno1.Salario());
		System.out.println("Salário Diretor: " + diretor1.Salario());
		System.out.println("Salário Secretário: " + secretario1.Salario());
	
		/*Polimorfismo -> Aceita todos pq são pessoas - tratamento*/
		teste(aluno1);
		teste(diretor1);
		teste(secretario1);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais: " + pessoa.getNome() + "| Salario: " 
		+ pessoa.Salario());
	}
	
}

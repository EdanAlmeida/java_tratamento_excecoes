package classes;

import java.util.Objects;

/* Essa classe Disciplina servirá para todos os objetos e instâncias de notas e matérias */
public class Disciplina {

	/* Atributos */
	double nota;
	String disciplina;

	/* Getters and Setters */

	/* Equals and Hashcode */
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	/* To String */
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	 Aluno[] alunos;
	 Avaliacao[] avaliacoes;
	 String disciplina;
	 
	 public Avaliacao[] getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Avaliacao[] avaliacoes) {
		this.avaliacoes = avaliacoes;
	}


	public Turma(Aluno[] alunos, Avaliacao[] avaliacoes, String disciplina) {
			this.alunos = alunos;
			this.avaliacoes = avaliacoes;
			this.disciplina = disciplina;
	}
	 
	 
	 public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public List<Double> mediaDasAvaliacoes() {
		 double soma = 0.0;
		 List<Double> notas = new ArrayList();
		 for(int i = 0; i < avaliacoes.length; i++) {
			 Avaliacao avaliacao = avaliacoes[i];
			 avaliacao.getNotas();
			 for(double notaDoAluno: avaliacao.getNotas().values()) {
					soma += notaDoAluno;
				}
				notas.add(soma / avaliacao.getNotas().size());
				soma = 0.0;
		 }
		 
		 return notas;
	}
	
	
	public void notaPorAvaliacao() {
		for (int j = 0; j < avaliacoes.length; j++) {
			for (int i = 0; i< alunos.length; i++) {
				avaliacoes[j].setNotasPorAluno(alunos[i], geraNotaAleatoria());
			}
		}
	}

	private double geraNotaAleatoria() {
		double range = (10.0 - 0.0) + 1;
		double value = (Math.random() * range) + 0.0;
		return value;
	}

		
}

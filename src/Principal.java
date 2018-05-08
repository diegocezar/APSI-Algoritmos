


public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", "123");
		Aluno aluno2 = new Aluno("Maria", "321");
		Aluno aluno3 = new Aluno("José", "000");
		Aluno aluno4 = new Aluno("Thaís", "111");
		Aluno aluno5 = new Aluno("Mario", "222");
		
		Aluno [] alunos = {aluno1, aluno2, aluno3, aluno4, aluno5};
		
		Avaliacao [] avaliacoesQuimica = {new Avaliacao(), new Avaliacao(), new Avaliacao()};
		Avaliacao [] avaliacoesHistoria = {new Avaliacao(), new Avaliacao(), new Avaliacao()};
		Avaliacao [] avaliacaoMatematica = {new Avaliacao(), new Avaliacao(), new Avaliacao()};
		Avaliacao [] avaliacoesGeografia = {new Avaliacao(), new Avaliacao(), new Avaliacao()};
		Avaliacao [] avaliacoesFisica = {new Avaliacao(), new Avaliacao(), new Avaliacao()};
		
		Turma geografia = new Turma(alunos, avaliacoesGeografia, "Geografia");
		Turma matematica = new Turma(alunos, avaliacaoMatematica, "Matemática");
		Turma historia = new Turma(alunos, avaliacoesHistoria, "História");
		Turma quimica = new Turma(alunos, avaliacoesQuimica, "Química");
		Turma fisica = new Turma(alunos, avaliacoesFisica, "Física");
		
		
		geografia.notaPorAvaliacao();
		historia.notaPorAvaliacao();
		matematica.notaPorAvaliacao();
		quimica.notaPorAvaliacao();
		fisica.notaPorAvaliacao();
		
		
		
		System.out.println("---TURMA DE GEOGRAFIA---");
		System.out.println(geografia.getDisciplina());
		for (double media: geografia.mediaDasAvaliacoes()) {
			System.out.println(String.format( "%.2f", media));
		}
		
		System.out.println("---TURMA DE HISTÓRIA---");
		System.out.println(historia.getDisciplina());
		for (double media: historia.mediaDasAvaliacoes()) {
			System.out.println(String.format( "%.2f", media));
		}
		
		System.out.println("---TURMA DE MATEMÁTICA---");
		System.out.println(matematica.getDisciplina());
		for (double media: matematica.mediaDasAvaliacoes()) {
			System.out.println(String.format( "%.2f", media));
		}
		
		
		System.out.println("---TURMA DE QUÍMICA---");
		System.out.println(quimica.getDisciplina());
		for (double media: quimica.mediaDasAvaliacoes()) {
			System.out.println(String.format( "%.2f", media));
		}
		System.out.println("---TURMA DE FÍSICA--");
		System.out.println(fisica.getDisciplina());
		for (double media: fisica.mediaDasAvaliacoes()) {
			System.out.println(String.format( "%.2f", media));
		}
	}
	
}

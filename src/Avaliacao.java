import java.util.HashMap;


public class Avaliacao {
	HashMap<Aluno, Double> notas;
	String data;
	
	public Avaliacao () {
		this.notas = new HashMap<Aluno, Double>();
	}
	
	public HashMap<Aluno, Double> getNotas() {
		return notas;
	}
	public void setNotasPorAluno(Aluno aluno, double nota) {
		notas.put(aluno, nota);
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}


	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

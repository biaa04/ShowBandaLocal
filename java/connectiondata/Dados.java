package connectiondata;

import java.util.Calendar;

public class Dados {
	private String nome;
	private String genero;
	private String localidade;
	private Long capacidade;
	private Calendar data; 
	
	public String getNome() {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	public String getLocalidade() {
		return localidade;
		
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data= data;
	}
	
	public Long getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Long capacidade) {
		this.capacidade = capacidade;
	}
	
}

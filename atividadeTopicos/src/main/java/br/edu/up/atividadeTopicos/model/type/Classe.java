package br.edu.up.atividadeTopicos.model.type;

public enum Classe {
	
	CAVALEIRO(1, "Cavaleiro"),
	ARQUEIRO(2, "Arqueiro"),
	MAGO(3, "Mago"),
	BARBARO(4, "Barbáro"),
	LADINO(5, "Ladino");

	private final Integer valor;
	private final String descricao;

	Classe(Integer valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public Integer getValor() {
		return this.valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Classe getType(Integer value) {
		for (Classe type : Classe.values()) {
			if (value.equals(type.getValor())) {
				return type;
			}
		}
		return null;
	}

	public Classe[] getValues() {
		return Classe.values();
	}
}

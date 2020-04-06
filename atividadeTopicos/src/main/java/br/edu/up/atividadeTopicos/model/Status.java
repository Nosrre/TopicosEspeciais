package br.edu.up.atividadeTopicos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Status")
@Getter @Setter
public class Status {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="ataque")
	private int atk;
	
	@Column(name="defesa")
	private int def;
	
	@Column(name="agilidade")
	private int agi;
	
	@Column(name="inteligencia")
	private int intel;
	
	@Column(name="arcano")
	private int arc;
	
    @OneToOne(mappedBy = "Status")
    private Personagem personagem;
	
}

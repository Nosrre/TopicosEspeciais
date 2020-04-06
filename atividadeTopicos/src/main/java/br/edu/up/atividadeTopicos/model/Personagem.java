package br.edu.up.atividadeTopicos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.up.atividadeTopicos.model.type.Classe;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Personagem")
@Getter @Setter
public class Personagem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="nome")
	private String genero;
	
	@Column(name="nome")
	private String especie;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id", referencedColumnName = "id")
	private Status status;
    
    @Enumerated(EnumType.ORDINAL)
    private Classe classe;
	
}

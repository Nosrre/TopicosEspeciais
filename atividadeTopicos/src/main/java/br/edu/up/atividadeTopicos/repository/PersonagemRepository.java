package br.edu.up.atividadeTopicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.up.atividadeTopicos.model.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
	
	@Query("Select p From Personagem Where p.nome = ?")
	List<Personagem> buscarPersonagemPorNome(String nome);
	
	@Query("Select p From Personagem Where p.classe = ?")
	List<Personagem> buscarPersonagemPorClasse(Integer idClasse);
	
}

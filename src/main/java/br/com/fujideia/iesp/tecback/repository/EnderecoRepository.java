package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {
}

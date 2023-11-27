package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletoRepository extends JpaRepository<Boleto,Integer> {
}

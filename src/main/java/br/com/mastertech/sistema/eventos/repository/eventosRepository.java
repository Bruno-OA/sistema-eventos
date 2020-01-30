package br.com.mastertech.sistema.eventos.repository;

import br.com.mastertech.sistema.eventos.model.eventosModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface eventosRepository extends CrudRepository<eventosModel, String> {

    Optional<eventosModel> findByNome(String nome);
}

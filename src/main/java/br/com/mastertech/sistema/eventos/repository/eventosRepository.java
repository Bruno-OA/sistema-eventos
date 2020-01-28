package br.com.mastertech.sistema.eventos.repository;

import br.com.mastertech.sistema.eventos.model.eventosModel;
import org.springframework.data.repository.CrudRepository;

public interface eventosRepository extends CrudRepository<eventosModel, String> {
}

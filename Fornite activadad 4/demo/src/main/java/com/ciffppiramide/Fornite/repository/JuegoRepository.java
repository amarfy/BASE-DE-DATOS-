package com.ciffppiramide.Fornite.repository;
import com.ciffppiramide.Fornite.clases.Juego;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JuegoRepository extends CrudRepository<Juego,Long> {
List<Juego> findAll();
}

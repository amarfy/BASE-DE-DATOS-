package com.ciffppiramide.Fornite.repository;

import com.ciffppiramide.Fornite.clases.Tarjeta_Credito;
import com.ciffppiramide.Fornite.clases.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TarjetaRepository extends CrudRepository<Tarjeta_Credito,Long> {

    List<Tarjeta_Credito> findAll();
}

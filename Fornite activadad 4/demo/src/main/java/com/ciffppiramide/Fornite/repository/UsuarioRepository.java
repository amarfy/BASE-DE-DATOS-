package com.ciffppiramide.Fornite.repository;
import com.ciffppiramide.Fornite.clases.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

    List<Usuario> findAll();
}

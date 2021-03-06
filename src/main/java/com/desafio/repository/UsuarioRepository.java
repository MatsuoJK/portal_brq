package com.desafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desafio.model.Usuario;

@Repository 
public interface UsuarioRepository extends CrudRepository<Usuario, String> {

    Usuario findByEmail(String email);
}

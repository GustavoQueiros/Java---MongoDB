package com.javamongo.mongodb.repository;

import com.javamongo.mongodb.document.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}

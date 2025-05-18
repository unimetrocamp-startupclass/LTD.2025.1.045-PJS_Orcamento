package com.pjs.orcamento.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pjs.orcamento.entidades.usuario.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, ObjectId>
{

}

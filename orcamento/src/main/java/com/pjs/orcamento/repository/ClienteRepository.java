package com.pjs.orcamento.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pjs.orcamento.entidades.usuario.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, ObjectId>
{}

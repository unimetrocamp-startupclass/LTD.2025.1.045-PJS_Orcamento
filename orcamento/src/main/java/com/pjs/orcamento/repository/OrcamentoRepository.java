package com.pjs.orcamento.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pjs.orcamento.entidades.orcamento.Orcamento;

@Repository
public interface OrcamentoRepository extends MongoRepository<Orcamento, ObjectId>
{

}

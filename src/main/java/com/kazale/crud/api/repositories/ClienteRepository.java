package com.kazale.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kazale.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}

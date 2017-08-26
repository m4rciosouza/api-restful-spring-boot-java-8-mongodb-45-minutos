package com.kazale.crud.api.services;

import java.util.List;

import com.kazale.crud.api.documents.Cliente;

public interface ClienteService {
	
	List<Cliente> listarTodos();
	
	Cliente listarPorId(String id);
	
	Cliente cadastrar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void remover(String id);

}

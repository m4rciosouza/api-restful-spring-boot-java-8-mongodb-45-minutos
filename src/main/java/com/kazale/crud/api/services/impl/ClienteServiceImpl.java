package com.kazale.crud.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.crud.api.documents.Cliente;
import com.kazale.crud.api.repositories.ClienteRepository;
import com.kazale.crud.api.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRespository;

	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRespository.findAll();
	}

	@Override
	public Cliente listarPorId(String id) {
		return this.clienteRespository.findOne(id);
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRespository.delete(id);
	}

}

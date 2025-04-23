package com.project.ClientManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ClientManagement.dao.daointerface;
import com.project.ClientManagement.entity.Client;

@Service
public class serviceImpl implements serviceInterface{
	@Autowired
	private daointerface dao;
	public List<Client> getAllClients() {
		return dao.findAll();
	}
	@Override
	public void saveClient(Client client) {
		dao.save(client);
		
	}

	@Override
	public void updateClient(Client client) {
		dao.save(client);
		
	}
	@Override
	public Client getClient(Long id) {
		return dao.findById(id).get();
		
	}
	@Override
	public void deleteClient(Long id) {
		dao.deleteById(id);
		
	}

}

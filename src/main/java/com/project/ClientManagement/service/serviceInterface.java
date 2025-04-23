package com.project.ClientManagement.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.project.ClientManagement.entity.Client;

@Service
public interface serviceInterface {
	public   List<Client> getAllClients();
	public void saveClient(Client client);
	public void updateClient(Client client);
	public Client getClient(Long id);
	public void deleteClient(Long id);
}

package com.project.ClientManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.project.ClientManagement.entity.Client;
import com.project.ClientManagement.service.serviceInterface;

@Controller
public class controllerClass {
	@Autowired
	private serviceInterface service;
	
	@GetMapping("/clients")
	public String listClients(Model model) {
		 model.addAttribute("clients", service.getAllClients());
		 return "clients";
	}
	@GetMapping("/clients/new")
	public String addclient(Model model) {
		Client client=new Client();
		model.addAttribute("client", client);
		return "add_client";
	}
	@PostMapping("/clients")
	public String saveClient(@ModelAttribute("client") Client client) {
		service.saveClient(client);
		return "redirect:/clients";
	}
	@GetMapping("/clients/update/{id}")
	public String editClient(@PathVariable Long id, Model model) {
		model.addAttribute("client", service.getClient(id));
		return "update_client";
	}
	@PostMapping("/clients/{id}")
	public String updateClient(@PathVariable Long id, @ModelAttribute("client") Client client ,Model model) {
		Client temp=service.getClient(id);
		temp.setId(client.getId());
		temp.setFirstName(client.getFirstName());
		temp.setLastName(client.getLastName());
		temp.setEmail(client.getEmail());
		service.updateClient(temp);
		return "redirect:/clients";
	}
	@GetMapping("/clients/{id}")
	public String deleteClient(@PathVariable Long id) {
		service.deleteClient(id);
		return"redirect:/clients";
	}
}

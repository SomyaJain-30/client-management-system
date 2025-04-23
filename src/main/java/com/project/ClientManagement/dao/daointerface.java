package com.project.ClientManagement.dao;
import com.project.ClientManagement.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface daointerface extends JpaRepository<Client, Long>{

}

package com.Adriano.Lombok.PrjLombok.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Adriano.Lombok.PrjLombok.entities.Usuario;

public interface Repository extends JpaRepository<Usuario, Long>{

}
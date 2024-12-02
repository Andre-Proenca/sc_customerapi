package com.softcraft.sccustomerapi.repositories;

import com.softcraft.sccustomerapi.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

package com.softcraft.sccustomerapi.controllers;

import com.softcraft.sccustomerapi.dto.ClientDTO;
import com.softcraft.sccustomerapi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        ClientDTO dto= clientService.findById(id);
        return dto;
    }
}

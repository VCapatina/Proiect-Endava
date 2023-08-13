package com.endava.coffeeshop.Client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "CoffeeShop/Client")

public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {

        this.clientService = clientService;
    }

    @GetMapping("/getClientById")
    public Client getClientById(Integer id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/allClients")
    public ResponseEntity<List<Client>> getClients() {
        List<Client> clients= null;
       clients = clientService.getAllClients();
        return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
    }

    @PostMapping("/addOrUpdateClient")
    public ResponseEntity<Client> addOrUpdate(@RequestBody Client client) {
        Client clients = null;
        try {

            clients = clientService.addOrUpdateClient(client);

        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Client>(clients, HttpStatus.OK);
    }

    @DeleteMapping("/deleteClient")
    public Client deleteClient(Integer id) throws Exception {
        return clientService.deleteClient(id);


    }
}



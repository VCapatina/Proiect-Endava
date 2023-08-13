package com.endava.coffeeshop.Comanda;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "CoffeeShop/Comanda")

public class ComandaController {

    private ComandaService comandaService;

    @Autowired
    public ComandaController(ComandaService comandaService) {

        this.comandaService =comandaService;
    }
    @GetMapping("/allComenzi")
    public ResponseEntity<List<Comanda>> getComanda() {
        List<Comanda> comenzi= null;
        comenzi = comandaService.getAllComanda();
        return new ResponseEntity<List<Comanda>>(comenzi, HttpStatus.OK);
    }
    @GetMapping("/getClientById")
    public Comanda getClientById(Integer id) {
        return comandaService.getComandaById(id);
    }


    @PostMapping("/addOrUpdateClient")
    public ResponseEntity<Comanda> addOrUpdate(@RequestBody Comanda comanda) {
        Comanda comenzi = null;
        try {

           comenzi = comandaService.addOrUpdateComanda(comanda);

        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Comanda>(comenzi, HttpStatus.OK);
    }

    @DeleteMapping("/deleteClient")
    public Comanda deleteComanda(Integer id) throws Exception {
        return comandaService.deleteComanda(id);


    }
}

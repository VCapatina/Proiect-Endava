package com.endava.coffeeshop.Ingrediente;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "CoffeeShop/Ingrediente")

public class IngredienteController {

    private IngredienteService ingredienteService;

    @Autowired
    public IngredienteController(IngredienteService ingredienteService) {

        this.ingredienteService = ingredienteService;
    }

    @GetMapping("/getIngredienteById")
    public Ingrediente getIngredienteById(Integer id) {
        return ingredienteService.getIngredienteById(id);
    }

    @GetMapping("/allIngrediente")
    public ResponseEntity<List<Ingrediente>> getIngrediente() {
        List<Ingrediente> ingredient= null;
        ingredient = ingredienteService.getAllIngrediente();
        return new ResponseEntity<List<Ingrediente>>(ingredient, HttpStatus.OK);
    }

    @PostMapping("/addOrUpdateIngrediente")
    public ResponseEntity<Ingrediente> addOrUpdate(@RequestBody Ingrediente ingrediente) {
        Ingrediente ingredient= null;
        try {

            ingredient = ingredienteService.addOrUpdateIngrediente(ingrediente);

        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Ingrediente>(ingrediente, HttpStatus.OK);
    }

    @DeleteMapping("/deleteIngrediente")
    public Ingrediente deleteIngrediente(Integer id) throws Exception {
        return ingredienteService.deleteIngrediente(id);


    }
}



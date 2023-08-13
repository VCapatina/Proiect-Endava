package com.endava.coffeeshop.Legatura_Comanda_Ingrediente;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "CoffeeShop/Legatura_Comanda_Ingrediente")

public class Legatura_Comanda_IngredienteController {

    private Legatura_Comanda_IngredienteService legatura_Comanda_IngredienteService;

    @Autowired
    public Legatura_Comanda_IngredienteController(Legatura_Comanda_IngredienteService legatura_Comanda_IngredienteService) {

        this.legatura_Comanda_IngredienteService = legatura_Comanda_IngredienteService;
    }

    @GetMapping("/getLegatura_Comanda_IngredienteById")
    public Legatura_Comanda_Ingrediente getLegatura_Comanda_IngredienteById(Integer id) {
        return legatura_Comanda_IngredienteService.getLegatura_Comanda_IngredienteById(id);
    }

    @GetMapping("/allLegatura_Comanda_Ingrediente")
    public ResponseEntity<List<Legatura_Comanda_Ingrediente>> getLegatura_Comanda_Ingrediente() {
        List<Legatura_Comanda_Ingrediente> legatura_Comanda_Ingredients= null;
        legatura_Comanda_Ingredients = legatura_Comanda_IngredienteService.getAllLegatura_Comanda_Ingrediente();
        return new ResponseEntity<List<Legatura_Comanda_Ingrediente>>(legatura_Comanda_Ingredients, HttpStatus.OK);
    }

    @PostMapping("/addOrUpdateLegatura_Comanda_Ingrediente")
    public ResponseEntity<Legatura_Comanda_Ingrediente> addOrUpdate(@RequestBody Legatura_Comanda_Ingrediente legatura_Comanda_Ingrediente) {
        Legatura_Comanda_Ingrediente legatura_Comanda_Ingredients = null;
        try {

            legatura_Comanda_Ingredients = legatura_Comanda_IngredienteService.addOrUpdateLegatura_Comanda_Ingrediente(legatura_Comanda_Ingrediente);

        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Legatura_Comanda_Ingrediente>(legatura_Comanda_Ingrediente, HttpStatus.OK);
    }

    @DeleteMapping("/deleteLegatura_Comanda_Ingrediente")
    public Legatura_Comanda_Ingrediente deleteLegatura_Comanda_Ingrediente(Integer id) throws Exception {
        return legatura_Comanda_IngredienteService.deleteLegatura_Comanda_Ingrediente(id);


    }
}



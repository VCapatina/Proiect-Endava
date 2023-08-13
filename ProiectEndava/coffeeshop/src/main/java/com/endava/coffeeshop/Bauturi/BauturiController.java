package com.endava.coffeeshop.Bauturi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "CoffeeShop/Bauturi")

public class BauturiController {

    private BauturiService bauturiService;

    @Autowired
    public BauturiController(BauturiService bauturiService) {

        this.bauturiService = bauturiService;
    }

    @GetMapping("/getBauturiById")
    public Bauturi getBauturiById(Integer id) {
        return bauturiService.getBauturiById(id);
    }

    @GetMapping("/allBauturi")
    public ResponseEntity<List<Bauturi>> getBauturi() {
        List<Bauturi> bautura= null;
        bautura = bauturiService.getAllBauturi();
        return new ResponseEntity<List<Bauturi>>(bautura, HttpStatus.OK);
    }

    @PostMapping("/addOrUpdateBauturi")
    public ResponseEntity<Bauturi> addOrUpdate(@RequestBody Bauturi bauturi) {
        Bauturi bautura = null;
        try {

            bautura = bauturiService.addOrUpdateBauturi(bauturi);

        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Bauturi>(bauturi, HttpStatus.OK);
    }

    @DeleteMapping("/deleteBauturi")
    public Bauturi deleteBauturi(Integer id) throws Exception {
        return bauturiService.deleteBauturi(id);


    }
}



package com.endava.coffeeshop.Ingrediente;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;




    public Ingrediente getIngredienteById(Integer id){
        return ingredienteRepository.findById(id).orElse(null);
    }



    public  Ingrediente addOrUpdateIngrediente(Ingrediente ingrediente){
        return ingredienteRepository.save(ingrediente);
    }
    public List<Ingrediente> getAllIngrediente() {
        return (List<Ingrediente>) ingredienteRepository.findAll();
    }


    public  Ingrediente deleteIngrediente(Integer id) throws Exception {
        Ingrediente deleteIngrediente = null;
        try{

            deleteIngrediente = ingredienteRepository.findById(id).orElse(null);
            if (deleteIngrediente == null)
            {
                throw new Exception("Ingredient does not exist");
            }else{
                ingredienteRepository.deleteById(id);
            }

        } catch (Exception ex){
            throw ex;
        }
        return deleteIngrediente;
    }

}

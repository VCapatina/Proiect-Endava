package com.endava.coffeeshop.Legatura_Comanda_Ingrediente;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Legatura_Comanda_IngredienteService {

    @Autowired
    private Legatura_Comanda_IngredienteRepository legatura_Comanda_IngredienteRepository;




    public Legatura_Comanda_Ingrediente getLegatura_Comanda_IngredienteById(Integer id){
        return legatura_Comanda_IngredienteRepository.findById(id).orElse(null);
    }



    public  Legatura_Comanda_Ingrediente addOrUpdateLegatura_Comanda_Ingrediente(Legatura_Comanda_Ingrediente legatura_Comanda_Ingrediente){
        return legatura_Comanda_IngredienteRepository.save(legatura_Comanda_Ingrediente);
    }
    public List<Legatura_Comanda_Ingrediente> getAllLegatura_Comanda_Ingrediente() {
        return (List<Legatura_Comanda_Ingrediente>) legatura_Comanda_IngredienteRepository.findAll();
    }


    public Legatura_Comanda_Ingrediente deleteLegatura_Comanda_Ingrediente(Integer id) throws Exception {
        Legatura_Comanda_Ingrediente deleteLegatura_Comanda_Ingrediente = null;
        try{

            deleteLegatura_Comanda_Ingrediente = legatura_Comanda_IngredienteRepository.findById(id).orElse(null);
            if (deleteLegatura_Comanda_Ingrediente == null)
            {
                throw new Exception("nu exista legatura");
            }else{
                legatura_Comanda_IngredienteRepository.deleteById(id);
            }

        } catch (Exception ex){
            throw ex;
        }
        return deleteLegatura_Comanda_Ingrediente;
    }

}

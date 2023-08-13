package com.endava.coffeeshop.Comanda;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ComandaService {



        @Autowired
        private ComandaRepository comandaRepository;




        public Comanda getComandaById(Integer id){
            return comandaRepository.findById(id).orElse(null);
        }



        public  Comanda addOrUpdateComanda(Comanda comanda){
            return comandaRepository.save(comanda);
        }

    public List<Comanda> getAllComanda() {
        return (List<Comanda>) comandaRepository.findAll();
    }


    public  Comanda deleteComanda(Integer id) throws Exception {
            Comanda deleteComanda = null;
            try{

                deleteComanda = comandaRepository.findById(id).orElse(null);
                if (deleteComanda== null)
                {
                    throw new Exception("Comanda nu exista");
                }else{
                   comandaRepository.deleteById(id);
                }

            } catch (Exception ex){
                throw ex;
            }
            return deleteComanda;
        }

    }



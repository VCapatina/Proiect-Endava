package com.endava.coffeeshop.Bauturi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BauturiService {

    @Autowired
    private BauturiRepository bauturiRepository;




    public Bauturi getBauturiById(Integer id){
        return bauturiRepository.findById(id).orElse(null);
    }



    public  Bauturi addOrUpdateBauturi(Bauturi bauturi){
        return bauturiRepository.save(bauturi);
    }
    public List<Bauturi> getAllBauturi() {
        return (List<Bauturi>) bauturiRepository.findAll();
    }


    public  Bauturi deleteBauturi(Integer id) throws Exception {
        Bauturi deleteBauturi = null;
        try{

            deleteBauturi = bauturiRepository.findById(id).orElse(null);
            if (deleteBauturi == null)
            {
                throw new Exception("Drink does not exist");
            }else{
                bauturiRepository.deleteById(id);
            }

        } catch (Exception ex){
            throw ex;
        }
        return deleteBauturi;
    }

}

package com.endava.coffeeshop.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;




    public Client getClientById(Integer id){
        return clientRepository.findById(id).orElse(null);
    }

    public List<Client> getAllClients() {
        return (List<Client>) clientRepository.findAll();
    }


    public  Client addOrUpdateClient(Client client){
        return clientRepository.save(client);
    }


    public  Client deleteClient(Integer id) throws Exception {
        Client deleteClient = null;
        try{

            deleteClient = clientRepository.findById(id).orElse(null);
            if (deleteClient == null)
            {
                throw new Exception("Client does not exist");
            }else{
                clientRepository.deleteById(id);
            }

        } catch (Exception ex){
            throw ex;
        }
        return deleteClient;
    }

}

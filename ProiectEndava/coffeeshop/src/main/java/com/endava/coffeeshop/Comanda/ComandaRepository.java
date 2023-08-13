package com.endava.coffeeshop.Comanda;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComandaRepository extends CrudRepository<Comanda,Integer> {



}
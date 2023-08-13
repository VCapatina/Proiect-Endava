package com.endava.coffeeshop.Bauturi;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BauturiRepository extends JpaRepository<Bauturi,Integer> {
}
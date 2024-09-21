package com.example.commande.dao;

import com.example.commande.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Long> {
       Commande findByRef(String ref);
       int deleteByRef(String ref);
        Commande findByCode(String code);
       int deleteByCode(String code);
       List<Commande> findByRefLikeAndTotalGreaterThan(String ref , double total);

}

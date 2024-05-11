package com.example.commande.dao;

import com.example.commande.bean.Commande;
import com.example.commande.bean.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {
    Paiement findByCode(String code);

    int deleteByCode(String code);

    //ref(commande) ====== delete paiement :: PaiementDao
    int deleteByCommandeRef(String ref);

    List<Paiement> findByCommandeRef(String ref);
}

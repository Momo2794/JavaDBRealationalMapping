package com.webapp.dbRelationalMapping.repository;

import com.webapp.dbRelationalMapping.entity.Purchaseorder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseorderRepo extends JpaRepository<Purchaseorder, Long> {

}

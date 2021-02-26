package com.webapp.dbRelationalMapping.repository;

import com.webapp.dbRelationalMapping.entity.Shopaccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopaccountRepo extends JpaRepository<Shopaccount, Long> {

}

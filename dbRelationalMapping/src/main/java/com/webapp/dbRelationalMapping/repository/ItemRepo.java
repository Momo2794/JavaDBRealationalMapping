package com.webapp.dbRelationalMapping.repository;

import com.webapp.dbRelationalMapping.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {

}

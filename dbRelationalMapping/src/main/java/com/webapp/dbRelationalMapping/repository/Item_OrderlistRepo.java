package com.webapp.dbRelationalMapping.repository;

import com.webapp.dbRelationalMapping.entity.Item_Orderlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Item_OrderlistRepo extends JpaRepository<Item_Orderlist, Long> {

}

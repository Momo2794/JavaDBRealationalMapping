package com.webapp.dbRelationalMapping.repository;

import com.webapp.dbRelationalMapping.entity.Eaccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EaccountRepo extends JpaRepository<Eaccount, Long> {

}

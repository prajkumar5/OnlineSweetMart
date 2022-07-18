package com.cg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.entity.SweetOrder;

@Repository
public interface SweetOrderRepository extends JpaRepository<SweetOrder, Integer> {

}

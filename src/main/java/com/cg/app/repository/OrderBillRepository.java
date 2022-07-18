package com.cg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.entity.OrderBill;

@Repository
public interface OrderBillRepository extends JpaRepository<OrderBill, Integer> {

}

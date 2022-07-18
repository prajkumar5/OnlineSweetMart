package com.cg.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.entity.SweetItem;

@Repository
public interface SweetItemRepository extends JpaRepository<SweetItem, Integer>{

}

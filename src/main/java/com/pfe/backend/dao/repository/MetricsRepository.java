package com.pfe.backend.dao.repository;


import com.pfe.backend.dao.entity.Metrics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MetricsRepository extends JpaRepository<Metrics,Long> {
   Metrics findFirstByOrderByIdDesc();
}

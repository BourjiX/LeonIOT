package com.pfe.backend.dao.impl;

import com.pfe.backend.dao.entity.Metrics;
import com.pfe.backend.dao.MetricsDao;
import com.pfe.backend.dao.repository.MetricsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MetricsDaoImpl implements MetricsDao {
    private final MetricsRepository metricsRepository;

    @Override
    public Metrics add(Metrics metrics) {
        return metricsRepository.save(metrics);
    }

    @Override
    public List<Metrics> findAll() {
        return metricsRepository.findAll();
    }

    @Override
    public Metrics findLatest() {
        return metricsRepository.findFirstByOrderByIdDesc();
    }
}

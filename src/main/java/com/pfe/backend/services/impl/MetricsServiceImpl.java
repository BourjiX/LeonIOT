package com.pfe.backend.services.impl;

import com.pfe.backend.dao.MetricsDao;
import com.pfe.backend.services.mapper.MetricsMapper;
import com.pfe.backend.services.mapper.UserMapper;
import com.pfe.backend.services.model.MetricsDTO;
import com.pfe.backend.services.MetricsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MetricsServiceImpl implements MetricsService {
    private final MetricsDao metricsDao;

    @Override
    public MetricsDTO add(MetricsDTO metricsDTO) {
        return MetricsMapper.mapToDTO(metricsDao.add(MetricsMapper.mapToEntity(metricsDTO)));
    }

    @Override
    public List<MetricsDTO> findAll() {
        return metricsDao.findAll().stream().map(MetricsMapper::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public MetricsDTO findLatest() {
        return MetricsMapper.mapToDTO(metricsDao.findLatest());
    }


}

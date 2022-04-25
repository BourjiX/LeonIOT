package com.pfe.backend.services.mapper;

import com.pfe.backend.dao.entity.Metrics;

import com.pfe.backend.services.model.MetricsDTO;



public class MetricsMapper {

    public static Metrics mapToEntity(MetricsDTO metricsDTO){
        if (metricsDTO==null){
            return null;
        }
        Metrics metrics =new Metrics();
        metrics.setTemperature(metricsDTO.getTemperature());
        metrics.setDate(metricsDTO.getDate());
        metrics.setTemperature(metricsDTO.getTemperature());
        metrics.setHumidity(metricsDTO.getHumidity());
        metrics.setGaz(metricsDTO.getGaz());
        metrics.setSound(metricsDTO.getSound());
        return metrics;
    }
    public static MetricsDTO mapToDTO(Metrics metrics){
        if (metrics==null){
            return null;
        }
       MetricsDTO metricsDTO =new MetricsDTO();
        metricsDTO.setId(metrics.getId());
        metricsDTO.setDate(metrics.getDate());
        metricsDTO.setTemperature(metrics.getTemperature());
        metricsDTO.setHumidity(metrics.getHumidity());
        metricsDTO.setGaz(metrics.getGaz());
        metricsDTO.setSound(metrics.getSound());
        return metricsDTO;
    }

}

package com.pfe.backend.web;


import com.pfe.backend.services.model.MetricsDTO;
import com.pfe.backend.services.MetricsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/Metrics-resources")
@Tag(name = "Metrics Resource")
public class MetricsController {

        private final MetricsService metricsService;
        @PostMapping("/add")
        public ResponseEntity<MetricsDTO> add(@RequestBody final MetricsDTO metricsDTO) {
            return ResponseEntity.ok(metricsService.add(metricsDTO));
        }
        @GetMapping("/all")
        public ResponseEntity<List<MetricsDTO>> findAll(){
            return ResponseEntity.ok(metricsService.findAll());
        }

        @GetMapping("/findLatest")
        public ResponseEntity<MetricsDTO> findLatest() {
            return ResponseEntity.ok(metricsService.findLatest());
        }


}


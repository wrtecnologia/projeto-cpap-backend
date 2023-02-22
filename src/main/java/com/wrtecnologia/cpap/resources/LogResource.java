package com.wrtecnologia.cpap.resources;

import com.wrtecnologia.cpap.dtos.LogDTO;
import com.wrtecnologia.cpap.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/logs")
public class LogResource {

    @Autowired
    private LogService service;

    @GetMapping
    public Page<LogDTO> findByData(
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate,
            Pageable pageable) {

        Page<LogDTO> page = service.findByData(minDate, maxDate, pageable);

        return ResponseEntity.ok().body(page).getBody();
    }
}

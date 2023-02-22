package com.wrtecnologia.cpap.resources;

import com.wrtecnologia.cpap.dtos.CpapDTO;
import com.wrtecnologia.cpap.services.CpapService;
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
public class CpapResource {

    @Autowired
    private CpapService service;

    @GetMapping
    public Page<CpapDTO> findByData(
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate,
            Pageable pageable) {

        Page<CpapDTO> page = service.findByData(minDate, maxDate, pageable);

        return ResponseEntity.ok().body(page).getBody();
    }
}
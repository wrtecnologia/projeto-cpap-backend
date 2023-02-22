package com.wrtecnologia.cpap.services;

import com.wrtecnologia.cpap.repositories.LogRepository;
import com.wrtecnologia.cpap.dtos.LogDTO;
import com.wrtecnologia.cpap.entities.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class LogService {

    @Autowired
    private LogRepository repository;

    @Transactional
    public Page<LogDTO> findByData(String minDate, String maxDate, Pageable pageable) {

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        Page<Log> page = repository.findByData(min, max, pageable);
        return page.map(LogDTO::new);
    }
}

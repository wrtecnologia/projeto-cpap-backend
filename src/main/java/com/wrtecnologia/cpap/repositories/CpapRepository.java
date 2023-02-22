package com.wrtecnologia.cpap.repositories;

import com.wrtecnologia.cpap.entities.Cpap;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface CpapRepository extends JpaRepository<Cpap, Long> {

    @Query("SELECT obj FROM Cpap obj WHERE obj.data BETWEEN :min AND :max ORDER BY obj.id DESC")
    // Page<Log> findByData(@Param("min") LocalDate min, @Param("max") LocalDate max, Pageable pageable);
    Page<Cpap> findByData(LocalDate min, LocalDate max, Pageable pageable);
}


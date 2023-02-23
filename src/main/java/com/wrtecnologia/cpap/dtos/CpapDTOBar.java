package com.wrtecnologia.cpap.dtos;

import com.wrtecnologia.cpap.entities.Cpap;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class CpapDTOBar implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private LocalDate data;
    private Double eventos_hora;

    private Integer vedacao;
    private LocalTime horas_uso;
    private Integer col_ret_masc;
    private Integer pontuacao;

    public CpapDTOBar() {

    }

    public CpapDTOBar(Long id, LocalDate data, Double eventos_hora, Integer vedacao) { // LocalTime horas_uso, Integer vedacao, Integer col_ret_masc, Integer pontuacao) {
        this.id = id;
        this.data = data;
        this.eventos_hora = eventos_hora;
        this.vedacao = vedacao;
        this.horas_uso = horas_uso;
        this.col_ret_masc = col_ret_masc;
        this.pontuacao = pontuacao;
    }

    public CpapDTOBar(Long id, LocalDate data, Double eventos_hora) {
        this.id = id;
        this.data = data;
        this.eventos_hora = eventos_hora;
    }

    public CpapDTOBar(Cpap entity) {
        id = entity.getId();
        data = entity.getData();
        eventos_hora = entity.getEventos_hora();
        vedacao = entity.getVedacao();
        horas_uso = entity.getHoras_uso();
        col_ret_masc = entity.getCol_ret_masc();
        pontuacao = entity.getPontuacao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getEventos_hora() {
        return eventos_hora;
    }

    public void setEventos_hora(Double eventos_hora) {
        this.eventos_hora = eventos_hora;
    }

    public Integer getVedacao() {
        return vedacao;
    }

    public void setVedacao(Integer vedacao) {
        this.vedacao = vedacao;
    }

    public LocalTime getHoras_uso() {
        return horas_uso;
    }

    public void setHoras_uso(LocalTime horas_uso) {
        this.horas_uso = horas_uso;
    }

    public Integer getCol_ret_masc() {
        return col_ret_masc;
    }

    public void setCol_ret_masc(Integer col_ret_masc) {
        this.col_ret_masc = col_ret_masc;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

}

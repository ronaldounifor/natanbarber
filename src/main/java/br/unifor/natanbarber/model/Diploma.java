package br.unifor.natanbarber.model;

import java.time.LocalDate;

public class Diploma {
    private String titulo;
    private String instituicao;
    private LocalDate data;
    private String cargaHoraria;
    private String nivel;

    public Diploma(String titulo, String instituicao, LocalDate data, String cargaHoraria, String nivel) {
        this.titulo = titulo;
        this.instituicao = instituicao;
        this.data = data;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

package br.unifor.natanbarber.model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String cpf;
    private String nome;
    private Curriculo curriculo;
    private List<Diploma> diplomas;

    public List<Diploma> getDiplomas() {
        return diplomas;
    }

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.diplomas = new ArrayList<>();
    }

    public void adicionarDiploma(Diploma diploma) {
        diplomas.add(diploma);
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Curriculo getCurriculo() {
        return curriculo;
    }
    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }


}

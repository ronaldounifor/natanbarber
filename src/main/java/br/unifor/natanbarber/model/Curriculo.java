package br.unifor.natanbarber.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Curriculo {

    private Funcionario funcionario;
    
    public Curriculo(Funcionario funcionario) {
        this.funcionario = funcionario;
        gerar();
    }

    private void criarCabecalho() {
        System.out.println("############### CURRICULO ("+funcionario.getCpf()+")##################");
        System.out.println(funcionario.getNome());
    }
    protected abstract void gerarAreaProjetos();

    private void criarSecaoEducacao(){
        System.out.println("################## EDUCACAO ##################");
        for (Diploma diploma : funcionario.getDiplomas()) {
            System.out.println(diploma.getInstituicao()+": "+diploma.getTitulo()+"("+diploma.getData().getYear()+")");

            if(diploma.getCargaHoraria() != null && !"".equals(diploma.getCargaHoraria()))
                System.out.println("Carga Horária: "+diploma.getCargaHoraria());
            else
                System.out.println("Nível: "+diploma.getNivel());
        }
    }
    private void criarSecaoExperiencia() {     
        LocalDate maisAntigo = funcionario.getDiplomas().get(0).getData();
        
        for (Diploma diploma : funcionario.getDiplomas())
            if(diploma.getData().isBefore(maisAntigo))
                maisAntigo = diploma.getData();

        long experiencia = ChronoUnit.YEARS.between(maisAntigo, LocalDate.now());
        
        System.out.println("Possui " + experiencia + " anos de experiencia.");
    }

    protected abstract void gerarFormaContato();

    public void gerar() {
        criarCabecalho();
        criarEspaco();
        criarSecaoEducacao();
        criarEspaco();
        gerarAreaProjetos();
        criarEspaco();
        criarSecaoExperiencia();
        criarEspaco();
        gerarFormaContato();
        criarEspaco();
    }

    private void criarEspaco() {
        System.out.println();
    }

}
package br.unifor.natanbarber.model;

public class CurriculoBarbeiro extends Curriculo {

    public CurriculoBarbeiro(Funcionario funcionario) {
        super(funcionario);
    }

    @Override
    protected void gerarAreaProjetos() {
        System.out.println("################ PORTFOLIO #################");
        System.out.println("Portfolio");
        
    }
    
    @Override
    protected void gerarFormaContato() {
        System.out.println("################ FORMA DE CONTATO #################");
        System.out.println("Instagram!!!");
    }
    
}

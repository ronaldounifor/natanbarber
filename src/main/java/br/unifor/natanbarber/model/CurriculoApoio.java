package br.unifor.natanbarber.model;

public class CurriculoApoio extends Curriculo {

    public CurriculoApoio(Funcionario funcionario) {
        super(funcionario);
    }

    @Override
    protected void gerarAreaProjetos() {
        System.out.println("PROJETOS PESSOAIS!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    protected void gerarFormaContato() {
        System.out.println("Whatsapp: (85) 9 9999-9999");
    }
    
}

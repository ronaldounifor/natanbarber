package br.unifor.natanbarber.model;

public class CurriculoTI extends Curriculo {

    public CurriculoTI(Funcionario funcionario) {
        super(funcionario);
    }

    @Override
    protected void gerarAreaProjetos() {
        System.out.println("############# Projetos ################");
        System.out.println("Projetos no GitHub");
    }
    
    @Override
    protected void gerarFormaContato() {
        System.out.println("############# Forma de Contato ################");
        System.out.println("Perfil no LinkedIn");
                
    }
    
}

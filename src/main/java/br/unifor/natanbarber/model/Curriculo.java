package br.unifor.natanbarber.model;

public abstract class Curriculo {

    // private Funcionario Funcionario;
    
    private void criarCabecalho(String nome){
        System.out.println("#################################");
        System.out.println(nome);
        System.out.println("#################################");
    }
    protected abstract void gerarAreaProjetos();
    private void criarSecaoEducacao(){}
    private void criarSecaoIdiomas(){}
    private void criarSecaoHabilidades(){}
    private void criarSecaoExperiencia(){}
    protected abstract void gerarFormaContato();

    public void imprimir() {
        // criarCabecalho();
        gerarAreaProjetos();
        criarSecaoEducacao();
        criarSecaoExperiencia();
        criarSecaoIdiomas();
        criarSecaoHabilidades();
        gerarFormaContato();
    }

}
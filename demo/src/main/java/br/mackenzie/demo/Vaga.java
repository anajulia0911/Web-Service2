package br.mackenzie.demo;

public class Vaga {
    public long id;
    public String titulo;
    public String descricao;
    public String publicacao;
    public boolean ativo;
    public long idEmpresa;

    public Vaga(long id, String titulo, String descricao, String publicacao, boolean ativo, long idEmpresa) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.publicacao = publicacao;
        this.ativo = ativo;
        this.idEmpresa = idEmpresa;
    }
}
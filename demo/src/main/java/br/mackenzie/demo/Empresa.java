package br.mackenzie.demo;

public class Empresa {
    public long id;
    public String nome;
    public String cnpj;
    public String emailContato;

    public Empresa(long id, String nome, String cnpj, String emailContato) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.emailContato = emailContato;
    }
}
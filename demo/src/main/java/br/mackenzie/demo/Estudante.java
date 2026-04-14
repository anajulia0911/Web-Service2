package br.mackenzie.demo;

public class Estudante {
    public long id;
    public String nome;
    public String email;
    public String nascimento;
    public int anoIngresso;

    public Estudante(long id, String nome, String email, String nascimento, int anoIngresso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.anoIngresso = anoIngresso;
    }
}
package com.github.omega050.t19.Mensagem;

public class Objeto {
    private String nome;

    public Objeto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void enviarMensagem(Objeto destino, String conteudo) {
        Mensagem mensagem = new Mensagem(conteudo);
        destino.receberMensagem(this, mensagem);
    }

    public void receberMensagem(Objeto remetente, Mensagem mensagem) {
        System.out.println("Objeto " + nome + " recebeu uma mensagem de " + remetente.getNome() + ": " + mensagem.getConteudo());
    }
}

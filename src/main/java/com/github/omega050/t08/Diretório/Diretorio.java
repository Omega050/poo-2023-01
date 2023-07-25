
package com.github.omega050.t08.Diretório;
import java.util.List;
public class Diretorio {
    public String nomeDiretorio;
    private Usuario dono;
    private List<Usuario> uPermitidos;

    public Diretorio(String nome, Usuario dono){
        this.nomeDiretorio = nome;
        this.dono = dono;
    }
    public void addUsuario(Usuario u){
        uPermitidos.add(u);
        u.acesso(this.nomeDiretorio);
    }
    public Usuario getDono() {
        return dono;
    }
    public String getNomeDiretorio() {
        return nomeDiretorio;
    }
    public List<Usuario> getuPermitidos() {
        return uPermitidos;
    }
}

package t09.Usuario;

public class test {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", 30, "joao@email.com");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getIdade());
        System.out.println(usuario.getEmail()); 
    }
}

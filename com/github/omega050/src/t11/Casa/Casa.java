package t11.Casa;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Quarto> quartos;
    private List<Banheiro> banheiros;
    private List<Sala> salas;
    private List<Área> áreas;
    private List<Garagem> garagens;

    public Casa() {
        quartos = new ArrayList<>();
        banheiros = new ArrayList<>();
        salas = new ArrayList<>();
        áreas = new ArrayList<>();
        garagens = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }
    
    public void adicionarBanheiro(Banheiro banheiro) {
        banheiros.add(banheiro);
    }

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    public void adicionarÁrea(Área área) {
        áreas.add(área);
    }

    public void adicionarGaragem(Garagem garagem) {
        garagens.add(garagem);
    }
    public static void main(String[] args) {
        Casa casa = new Casa();

        Quarto quarto1 = new Quarto();
        casa.adicionarQuarto(quarto1);

        Banheiro banheiro1 = new Banheiro();
        casa.adicionarBanheiro(banheiro1);

        Sala sala1 = new Sala();
        casa.adicionarSala(sala1);

        Área área1 = new Área();
        casa.adicionarÁrea(área1);

        Garagem garagem1 = new Garagem();
        casa.adicionarGaragem(garagem1);
    }
}
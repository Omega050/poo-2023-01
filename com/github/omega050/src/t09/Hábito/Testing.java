package t09.Hábito;

import java.util.List;

public class Testing {
    public static void main(String[] args) {
        Habito habito1 = new Habito("Roer Unhas","roer unhas");
        Pessoa p1 = new Pessoa(habito1, "Antonio", 14, "Masculino");
        Habito habito2 =new Habito("Dormir Tarde", "dormir tarde");
        p1.addHabito(habito2);
        System.out.println(p1.getNome()+", "+p1.getIdade()+"anos, genero "+p1.getGenero()+" tem os habitos:");
        List<Habito> habitos= p1.getHabitos();
        for(Habito habito:habitos){
            System.out.println(habito.getNomeH());
            System.out.println(habito.getDescrição());
        }
    }
}

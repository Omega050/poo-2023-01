package t11.Armario;
import java.util.List;
import java.util.ArrayList;
public class Armario {
    public List<Prateleira> listaPrateleiras;

    public Armario(Prateleira p){
        this.listaPrateleiras = new ArrayList<>(null);
        this.listaPrateleiras.add(p);
    }
    public List<Prateleira> getPrateleiras() {
        return listaPrateleiras;
    }

    public void adicionarPrateleira(Prateleira p) {
        listaPrateleiras.add(p);
    }
}

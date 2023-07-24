package t11.Preço;

public class PreçoMain {
    public static void main(String[] args) {
        Preço preço = new Preço("Dolar", 200);
        System.out.println("Valor : "+preço.getValor());
        System.out.println("Moeda : "+preço.getMoeda());
    }
}

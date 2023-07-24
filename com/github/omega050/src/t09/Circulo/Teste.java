package t09.Circulo;

public class Teste {
     public static void main(String[] args) {
        Circulo circulo = new Circulo(2, 3, 5);


        System.out.println("Centro inicial: " + circulo.getX() + ", " + circulo.getY());
        System.out.println("Raio: " + circulo.getRaio());

        double deslocamentoX = 1.5;
        double deslocamentoY = -2.5;
        circulo.transladar(deslocamentoX, deslocamentoY);

        System.out.println("Pós translação:");
        System.out.println("Centro: " + circulo.getX() + ", " + circulo.getY());
        System.out.println("Raio: " + circulo.getRaio());
    }
}

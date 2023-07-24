package t11.Cadeira;

public class Cadeira {
    public String cor;
    public float tam;
    private String material;
    public String tipo;
    public Cadeira(String c, int t, String m, String tipo){
        this.cor = c;
        this.tam = t;
        this.material = m;
        this.tipo = tipo;
    }
    public String getColor(){
        return cor;
    }
    public float getSize(){
        return tam;
    }
    public String getMat(){
        return material;
    }
    public String getType(){
        return tipo;
    }
}

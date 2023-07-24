package t11.Janela;

public class Janela {
    boolean estado;//false sem vidro true com  vidro
    float area;
    float areaVidro;

    public Janela(boolean e, float a, float v){
        this.estado = e;
        if(estado == true){
        this.area = a;
        this.areaVidro = v;
}
        else{
            this.area = a;
            this.areaVidro = 0;
        }

    }
    public boolean hasGlass(){
        return estado;
    }
    public float getArea(){
        return area;
    }
    public float getAreaV(){
        return areaVidro;
    }
}

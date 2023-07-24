package t11.Carnê;
import java.util.Date;
public class Prestacao {
     Date data;
     double valor;

     public Prestacao(Date d, double v){
          this.valor = v;
          this.data = d;
     }
     public double getValor(){
          return valor;
     }
     public Date getData() {
         return data;
     }
}

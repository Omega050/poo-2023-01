package t11.Armario;
import java.util.Date;
public class CD {
    String cdName;
    Date dataP;
    String cantor;

    public CD(String n, Date d, String c){
        this.cdName = n;
        this.dataP = d;
        this.cantor = c;
    }
    public String getName(){
        return cdName;
    }
    public Date getDate(){
        return dataP;
    }
    public String getCantor(){
        return cantor;
    }
}


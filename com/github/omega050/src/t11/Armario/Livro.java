package t11.Armario;
import java.util.Date;
public class Livro {
    String lName;
    Date dataP;
    int edicao;
    String autor;

    public Livro(String n, Date d, int e, String a){
        this.lName = n;
        this.dataP = d;
        this.edicao = e;
        this.autor = a;
    }
    public String getName(){
        return lName;
    }
    public Date getDate(){
        return dataP;
    }
    public int getEd(){
        return edicao;
    }
    public String getAuthor(){
        return autor;
    }
}

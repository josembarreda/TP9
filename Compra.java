import java.io.Serializable;
import java.lang.Double;
import java.util.Date;

public class Compra implements Serializable{
  private Person per;
  private Producto ap;
  private Double cant;
  private Date date;
  public Compra() {
    // constructor por defecto
    per = new Person();
    ap = new Producto();
    cant = 0.0;
    date= new Date();
  }
  public void setPer(String name) {
    per.setName(name);
  }
  public void setAp(Producto producto) {
    ap=producto;
  }
  public void setCant(Double cant) {
    this.cant = cant;
  }
  public void setFecha(Date date){
    this.date=date;
  }
  public Person getPer() {
    return per;
  }
  public Producto getAp() {
    return ap;
  }

  public Double getCant() {
    return cant;
  }
  public Date getFecha(){
    return date;
  }
}

package steven.base;
import java.util.Date;
import java.io.File;
public class version {
 private  Date fecha;
  private String descripcion;
  private File archivo;
   private documento documento;
   public version(){
     
 }
 public version (Date fecha , String d){
     this.fecha= fecha ;
     descripcion = d ;
    
 }
}
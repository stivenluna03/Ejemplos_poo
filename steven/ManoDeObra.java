package steven.base;
import java.util.Date;
public class ManoDeObra {
 private Empleao trabajador;
 private proyecto proyecto;
 private Date fechaInicio;
 private Date fechaFin;
 private String rol ; 
 public ManoDeObra(){
     
 }
 public ManoDeObra (Empleao e , proyecto p){
    trabajador = e ;
    proyecto = p ;
 }
}
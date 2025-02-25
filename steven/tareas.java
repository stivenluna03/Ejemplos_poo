package steven.base;
import java.util.Date;
import java.util.List;
public class tareas {
 private  String descripcion;
 private String tipo;
 private Date fechaInicioEstimado;
 private Date fechaInicioReal;
 private  int duracionEstimada;
 private int duracionReal;
 private List<Empleao> listaDeEmpleados;
 private proyecto proyecto;
 private List<documento> listaDeDocumentos;
  public tareas(){
     
 }
 public tareas (String d , String t){
     descripcion = d ;
    tipo = t ;
 }
}
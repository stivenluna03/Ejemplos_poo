package steven.base;
import java.util.List;
public class Empresa {
 private String nit ;
 private String nombre;
 private String telefono;
 private String email;
 private String tipo;
 private String web;
 private String direccion;
 private List<Empleao> listaDeEmpleados;
 private List<proyecto> listaDeProyectos;
 
 public Empresa(){
     
 }
 public Empresa (String nit , String nombre){
     this.nit=nit;
     this.nombre=nombre;
 }
}
package steven.base;
import java.util.Date;
import java.util.List;
 //propiedades
 public class Empleao {
 protected  String dni;
 protected  String nombre;
 protected String apellidos;
 protected  String direccion;
 protected   String telefono;
 protected   String email;
 protected  Date fechaContrato;
 protected Empresa empresa;
 protected List<proyecto> listaDeProyectos;
 protected List<tareas> listaDeTareas;
 public Empleao(){
     
 }
 public Empleao (String nombre , String apellidos){
     this.nombre=nombre;
     this.apellidos=apellidos;
 }
}
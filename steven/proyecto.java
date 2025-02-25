package steven.base;
import java.util.Date;
import java.util.List;
public class proyecto {
  private String nombreClave;
  private String denominacion;
  private Date fechaInicio;
  private Date fechaFin;
  private String estado;
  private Empresa empresa;
  private List<Empleao> listaDeEmpleados;
  private promotor EmpleadoPromotor;
  private List<tareas> listaDeTareas;
 public proyecto(){
     
 }
 public proyecto (String nombreClave , String denominacion){
     this.nombreClave=nombreClave;
     this.denominacion=denominacion;
 }
}
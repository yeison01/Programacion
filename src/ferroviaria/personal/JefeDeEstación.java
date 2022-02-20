package ferroviaria.personal;

public class JefeDeEstación {
    public String nombre;
    public String dni;
    public String fecha;

    public String SoutJefeDeEstación(){
        StringBuilder sj = new StringBuilder();
        sj.append("Datos del jefe de estación: Nombre= "+ this.nombre + " DNI: " + this.dni + "  fechaNombramiento =" + fecha);
        return sj.toString();
    }


}

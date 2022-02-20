package ferroviaria.personal;

public class Mecánico {

    //atributos
   public String nombre;
   public int telefono;
   public String especialidad;

    public String SoutMecánico(){
        StringBuilder sm = new StringBuilder();
        sm.append("Datos del Mecánico: Nombre= "+ this.nombre + " teléfono " + this.telefono + "  Especialidad =" + especialidad);
        return sm.toString();
    }

    //constructor


    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    // toString

    @Override
    public String toString() {
        return "Mecánico{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }


    //imprimirDatos()


}

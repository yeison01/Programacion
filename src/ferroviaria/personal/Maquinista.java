package ferroviaria.personal;

public class Maquinista {
    public String nombre;
    public String dni;
    public double sueldo;
    public int rango;


    public String SoutMaquinista (){
        StringBuilder sc = new StringBuilder();
        sc.append("Datos del Maquinista : "+ this.nombre + " DNI= " + this.dni + ", sueldo= 420000" + ", rango= " + rango);
        return sc.toString();
}
}

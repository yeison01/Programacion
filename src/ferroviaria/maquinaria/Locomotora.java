package ferroviaria.maquinaria;

public class Locomotora {

    public String matricula;
    public int potencia ;
    public int añoFabricación;


    public String SoutLocomotora(){
        StringBuilder sl = new StringBuilder();
        sl.append("Locomotora: Matricula= "+ this.matricula + " Potencia: " + this.potencia + "  añoFabricación= " + añoFabricación);
        return sl.toString();
    }
}



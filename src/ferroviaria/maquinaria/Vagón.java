package ferroviaria.maquinaria;

public class Vagón {
    //id
   public int id;
    //cargaMáxima
   public int cargaMáxima;
    //cargaActual
   public int cargaActual;
    //mercancía
   public String mercancia;

    public String SoutVagon(){
        StringBuilder sv = new StringBuilder();
        sv.append("  Vagon = id=" + this.id + " Carga actual= " + this.cargaActual + " Carga Máxima=" +
                this.cargaMáxima + "Mercancia= " + mercancia);
        return sv.toString();
    }

}

package ferroviaria.maquinaria;

import java.util.Scanner;

public class Tren {
    public String vagones;
     public String maquinista;

    public String SoutTren(){
        StringBuilder sj = new StringBuilder();
        sj.append("Vagon= " + this.vagones + " Maquinista = " + this.maquinista);
        return sj.toString();
    }




}

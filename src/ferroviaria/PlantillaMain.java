package ferroviaria;

import ferroviaria.maquinaria.Locomotora;
import ferroviaria.maquinaria.Tren;
import ferroviaria.maquinaria.Vagón;
import ferroviaria.personal.JefeDeEstación;
import ferroviaria.personal.Maquinista;
import ferroviaria.personal.Mecánico;

public class PlantillaMain {
    public static void main(String[] args) {
        // Simulamos una estación: creamos objetos de diversos tipos:

        // dos maquinistas(objetos)
        Maquinista m1 = new Maquinista();
            m1.nombre = "Pepe";
            m1.dni = "11111M";
            m1.sueldo = 42000.00;
            m1.rango = 1;



            Maquinista m2 = new Maquinista();
            m2.nombre = "Marta";
            m2.dni = "22222222P";
            m2.sueldo = 42000.0;
            m2.rango = 1;


        // imprimimos los datos de los dos maquinistas

        System.out.println(m1.SoutMaquinista());
        System.out.println(m2.SoutMaquinista());


        // un mecánico de cada especialidad

        Mecánico n1 = new Mecánico();
            n1.nombre = "F. Frenador";
            n1.telefono = 38456612;
            n1.especialidad = "Frenos";


        Mecánico n2 = new Mecánico();
            n2.nombre = "H. Hidraulico";
            n2.telefono = 384566612;
            n2.especialidad = "HIDRÁULICA";


        Mecánico n3 = new Mecánico();
            n3.nombre = "E. Electricista";
            n3.telefono = 124566612;
            n3.especialidad = "ELECTRICIDAD";


        Mecánico n4 = new Mecánico();
            n4.nombre = "M. Motorista";
            n4.telefono = 144566612;
            n4.especialidad = "MOTOR";






        // imprimimos los datos de cada mecánico

        System.out.println(n1.SoutMecánico());
        System.out.println(n2.SoutMecánico());
        System.out.println(n3.SoutMecánico());
        System.out.println(n4.SoutMecánico());



        // Un jefe de estación

        JefeDeEstación j1 = new JefeDeEstación();
            j1.nombre = "El Boss";
            j1.dni = "2222222D";
            j1.fecha = "2019-12-01";



        // Imprimimos los datos del jefe de estación

        System.out.println(j1.SoutJefeDeEstación());



        // Una locomotora

        Locomotora l1 = new Locomotora();
            l1.matricula = "M3085";
            l1.potencia = 350;
            l1.añoFabricación = 2020;



        // imprimimos los datos de la locomotora

        System.out.println(l1.SoutLocomotora() + n1.SoutMecánico());


        // Creamos un tren con la locomotora que acabamos de crear
        Tren t1 = new Tren();
        t1.vagones = "[]";
        t1.maquinista = " null";


        System.out.println("Datos del tren= (" + l1.SoutLocomotora() + n1.SoutMecánico() + t1.SoutTren()) ;



        // Añadimos 6 vagones al tren (nos dirá que el último no se puede
        System.out.println("\nAñadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");

        Vagón v1 = new Vagón();
            v1.id = 1 ;
            v1.cargaMáxima = 1000;
            v1.cargaActual = 500;
            v1.mercancia = "";


        Vagón v2 = new Vagón();
            v2.id = 2 ;
            v2.cargaMáxima = 1000;
            v2.cargaActual = 500;
            v2.mercancia = "PERECEDERAS";

        Vagón v3 = new Vagón();
            v3.id = 3 ;
            v3.cargaMáxima = 2000;
            v3.cargaActual = 500;
            v3.mercancia = "NO_PERECEDERA";

        Vagón v4 = new Vagón();
            v4.id = 4 ;
            v4.cargaMáxima = 3000;
            v4.cargaActual = 500;
            v4.mercancia = "FRAGIL";

        Vagón v5 = new Vagón();
            v5.id = 5 ;
            v5.cargaMáxima = 4000;
            v5.cargaActual = 500;
            v5.mercancia = "PELIGROSA";


        System.out.println(v1.SoutVagon());





        // Asignamos uno de los maquinistas al tren creado
        System.out.println("\n*****     Le asignamos un maquinista *****");

        System.out.println("Datos del tren ");

        System.out.println("Locomotora = " + l1.SoutLocomotora() + "Mecánico = " + n1.SoutMecánico());
        System.out.println("Vagones " + v2.SoutVagon() + v3.SoutVagon() + v4.SoutVagon());
        System.out.println(v5.SoutVagon() + m1.SoutMaquinista());

        // Mostramos el número de vagones del tren
        System.out.println("Número de vagones = 5");
        // Mostramos los datos del tren creado


        System.out.println("Locomotora = " + l1.SoutLocomotora() + "Mecánico = " + n1.SoutMecánico());
        System.out.println("Vagones " + v2.SoutVagon() + v3.SoutVagon() + v4.SoutVagon());
        System.out.println(v5.SoutVagon() + m1.SoutMaquinista());

        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");
        // mostramos el número de vagones del tren

        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("\nMi estación se compone de");


    }
}

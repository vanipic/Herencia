/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Administrador {
    

   
public static void main (String [] args) {

    Arquero arq1 = new Arquero ();

arq1.nombre = "Julián";

arq1.equipo = "Rojo";

arq1.salud = 100;

arq1.estadoarma = 75;

arq1.cantidadflechas = 80;

arq1.reportar();

arq1.caminar();

//método de la clase Humano

arq1.atacar();

arq1.defender();

//métodos de la clase Guerrero

arq1.lanzarflecha();

//método de la clase Arquero

System.out.println(" ");

 

Caballero cab1 = new Caballero ();

cab1.nombre = "Pedro";

cab1.equipo = "Azul";

cab1.salud = 90;

cab1.estadoarma = 80;

 

cab1.reportar();

cab1.agacharse();

cab1.saltar();

//métodos de la clase Humano

cab1.atacar();

cab1.defender();

//métodos de la clase Guerrero

cab1.montar();

cab1.usarlanza();

cab1.usarespada();

//métodos propios de la clase Caballero

System.out.println(" ");

 

Obrero obrero1 = new Obrero();

 

obrero1.nombre = "Jeremías";

obrero1.equipo = "Azul";

obrero1.salud = 80;

obrero1.cantidadmateriales = 80;

obrero1.estadoherramientas = 65;
obrero1.equipodetrabajo = 200;

 

obrero1.reportar();
// reportar es metodo de la Superclase Humano
obrero1.reporteestado();
//reportar estado es metodo de la clase padre humano

obrero1.caminar();

obrero1.agacharse();

obrero1.saltar();

//Métodos heredados de la clase Humano

obrero1.equipodetrabajo = 55;
obrero1.estadoherramientas = 95;
obrero1.cantidadmateriales = 250;
//Atributos de la clase padre constructor

obrero1.abrircaminos();

obrero1.construirfuerte();

obrero1.construirpuente();

//Métodos propios de la clase Obrero
System.out.println(" ");
Arquitecto arquit1 = new Arquitecto();
arquit1.nombre = "Valentino";

arquit1.equipo = "Rojo";

arquit1.salud = 100;

arquit1.cantidadmateriales = 70;

arquit1.estadoherramientas = 95;
arquit1.equipodetrabajo = 250;

 

arquit1.reportar();
// reportar es metodo de la Superclase Humano
arquit1.reporteestado();
//reportar estado es metodo de la clase padre humano

arquit1.caminar();

arquit1.saltar();

//Métodos heredados de la clase Humano

arquit1.equipodetrabajo = 55;
arquit1.estadoherramientas = 95;
arquit1.cantidadmateriales = 250;
//Atributos de la clase padre constructor

arquit1.trazarcaminos();

arquit1.diseniarfuerte();

arquit1.diseniarpuente();

//Métodos propios de la clase Arquitecto
System.out.println(" ");

        }

}
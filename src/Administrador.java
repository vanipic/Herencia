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

 

Constructor const1 = new Constructor();

 

const1.nombre = "Jeremías";

const1.equipo = "Azul";

const1.salud = 80;

const1.cantidadmateriales = 80;

const1.estadoherramientas = 65;

 

const1.reportar();

const1.caminar();

const1.agacharse();

const1.saltar();

//Métodos heredados de la clase Humano

const1.abrircaminos();

const1.construirfuerte();

const1.construirpuente();

//Métodos propios de la clase Constructor

}
}
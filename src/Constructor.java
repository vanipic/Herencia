/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Constructor extends Humano {
    //Sólo hereda de Humano y también posee sus métodos y atributos propios.

int cantidadmateriales;

int estadoherramientas;

 

public void aprovisionarse () {

System.out.println ("Recojo materiales para seguir construyendo.");

}

public void abrircaminos () {

System.out.println ("Abro caminos para que mi equipo se desplace.");

}

public void construirpuente () {

System.out.println ("Construyo un puente para atravesar el río.");

}

public void construirfuerte () {

System.out.println ("Construyo un fuerte para que podamos protegernos.");

}
}

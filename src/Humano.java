/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Humano {
public String nombre;
public String equipo;
public int salud;

 

public void saltar () {

System.out.println("salto, salto, salto…");

}

public void caminar () {

System.out.println("camino, camino, camino…");

}

public void agacharse () {

System.out.println("me agacho, me agacho, me agacho…");

}

public void reportar() {

System.out.print("Mi nombre es: "+this.nombre+"\nMi equipo es: "+this.equipo+"\nMi salud está en un: "+this.salud+"%");

    
}
}
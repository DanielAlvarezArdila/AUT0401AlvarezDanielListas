package es.cifpcm;

import java.util.Scanner;

public class Farmacia {
    public String nombre;
    public String telefono;
    public float uX;
    public float uY;
    public String web;
    public Farmacia(String newNombre, String newTelefono, float newUX, float newUY, String newWeb) {
        this.nombre=newNombre;
        this.telefono=newTelefono;
        this.uX=newUX;
        this.uY=newUY;
        this.web=newWeb;
    }
    @Override
    public String toString() {
        return "\nFarmacia:\n" +
                "nombre: " + nombre + '\n' +
                "telefono: " + telefono + '\n' +
                "Coordenadas: X= " + uX +" Y= "+uY +"\n"+
                "Web: " + web;
    }
}

package es.cifpcm;

import java.util.List;
import java.util.Scanner;

public class Funciones {
    public static void printMainMenu()
    {   //Cambiar a StringBuilder
        StringBuilder sb=new StringBuilder("Introduza un número para realizar una acción:");
            sb.append("\n--Necesito Paracetamol YA! ")
              .append("\n----------------------------------------------")
              .append("\n-    1- Buscar una farmacia       ------------")
              .append("\n-    2- Listar Farmacias          ------------")
              .append("\n-    0- Salir                     ------------")
              .append("\n----------------------------------------------")
              .append("\n-    9- Admin                     ------------")
              .append("\n----------------------------------------------");
        System.out.println(sb);
    }
    public static void printAdminMenu()
    {   //Cambiar a StringBuilder
        StringBuilder sb=new StringBuilder("Introduza un número para realizar una acción:");
        sb.append("\n======= FARMACIAS DE MI CIUDAD - ADMIN =======")
          .append("\n----------------------------------------------")
          .append("\n-    1- Añadir una farmacia       ------------")
          .append("\n-    2- Borrar Farmacias          ------------")
          .append("\n-    3- Listar Farmacias          ------------")
          .append("\n-    0- Salir                     ------------")
          .append("\n----------------------------------------------");

        System.out.println(sb);
    }

    public static void mostrarFarmacias(List<Farmacia> listaFarmacias){
        for (Farmacia farmacia:listaFarmacias
        ) {
            System.out.println(farmacia);
        }
    }
    public static Farmacia generarFarmacia(){
        Farmacia farmacia=new Farmacia(
                pedirString("el nombre"),
                pedirString("el telefono"),
                pedirCoordenada("X"),
                pedirCoordenada("Y"),
                pedirString("la dirección web"));
        System.out.println(farmacia);
        return farmacia;
    }
    private static String pedirString(String campo){
        Scanner entrada=new Scanner(System.in);
        boolean Vacio=true;
        String nombre="";
        do {
            StringBuilder sb=new StringBuilder("Introduza ");
            sb.append(campo).append(" de la farmacia");
            System.out.println(sb);
            nombre=entrada.nextLine();
            if(!nombre.equals("")) {
                Vacio=false;
            }
        }while (Vacio);
        return nombre;
    }
    private static float pedirCoordenada(String campo){
        Scanner entrada=new Scanner(System.in);
        boolean notNum=true;
        float coord=0;
        do {
            StringBuilder sb=new StringBuilder("Introduza el eje ");
            sb.append(campo).append(" de la farmacia");
            System.out.println(sb);
            String entradaNum=entrada.nextLine();
            if(isNumeric(entradaNum)) {
                coord=Float.parseFloat(entradaNum);
                notNum=false;
            }
        }while (notNum);
        return coord;
    }

    private static boolean isNumeric(String cadena){
        try {
            Float.parseFloat(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}

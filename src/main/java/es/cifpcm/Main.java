package es.cifpcm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
//menu de usuario y menu de admin
//listar farmacia y buscar por nombre(usuario)
//crear farmacia solo admin
public class Main {
    static Persistencia pst= new impPersistenciaAlvarez();
    public static void main(String[] args) {
        if (pst.open()) {
            Scanner palMenu = new Scanner(System.in);
            String numMenu = "";
            do {
                //Cambiar a StringBuilder
                Funciones.printMainMenu();
                numMenu = palMenu.nextLine();
                //cambiar a Switch
                if (numMenu.equals("1")) {
                    pst.add(Funciones.generarFarmacia());
                } else if (numMenu.equals("2")) {
                    Funciones.mostrarFarmacias(pst.list());
                } else if (numMenu.equals("0")) {
                    System.out.println("Ha decidido salir del programa");
                }else if(numMenu.equals("9")){
                    Funciones.printAdminMenu();
                }
            } while (!numMenu.equals("0"));
        }else{
            System.out.println("Ha ocurrido un error al cargar la página");
        }
    }
    public static void funcMenuPrincipal(){
        Scanner palMenu = new Scanner(System.in);
        String numMenu = "";
    }
//    public static List<Farmacia> generarLista(List<Farmacia> lista){
//        lista.add(new Farmacia("Don Felipe","888222333",1,1,"www.donfelipe.com"));
//        lista.add(new Farmacia("Doña Pepa","888333444",4126541,445555,"www.donapepa.com"));
//        lista.add(new Farmacia("Amiga","888444555",264864,1412,"www.farmaciaamigos.com"));
//        return lista;
//    }

}
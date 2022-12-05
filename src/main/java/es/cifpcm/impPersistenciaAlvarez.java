package es.cifpcm;

import java.util.ArrayList;
import java.util.List;

public class impPersistenciaAlvarez implements Persistencia {
    List<Farmacia> listaFarmacias= new ArrayList<Farmacia>();
    @Override
    public boolean open() {
        try{
            listaFarmacias.add(new Farmacia("Don Felipe","888222333",1,1,"www.donfelipe.com"));
            listaFarmacias.add(new Farmacia("Doña Pepa","888333444",4126541,445555,"www.donapepa.com"));
            listaFarmacias.add(new Farmacia("Amiga","888444555",264864,1412,"www.farmaciaamigos.com"));
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean openJSON() {
        
        return false;
    }

    @Override
    public boolean close() {
        return false;
    }

    @Override
    public boolean closeJSON() {
        return false;
    }

    @Override
    public boolean add(Farmacia farmacia) {
        try{
            listaFarmacias.add(farmacia);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean delete(Farmacia farmacia) {
        return false;
    }

    @Override
    public List<Farmacia> list() {
        return listaFarmacias;
    }
}

package es.cifpcm;

import java.util.ArrayList;
import java.util.List;

public interface Persistencia {
    public boolean open();
    public boolean openJSON();
    public boolean close();
    public boolean closeJSON();
    public boolean add(Farmacia farmacia);
    public boolean delete(Farmacia farmacia);
    public List<Farmacia> list();
}

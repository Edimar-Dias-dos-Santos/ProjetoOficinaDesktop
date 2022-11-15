
package controller;

import abstratas.Dados;
import model.Marca;

public class daoMarcaAnterior {
    public void create(Marca marca){
        Dados.getManager().getTransaction().begin();
        Dados.getManager().persist(marca);
        Dados.getManager().getTransaction().commit();
    }
    public void update(Marca marca){
        Dados.getManager().getTransaction().begin();
        Dados.getManager().merge(marca);
        Dados.getManager().getTransaction().commit();
    }
    public void delete(Marca marca){
        Dados.getManager().getTransaction().begin();
        Dados.getManager().remove(marca);
        Dados.getManager().getTransaction().commit();
    }
    public Marca read(int id){
        return Dados.getManager().find(Marca.class, id);
    }

}

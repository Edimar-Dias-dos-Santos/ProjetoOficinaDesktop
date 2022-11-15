
package controller;

import abstratas.dao;
import java.util.List;
import model.Marca;
import model.Modelo;

public class daoModelo extends dao<Modelo> {
    public List<Modelo> read(){
        String JPQL="select m from Modelo m order by m.nome";
        return super.read(JPQL);
    }
    public List<Modelo> read(String filtro){
        String JPQL="select m from Modelo m where m.nome like ?1 "
                + "order by m.nome";
        return super.read(JPQL, "%"+filtro.toUpperCase()+"%");
    }
    public List<Modelo> read(Marca marca){
        String JPQL="select m from Modelo m where m.marca= ?1 order by m.nome";
        return super.read(JPQL, marca);
    }
    
}

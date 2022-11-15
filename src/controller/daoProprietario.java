
package controller;

import abstratas.dao;
import java.util.List;
import model.Proprietario;

public class daoProprietario extends dao<Proprietario>{
    public List<Proprietario> read(){
        String JPQL="select p from Proprietario p order by p.nome";
        return super.read(JPQL);
    }
    public List<Proprietario> read(String filtro){
        String JPQL="select p from Proprietario p "
                + "where p.nome like ?1 order by p.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
}

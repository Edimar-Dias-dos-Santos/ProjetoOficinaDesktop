
package controller;

import abstratas.dao;
import enums.Estados;
import java.util.List;
import model.Cidade;

public class daoCidade extends dao<Cidade> {
    public List<Cidade> read(){
        String JPQL="select c from Cidade c order by c.nome";
        return super.read(JPQL);
    }
    public List<Cidade> read(String filtro){
        String JPQL="select c from Cidade c "
                + "where c.nome like ?1 order by c.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
    public List<Cidade> read(Estados estado){
        String JPQL="select c from Cidade c where c.estado=?1 "
                + "order by c.nome";
        return super.read(JPQL, estado);
    }
}

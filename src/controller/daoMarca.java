
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Marca;

public class daoMarca extends dao<Marca>{
    public List<Marca> read(){        
        String JPQL="select m from Marca m order by m.nome";
        return super.read(JPQL);
    }
    public List<Marca> read(String filtro){        
        String JPQL="select m from Marca m where m.nome like ?1 order by m.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }    
    
}


package testes;

import controller.daoMarcaAnterior;
import model.Marca;

public class testeMarca {
    public static void main(String[] args) {
        Marca m1 = new Marca(0, "renault");
        Marca m2 = new Marca(0, "lifan");
        Marca m3 = new Marca(0, "gm");
        Marca m4 = new Marca(0, "honda");
        //
        daoMarcaAnterior dao = new daoMarcaAnterior();
        //
        try{
            dao.create(m1);
            dao.create(m2);
            dao.create(m3);
            dao.create(m4);
        }catch(Exception ex){
            System.out.println("ERRO:"+ex.getMessage());
            
        }
        
    }
    
}

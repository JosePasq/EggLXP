
package persistencia;

import entidades.Editorial;


public class EditorialDAO extends  DAO<Editorial>{

    @Override
    protected void persistirEntidad(Editorial object) {
        super.persistirEntidad(object); 
    }

    @Override
    protected void actualizarEntidad(Editorial object) {
        super.actualizarEntidad(object); 
    }

    @Override
    protected void borrarEntidad(Editorial object) {
        super.borrarEntidad(object); 
    }
    
    

    
}

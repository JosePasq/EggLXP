
package persistencia;

import entidades.Libro;

public class LibroDAO extends DAO<Libro> {

    @Override
    protected void persistirEntidad(Libro object) {
        super.persistirEntidad(object);
    }

    @Override
    protected void actualizarEntidad(Libro object) { 
    }

    @Override
    protected void borrarEntidad(Libro object) {
        super.borrarEntidad(object);
    }

    
    
}

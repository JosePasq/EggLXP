/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Autor;


public class AutorDAO extends DAO <Autor>{

    @Override
    protected void persistirEntidad(Autor object) {
        super.persistirEntidad(object); 
    }

    @Override
    protected void actualizarEntidad(Autor object) {
        super.actualizarEntidad(object); 
    }

    @Override
    protected void borrarEntidad(Autor object) {
        super.borrarEntidad(object); 
    }

    
}

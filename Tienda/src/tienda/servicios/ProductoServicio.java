/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.sql.SQLException;
import tienda.persistencia.DAO;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;
import java.util.Collection;
import java.util.List;

//FALTA RELACIONAR CON EL FABRICANTE, VER VIDEO 7 RELACIONES

/**
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
*
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 */
public class ProductoServicio {

     private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }
    
    //a)
    public Collection<Producto> listarProductosCompletos()throws Exception{
    try {
            return dao.listarProductos();
        } catch (Exception e) {
          throw e;
        }
}    
    //b)
     public Collection<Producto> listarNombresProductos()throws Exception{
    try {
            return dao.listarNombresProductos();
        } catch (Exception e) {
          throw e;
        }
     }
    //c)
     public Collection<Producto> listarNombresPreciosProductos()throws Exception{
    try {
            return dao.listarNombresPreciosProductos();
        } catch (Exception e) {
          throw e;
        }
     }
     
     //d)
     public Collection<Producto> listarProductosPorRangoPrecio()throws Exception{
    try {
            return dao.listarProductosPorRangoPrecio(0, 0);
        } catch (Exception e) {
          throw e;
        }
     }
     
     //e)
      public List<Producto> listarPortatiles()throws Exception{
    try {
            return dao.listarPortatiles();
        } catch (Exception e) {
          throw e;
        }
     }
     
    //f)
    public void ingresarProducto(Integer codigo) throws Exception{
        try {
            if(codigo == null ){
                throw new Exception ("Debe indicar el codigo del producto");
            }
          if (buscarProducto(codigo) != null) {
           throw new Exception ("ya existe un producto con ese codigo");

            }
           Producto producto = new Producto();
           producto.setCodigo(codigo);
           dao.guardarProducto(producto);
            
        } catch (Exception e) {
            throw e;
        }
    }

    
public Producto buscarProducto(Integer codigo) throws Exception{
        try {
            return dao.buscarProductoPorCodigo(codigo);
        } catch (Exception e) {
          throw e;
        }
    }
   

public void editarProducto (Producto producto)throws Exception{
        try {
        dao.editarProducto(producto);
    } catch (Exception e) {
        throw e;
    }
}


}
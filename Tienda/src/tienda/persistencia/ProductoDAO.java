
package tienda.persistencia;

import tienda.entidades.Producto;
import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;



public final class ProductoDAO extends DAO {
    
   public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO Producto (nombre) VALUES ('" + producto.getNombre() + "')";
          
             System.out.println(sql);
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
              } finally {
            desconectarBase();
        }
        
        
   }
   
        public void editarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificra");
            }
            String sql = "UPDATE Producto SET"
                    + "codigo = '" + producto.getCodigo() + "', nombre ='" + producto.getNombre() 
                    + "', precio='" + producto.getPrecio() 
                    + "', codigoFabricante='" + producto.getCodigoFabricante()
                    +" WHERE id= '" + producto.getCodigo() + "'";
          
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
}
        
        
    }
      public Producto buscarProductoPorCodigo(Integer codigo) throws Exception{
          try {
              
              String sql = "SELECT * FROM Producto "
                      +" WHERE codigo ='" + codigo + "'";
              consultarBase(sql);
              
              Producto producto = null;
              while(resultado.next()){
                  producto = new Producto();
                  producto.setCodigo(resultado.getInt(1));
                  producto.setNombre(resultado.getString(2));
                  producto.setPrecio(resultado.getDouble(3));
                  producto.setCodigoFabricante(resultado.getInt(4));
              }
              desconectarBase();
              return producto;
              
              
          } catch (Exception e) {
              desconectarBase();
              throw e;
              
          }
      }
      
      public Collection<Producto> listarProductos () throws Exception{
          try {
             String sql = "SELECT * FROM Producto ";
             consultarBase(sql);
              
              Producto producto;
              Collection<Producto> productos = new ArrayList<>();
              
              while (resultado.next()){
                  producto = new Producto();
                  producto.setNombre(resultado.getNString(2));
                  producto.setPrecio(resultado.getDouble(3));
                  productos.add(producto);
              }
              desconectarBase();
              return productos;
              
          } catch (Exception e) {
              e.printStackTrace();
              desconectarBase();
              throw new Exception ("Error de sistema");
          }
    }
      
      public Collection<Producto> listarNombresProductos() throws Exception {
try {
             String sql = "SELECT nombre FROM Producto ";
             consultarBase(sql);
              
              Producto producto;
              Collection<Producto> productosPorNombre = new ArrayList<>();
              
              while (resultado.next()){
                  producto = new Producto();
                  producto.setNombre(resultado.getNString(2));
                  productosPorNombre.add(producto);
              }
              desconectarBase();
              return productosPorNombre;
              
          } catch (Exception e) {
              e.printStackTrace();
              desconectarBase();
              throw new Exception ("Error de sistema");
          }    }

    public Collection<Producto> listarNombresPreciosProductos() throws Exception {
    try{
        String sql = "SELECT nombre, precio FROM Producto ";
             consultarBase(sql);
              
              Producto producto;
              Collection<Producto> productosPorNombreyNombre = new ArrayList<>();
              
              while (resultado.next()){
                  producto = new Producto();
                  producto.setNombre(resultado.getNString(2));
                  producto.setPrecio(resultado.getDouble(3));
                  productosPorNombreyNombre.add(producto);
              }
              desconectarBase();
              return productosPorNombreyNombre;
              
           } catch (Exception e) {
        e.printStackTrace();
        desconectarBase();
        throw new Exception("Error de sistema");
    }    }



    public  Collection<Producto> listarProductosPorRangoPrecio(double precioMin, double precioMax) throws Exception {
        try{
        String sql = "SELECT nombre, precio FROM Producto WHERE precio >120 AND precio < 200";
             consultarBase(sql);
              
              Producto producto;
              Collection<Producto> productosPorRangoPrecios = new ArrayList<>();
              
              while (resultado.next()){
                  producto = new Producto();
                  producto.setNombre(resultado.getNString(2));
                  producto.setPrecio(resultado.getDouble(3));
                  productosPorRangoPrecios.add(producto);
              }
              desconectarBase();
              return productosPorRangoPrecios;
              
           } catch (Exception e) {
        e.printStackTrace();
        desconectarBase();
        throw new Exception("Error de sistema");
    }    }

    public  List<Producto> listarPortatiles() throws Exception {
try{
        String sql = "SELECT nombre, precio FROM Producto WHERE nombre LIKE '%Portatil%'";
             consultarBase(sql);
              
              Producto producto;
              List<Producto> productosPortatiles = new ArrayList<>();
              
              while (resultado.next()){
                  producto = new Producto();
                  producto.setNombre(resultado.getNString(2));
                  producto.setPrecio(resultado.getDouble(3));
                  productosPortatiles.add(producto);
              }
              desconectarBase();
              return productosPortatiles;
              
           } catch (Exception e) {
        e.printStackTrace();
        desconectarBase();
        throw new Exception("Error de sistema");
    }    }


    

    public  List<Producto> listarProductoMasBarato() throws Exception {
try{
        String sql = "SELECT nombre, precio FROM Producto ORDER BY precio ASC LIMIT 1";
             consultarBase(sql);
              
              Producto producto;
              List<Producto> productosMasBarato = new ArrayList<>();

while (resultado.next()){
                  producto = new Producto();
                  producto.setNombre(resultado.getNString(2));
                  producto.setPrecio(resultado.getDouble(3));
                  productosMasBarato.add(producto);
              }
              desconectarBase();
              return productosMasBarato;
              
           } catch (Exception e) {
        e.printStackTrace();
        desconectarBase();
        throw new Exception("Error de sistema");
    }    }

}

    
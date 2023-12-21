/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO <T>{

    private final EntityManagerFactory emf;
    protected EntityManager em;

    public DAO() {
        this.emf = Persistence.createEntityManagerFactory("EjercicioPU");
        this.em = emf.createEntityManager();
    }

    protected void conectarBase() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void desconectarBase() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void persistirEntidad(T object) {
        try {
            conectarBase();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo cargar");
            if (em.getTransaction().isActive()) { //si la trasaccion quedo abierta
                em.getTransaction().rollback(); //le decimos que vuelva atras xq hay error
            }
        } finally {
            desconectarBase();
        }
    }

    protected void actualizarEntidad(T object) {
        try {
            conectarBase();
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo actualizar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            desconectarBase();
        }
    }

    protected void borrarEntidad(T object) {
        try {
            conectarBase();
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo borrar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            desconectarBase();
        }
    }

}

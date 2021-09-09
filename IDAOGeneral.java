/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author ayrto
 * @param <T>
 */
public interface IDAOGeneral <T> {
    public boolean crear (T pojo);
    public boolean modificar (T pojo);
    public boolean eliminar (long clave);
    public T buscarById (long clave);
    public List <T> buscarAll(long clave);
}

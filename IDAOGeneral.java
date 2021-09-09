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
    public boolean eliminar (long codigo);
    public T buscarById (long codigo);
    public List <T> buscarAll(long codigo);
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;

public class FactoryDAO {
    public enum TypeDAO {EMPLEADO, DEPARTAMENTO};
    
    public static IDAOGeneral create(TypeDAO type) throws SQLException{
        
        IDAOGeneral dao = null;
        
        switch(type){
            case EMPLEADO:
                dao = new DAOEmpleado();
                break;
            case DEPARTAMENTO:
                dao = new DAODepartamento();
                break;
        }
        return dao;
    } 
    
}

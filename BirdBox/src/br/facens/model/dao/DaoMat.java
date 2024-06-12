/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.facens.model.dao;
import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Materiais;
import java.util.ArrayList;


public interface DaoMat extends DAO<Materiais> {
    ArrayList<Materiais> consultaMateria(String nome)throws DAOexception;
        public ArrayList<Materiais> findMateriasByMateriais(int id) throws DAOexception;
}

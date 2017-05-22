/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cnec.fcsl.exemplo.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.hibernate.Session;

public abstract class GenericDao<T> implements Serializable {

    private final Class<T> classe;

    public GenericDao(Class<T> classe) {
        this.classe = classe;
    }

    protected Session getSession() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return (Session) em.getDelegate();
    }

    public List<T> listar() {
        Session session = getSession();
        List<T> lista = session.createQuery("from " + classe.getName()).list();
        return lista;
    }

    public void salvar(T entidade) {
        Session session = getSession();
        session.getTransaction().begin();
        session.saveOrUpdate(entidade);
        session.getTransaction().commit();
    }
}

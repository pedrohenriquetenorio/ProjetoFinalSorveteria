/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.CaixaModel;

import java.util.List;
import java.util.Map;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;

/**
 *
 * @author pedro
 */
public class CaixaDAO {

    public EntityManager getEm() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteriaPU");
        return emf.createEntityManager();
    }

    public CaixaModel SalvarCaixa(CaixaModel caixa) {

        EntityManager em = getEm();
        em.getTransaction().begin();
        em.persist(caixa);
        em.getTransaction().commit();
        em.close();
        
        return caixa;
    }

    public void atualizar(CaixaModel caixa) {

        EntityManager em = getEm();
        em.getTransaction().begin();
        em.merge(caixa);
        em.getTransaction().commit();
        em.close();
    }

    public void excluir(int codCaixa) {

        EntityManager em = getEm();
        CaixaModel caixa = em.find(CaixaModel.class, codCaixa);
        em.getTransaction().begin();
        em.remove(caixa);
        em.getTransaction().commit();
        em.close();

    }

    // Busca por Caixa no banco de dados
    public CaixaModel Buscar(int codCaixa) {

        CaixaModel recebe = null;
        EntityManager em = getEm();
        em.getTransaction().begin();
        recebe = em.find(CaixaModel.class, codCaixa);
        em.getTransaction().commit();
        em.close();

        return recebe;
    }

}

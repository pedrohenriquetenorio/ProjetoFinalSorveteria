/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.CompraModel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pedro
 */
public class CompraDAO {

    public EntityManager getEm() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteriaPU");
        return emf.createEntityManager();
    }

    public CompraModel SalvarCaixa(CompraModel compra) {

        EntityManager em = getEm();
        em.getTransaction().begin();
        em.persist(compra);
        em.getTransaction().commit();
        em.close();
        return compra;
    }

    public void atualizar(CompraModel caixa) {

        EntityManager em = getEm();
        em.getTransaction().begin();
        em.merge(caixa);
        em.getTransaction().commit();
        em.close();
    }

    public void excluir(int codCompra) {

        EntityManager em = getEm();
        CompraModel compra = em.find(CompraModel.class, codCompra);
        em.getTransaction().begin();
        em.remove(compra);
        em.getTransaction().commit();
        em.close();

    }

    // Busca por Caixa no banco de dados
    public CompraModel Buscar(int codCompra) {

        CompraModel recebe = null;
        EntityManager em = getEm();
        em.getTransaction().begin();
        recebe = em.find(CompraModel.class, codCompra);
        em.getTransaction().commit();
        em.close();

        return recebe;
    }

}

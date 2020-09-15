/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.VendaModel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pedro
 */
public class VendaDAO {

    public class CaixaDAO {

        public EntityManager getEm() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteriaPU");
            return emf.createEntityManager();
        }

        public VendaModel SalvarCaixa(VendaModel venda) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.persist(venda);
            em.getTransaction().commit();
            em.close();
            return venda;
        }

        public void atualizar(VendaModel venda) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.merge(venda);
            em.getTransaction().commit();
            em.close();
        }

        public void excluir(int codVenda) {

            EntityManager em = getEm();
            VendaModel venda = em.find(VendaModel.class, codVenda);
            em.getTransaction().begin();
            em.remove(venda);
            em.getTransaction().commit();
            em.close();

        }

        // Busca por Caixa no banco de dados
        public VendaModel Buscar(int codVenda) {

            VendaModel recebe = null;
            EntityManager em = getEm();
            em.getTransaction().begin();
            recebe = em.find(VendaModel.class, codVenda);
            em.getTransaction().commit();
            em.close();

            return recebe;
        }

    }
}

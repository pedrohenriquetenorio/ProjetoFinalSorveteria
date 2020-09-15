/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.FuncionarioModel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pedro
 */
public class FuncionarioDAO {

   

        public EntityManager getEm() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteria2PU");
            return emf.createEntityManager();
        }

        public FuncionarioModel salvarFuncionario(FuncionarioModel caixa) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.persist(caixa);
            em.getTransaction().commit();
            em.close();
            return caixa;
        }

        public void atualizarFuncionario(FuncionarioModel caixa) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.merge(caixa);
            em.getTransaction().commit();
            em.close();
        }

        public void excluirFuncionario(int codFuncionario) {

            EntityManager em = getEm();
            FuncionarioModel funcionario = em.find(FuncionarioModel.class, codFuncionario);
            em.getTransaction().begin();
            em.remove(funcionario);
            em.getTransaction().commit();
            em.close();

        }

        // Busca por Caixa no banco de dados
        public FuncionarioModel buscarFuncionario(int codFuncionario) {

            FuncionarioModel recebe = null;
            EntityManager em = getEm();
            em.getTransaction().begin();
            recebe = em.find(FuncionarioModel.class, codFuncionario);
            em.getTransaction().commit();
            em.close();

            return recebe;
        }

    }


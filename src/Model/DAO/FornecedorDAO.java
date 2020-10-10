/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.FornecedorModel;
import Model.FuncionarioModel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author pedro
 */
public class FornecedorDAO {

    

        public EntityManager getEm() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteria2PU");
            return emf.createEntityManager();
        }
        
         public List<FornecedorModel> findAll() {
        
            EntityManager em = getEm();
            CriteriaQuery criteriaQuery = em.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(FuncionarioModel.class));
        
            return em.createQuery(criteriaQuery).getResultList();
    
        }
        
        public FornecedorModel Salvar(FornecedorModel fornecedor) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.persist(fornecedor);
            em.getTransaction().commit();
            em.close();
            return fornecedor;
        }
        
        public void atualizar(FornecedorModel dados) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.merge(dados);
            em.getTransaction().commit();
            em.close();
        }

        public void excluir(int codFornecedor) {
            System.out.println(codFornecedor + "Teste Codigo Fornecedor");
            EntityManager em = getEm();
            FornecedorModel fornecedor = em.find(FornecedorModel.class, codFornecedor);
            em.getTransaction().begin();
            em.remove(fornecedor);
            em.getTransaction().commit();
            em.close();

        }

        // Busca por Caixa no banco de dados
        public FornecedorModel Buscar(int codFornecedor) {

            FornecedorModel recebe = null;
            EntityManager em = getEm();
            em.getTransaction().begin();
            recebe = em.find(FornecedorModel.class, codFornecedor);
            em.getTransaction().commit();
            em.close();
            
            return recebe;
        }

    
    }


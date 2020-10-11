/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.FuncionarioModel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FuncionarioDAO {
       
        public EntityManager getEm() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteria2PU");
            return emf.createEntityManager();
        }
        
        public List<FuncionarioModel> findAll() {
        
            EntityManager em = getEm();
            CriteriaQuery criteriaQuery = em.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(FuncionarioModel.class));
        
            return em.createQuery(criteriaQuery).getResultList();
    
        }
        
        public CriteriaQuery Consulta (){
            EntityManager entityManager = getEm();
            
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            
            CriteriaQuery<FuncionarioModel> criteriaQuery = criteriaBuilder.createQuery(FuncionarioModel.class);
            //criteria.select(criteria.from(EmailDomainTrust.class));
            Root<FuncionarioModel> root = criteriaQuery.from(FuncionarioModel.class);
            
            criteriaQuery.select(root);
            
            return criteriaQuery;
        }
        

        public FuncionarioModel salvarFuncionario(FuncionarioModel funcionario) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();
            em.close();
            return funcionario;
        }

        public void atualizarFuncionario(FuncionarioModel funcionario) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.merge(funcionario);
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
        public FuncionarioModel buscarFuncionario(int codigo) {

            FuncionarioModel recebe = null;
            EntityManager em = getEm();
            em.getTransaction().begin();
            recebe = em.find(FuncionarioModel.class, codigo);
            em.getTransaction().commit();
            em.close();
            
            
            //public List<Pessoa> findByNome(String nome) {
//            EntityManager em = getEntityManager();
//            TypedQuery<Pessoa> query = em.createQuery("Select p FROM Pessoa p WHERE p.nome LIKE :nome", Pessoa.class);
//            query.setParameter("nome", "%" + nome + "%");
          
            return recebe;
//           
        }
        
        

    }


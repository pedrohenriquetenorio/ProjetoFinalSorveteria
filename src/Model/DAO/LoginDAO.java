/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;


import Model.LoginModel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author pedro
 */
public class LoginDAO {
    
      public EntityManager getEm() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteria2PU");
            return emf.createEntityManager();
        }
        
        public List<LoginModel> findAll() {
        
            EntityManager em = getEm();
            CriteriaQuery criteriaQuery = em.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(LoginModel.class));
        
            return em.createQuery(criteriaQuery).getResultList();
    
        }
        
        public CriteriaQuery Consulta (){
            EntityManager entityManager = getEm();
            
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            
            CriteriaQuery<LoginModel> criteriaQuery = criteriaBuilder.createQuery(LoginModel.class);
            //criteria.select(criteria.from(EmailDomainTrust.class));
            Root<LoginModel> root = criteriaQuery.from(LoginModel.class);
            
            criteriaQuery.select(root);
            
            return criteriaQuery;
        }
        

        public LoginModel salvarLogin(LoginModel login) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.persist(login);
            em.getTransaction().commit();
            em.close();
            return login;
        }

        public void atualizarLogin(LoginModel login) {

            EntityManager em = getEm();
            em.getTransaction().begin();
            em.merge(login);
            em.getTransaction().commit();
            em.close();
        }

        public void excluirLogin(int codLogin) {

            EntityManager em = getEm();
            LoginModel login = em.find(LoginModel.class, codLogin);
            em.getTransaction().begin();
            em.remove(login);
            em.getTransaction().commit();
            em.close();

        }

        // Busca por Caixa no banco de dados
        public List<LoginModel> buscarLogin(int codigo) {

            LoginModel recebe = null;
            EntityManager em = getEm();
            em.getTransaction().begin();
            recebe = em.find(LoginModel.class, codigo);
            em.getTransaction().commit();
            em.close();
            
            return (List<LoginModel>) recebe;   
            
        }
}

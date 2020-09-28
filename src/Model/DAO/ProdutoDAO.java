/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.FuncionarioModel;
import Model.ProdutoModel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author pedro
 */
public class ProdutoDAO {

      public EntityManager getEm(){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoSorveteria2PU"); 
      return emf.createEntityManager();
   }
      
    public ProdutoModel salvarProduto(ProdutoModel produto){
      
           EntityManager em = getEm();      
           em.getTransaction().begin();
           em.persist(produto);      
           em.getTransaction().commit();
           em.close();
        return produto;     
        
        
}
    public void atualizarProduto ( ProdutoModel produto){
        
        EntityManager em = getEm();
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();
        em.close();
   }
   
   public void excluirProduto (int codProduto){
       
       EntityManager em = getEm();
       ProdutoModel produto = em.find(ProdutoModel.class, codProduto);
       em.getTransaction().begin();
       em.remove(produto);
       em.getTransaction().commit();
       em.close();
       
   }
   
   // Busca por Caixa no banco de dados
    public ProdutoModel buscarPRoduto(int codProduto){
       
       ProdutoModel recebe = null;
       EntityManager em = getEm();
       em.getTransaction().begin();
       recebe = em.find(ProdutoModel.class, codProduto);
       em.getTransaction().commit();
       em.close();
       
    return recebe;  
    }
     // Busca por varios produtos  
    public List<ProdutoModel> findAll() {
        
            EntityManager em = getEm();
            CriteriaQuery criteriaQuery = em.getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from(ProdutoModel.class)); 
            return em.createQuery(criteriaQuery).getResultList();
    
        }
    
}


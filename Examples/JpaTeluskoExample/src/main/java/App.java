import antlr.actions.cpp.ActionLexer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("alien");
        EntityManager em = emf.createEntityManager();

//        Alien b = new Alien();
//        b.setId(102);
//        b.setName("Varsh");
//        b.setSpec("Green");
//        em.getTransaction().begin();
//        em.persist(b);
//        em.getTransaction().commit();
        Query q = em.createQuery("select e from Alien e");
        List<Alien> aliens = q.getResultList();
        for(Alien i : aliens)
        System.out.println(i);
    }
}

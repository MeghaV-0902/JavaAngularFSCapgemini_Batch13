import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main
{
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        client client = new client();
        client.setId(2);
        client.setName("bob");
        bank bank = new bank();
        bank.setName("wells fargo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.persist(bank);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}

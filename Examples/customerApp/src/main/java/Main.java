import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static final EntityManagerFactory emfac;
    private static final String PERSISTENCE_UNIT_NAME="Course";

    static
    {
        emfac = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
    public static EntityManager getEntityManager()
    {
        return emfac.createEntityManager();
    }

    public static void main(String[] args) {
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        Course c = new Course();
        c.setCid(1);
        c.setCname("English");
        c.setPrice(500.00);
        entityManager.persist(c);
        entityManager.getTransaction().commit();
        entityManager.clear();
        System.out.println("record inserted successfully");
    }
}

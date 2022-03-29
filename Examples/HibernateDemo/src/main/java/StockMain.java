import com.pack.coll.Stock;
import com.pack.coll.StockDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StockMain
{
    public static void main(String[] args) {
        EntityManagerFactory emr = Persistence.createEntityManagerFactory("stockcollection");
        EntityManager em = emr.createEntityManager();
        em.getTransaction().begin();
        StockDetails sd1 = new StockDetails();
        sd1.setStockname("Pens");
        sd1.setDate("23rdFeb2022");
        sd1.setDescription("White board markers");

        StockDetails sd2 = new StockDetails();
        sd2.setStockname("Pencils");
        sd2.setDate("23rdFeb2022");
        sd2.setDescription("Apsara pencils");

        StockDetails sd3 = new StockDetails();
        sd3.setStockname("T shirt");
        sd3.setDate("09thFeb2022");
        sd3.setDescription("Athleisure");

        Stock s1 = new Stock();
        s1.setStid(1);
        s1.setStname("stationary");
        s1.getStockDetails().add(sd1);
        s1.getStockDetails().add(sd2);


        Stock s2 = new Stock();
        s2.setStid(2);
        s2.setStname("Clothes");
        s2.getStockDetails().add(sd3);
        //em.getTransaction().begin();
        em.persist(s1);
        em.persist(s2);
        em.getTransaction().commit();
        em.clear();
        System.out.println("Succesfull");

    }
}

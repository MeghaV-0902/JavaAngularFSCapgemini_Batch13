import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateTestDemo
{
    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration
                .buildSessionFactory(builder.build());
        return sessionFactory;
    }
    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setUserName("Akshay");
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        vehicle.setVehicleName("BMW car");
        vehicle.setUser(user);
        vehicle2.setVehicleName("Audi car");
        vehicle2.setUser(user);

        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(vehicle);
        session.save(vehicle2);
        session.save(user);
        session.getTransaction().commit();;
        session.close();
        System.out.println("done");


    }
}

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class Main
{
    public static SessionFactory getSessionFactory()
    {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }
    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        UserDetails user2 = new UserDetails();

        Vehicle vehicle = new Vehicle();
        Vehicle vehicle2 = new Vehicle();

        vehicle.setVehicleName("Car");
        vehicle.getUser().add(user);
        vehicle.getUser().add(user2);

        vehicle2.setVehicleName("Jeep");
        vehicle2.getUser().add(user2);
        vehicle2.getUser().add(user);

        user.setUserName("First User");
        user2.setUserName("Second User");
        user.getVehicle().add(vehicle);
        user.getVehicle().add(vehicle2);
        user2.getVehicle().add(vehicle);
        user2.getVehicle().add(vehicle2);

        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(vehicle);
        session.save(vehicle2);
        session.save(user);
        session.save(user2);
        session.getTransaction().commit();
        session.close();

    }
}

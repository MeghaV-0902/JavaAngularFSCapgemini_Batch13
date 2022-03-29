
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Collection;
import java.util.Collections;

public class App
{
    public static SessionFactory getSessionFactory()
    {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        StandardServiceRegistryBuilder reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
        SessionFactory sessionFactory = con.buildSessionFactory(reg.build());
        return sessionFactory;
    }
    public static void main(String[] args)
    {
//        Laptop l1 = new Laptop();
//        l1.setLid(102);
//        l1.setLname("HP");
//
//
//        Student student = new Student();
//        student.setRollno(2);
//        student.setName("Akshay");
//        student.setMarks(40);
//        student.getLaptop().add(l1);
//        l1.getStudent().add(student);


        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        Student s1 = session.get(Student.class, 1);
//        session.save(l1);
//        session.save(student);
        System.out.println(s1.getLaptop());
//        Collection<Laptop> laps = s1.getLaptop();
//        for(Laptop l : laps)
//            System.out.println(l);
        session.getTransaction().commit();

    }
}

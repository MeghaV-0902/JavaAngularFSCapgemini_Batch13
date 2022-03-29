package com.pack.mainapp;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.pack.pojo.Employee;
public class mainapp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.employee");
        EntityManager em = entityManagerFactory.createEntityManager();

        // read the existing entries and write to console
        Query q = em.createQuery("select e from Employee e");
        List<Employee> employeeList = q.getResultList();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("Size: " + employeeList.size());

        em.getTransaction().begin();
        Employee emp = new Employee();
        emp.setName("megha");
        emp.setEmail("meghavasu9@gmail.com");
        emp.setDepartment("IT");
        em.persist(emp);
        em.getTransaction().commit();
        em.close();
    }
}


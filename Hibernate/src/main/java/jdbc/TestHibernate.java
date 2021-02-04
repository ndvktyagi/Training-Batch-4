package jdbc;

import org.hibernate.Session;

public class TestHibernate {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //Add new Employee object
        Employee emp = new Employee();
        emp.setId(108);
        emp.setFirstName("Daevik Tyagi");
        emp.setMobileNumber(9910455253L);

        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}

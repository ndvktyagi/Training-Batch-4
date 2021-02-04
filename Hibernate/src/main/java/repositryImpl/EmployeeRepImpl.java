package repositryImpl;

import entityBeans.EmployeeEntity;
import utills.HibernateUtil;
import org.hibernate.Session;
import repositry.EmployeeRep;

public class EmployeeRepImpl implements EmployeeRep {


    @Override
    public EmployeeEntity empGet(Long empId) {
        EmployeeEntity employeeEntity = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            employeeEntity = session.load(EmployeeEntity.class, empId);
            session.getTransaction().commit();

        } finally {
            HibernateUtil.shutdown();
        }
        return employeeEntity;
    }

    @Override
    public Long empSave(EmployeeEntity emp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Long result = (Long) session.save(emp);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        return result;
    }

    @Override
    public int empUpdate(EmployeeEntity emp) {
        return 0;
    }

    @Override
    public int empDelete(EmployeeEntity emp) {
        return 0;
    }


}

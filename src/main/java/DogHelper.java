import Entity.Dog;
import Entity.Owner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DogHelper {
    private final SessionFactory sessionFactory;

    public DogHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public Dog getDogByID(Long id) {
        Session session = sessionFactory.getCurrentSession();
        if (session == null) {
            session = sessionFactory.openSession();
        }
        return session.get(Dog.class, id);
    }

    public void putDogIntoDB(Dog dog) {
        Session session = sessionFactory.getCurrentSession();
        if (session == null) {
            session = sessionFactory.openSession();
        }
        try {
            session.beginTransaction();
            session.persist(dog);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}

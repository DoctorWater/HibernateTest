import Entity.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class OwnerHelper {
    private final SessionFactory sessionFactory;
    public OwnerHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    public List<Owner> getOwners(){
        Session session = sessionFactory.getCurrentSession();
        if(session == null){
            session = sessionFactory.openSession();
        }
        session.get(Owner.class, 1);
        return null;
    }
}

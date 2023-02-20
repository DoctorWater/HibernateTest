import org.hibernate.Session;

public class Start {
    public static void main(){
        Session session = HibernateUtil.getSessionFactory().openSession();
    }
}

import Entity.Dog;
import org.hibernate.Session;

public class Start {
    public static void main(String[] args){
        DogHelper dogHelper = new DogHelper();
        Dog dog = new Dog();
        dog.setName("Archi");
        dogHelper.putDogIntoDB(dog);
    }
}

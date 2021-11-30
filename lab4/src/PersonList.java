
import java.util.ArrayList;
public class PersonList implements ListType<Persona> {
    private ArrayList<Persona> personList;

    public PersonList() {
        personList = new ArrayList<Persona>();
    }

    @Override
    public void addIntoList(Persona a) {
        personList.add(a);
    }

    @Override
    public int getSize() {
        return personList.size();

    }
    public Persona getFromList(int i) throws GroupExeption{

            return personList.get(i);

    }

    @Override
    public String toString() {
        return "PersonList{" +
                "personList=" + personList +
                '}';

    }



}
import java.util.Objects;

public abstract class Persona implements Comparable {
    private String name;
    private int friendliness;
    public Persona(String name, int friendliness) {
        this.name = name;
        this.friendliness = friendliness;
        System.out.println(getName() + ": присоеденился к истории");
    }

    public int getFriendliness() {
        return friendliness;
    }

    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return friendliness == persona.friendliness && Objects.equals(name, persona.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, friendliness);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", friendliness=" + friendliness +
                '}';
    }
}

public class DefaultPersona extends Persona {
    public DefaultPersona(String name, int friendless) {
        super(name,friendless);
    }
    public void go() {
        System.out.println(getName() + "идёт");
    }
}

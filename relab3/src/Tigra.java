public class Tigra extends DefaultPersona{
    private int howmanytimesdisappear = 0;
    public Tigra(String name, int friendless) {

        super(name,friendless);
    }
    public void Waiting() {
        System.out.println( getName() + " их ждёт");
    }
    public void run(Group p) {
        if (p.getWalk().equals(TypeOfWalking.WalkingAlongside)) {
            System.out.print(getName() + " носится и описывает большие круги вокруг ");

        }
        else if (p.getWalk().equals(TypeOfWalking.inSingleFile)) {
            System.out.print(getName() + " описывает петли вокруг ");

        }
        else if (p.getWalk().equals(TypeOfWalking.onBothSides)) {
            System.out.print(getName() + " убегает то далеко вперед, то возвращается к группе ");
        }
    }
    public void HuntOnBunny() {
        double chance = Math.random() * 100;
        if (chance >= Math.random() * 100) {
            System.out.print("\n");
            System.out.format("Желание Тигры напасть на Кролика := %.2f" , chance );
            System.out.println("%");
            System.out.println("Тигра нападает на Кролика");

        }
        else {
            System.out.print("\n");
            System.out.format("Желание Тигры напасть на Кролика := %.2f", chance );
            System.out.println("%");
            System.out.println("Тигра не нападает на Кролика");

        }
    }
    public void Say() {
        System.out.println(getName() + " появляется и выпаливает:\"Чего же вы ? Ходу !\"");

    }
    public void disappear() {
        this.howmanytimesdisappear += 1;
        if (howmanytimesdisappear == 1) {
            System.out.println(getName() + " исчез в тумане");
        }
        else if (howmanytimesdisappear > 1) {
            System.out.println(getName() + " снова исчез");
        }
    }
}

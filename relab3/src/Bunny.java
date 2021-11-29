public class Bunny extends DefaultPersona{

    public Bunny(String name, int friendless) {
        super(name, friendless);
    }
    public void ComeToKenga(){
        System.out.println(" и подошел к Кенге");
    }
    public void TigraTurnout(Group a){
        if (a.getWhereIsTigra()){
            System.out.print(getName() + " Увидев Тигру");
            coverMouth();
            Whistle();
            ComeToKenga();

        }
    }
    public void Whistle(){
        System.out.print(" сказал:\"Положитесь на меня\"");
    }
    public void coverMouth(){
        System.out.print(", прикрыл рот лапкой и");
    }
}

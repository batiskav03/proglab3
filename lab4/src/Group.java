public class Group{
    Fog fog = new Fog();
    PersonList group = new PersonList();
    private boolean whereIsTigra = false;
    private TypeOfWalking walk = TypeOfWalking.DefaultWalk;
    private int km;

    public void showgroup() throws GroupExeption {
        if (group.getSize() == 0) {
            throw new GroupExeption("group is empty");
        } else {
            for (int i = 0; i < group.getSize(); i++) {
                if (i == (group.getSize() - 1)) {
                    System.out.print(group.getFromList(i).getName() + "a ");
                } else {
                    System.out.print(group.getFromList(i).getName() + "a, ");
                }
            }
        }

    }
    public void addtogroup(Persona a) {
        group.addIntoList(a);
        if (a.getClass().equals(Tigra.class)) {
            setWhereIsTigra(true);
        }
    }
    public void goToTheKengaHouse() {
        for (int i = 0; i < group.getSize(); i++) {
            if (i == (group.getSize() - 1)) {
                try {
                    System.out.print(group.getFromList(i).getName() + " ");
                } catch (GroupExeption e) {
                    e.printStackTrace();
                }

                km += 1;

            } else {
                try {
                    System.out.print(group.getFromList(i).getName() + ", ");
                } catch (GroupExeption e) {
                    e.printStackTrace();
                }
                km += 1;
            }
        }
        System.out.println("идут к дому Кенги");
    }
    public void goToTheBunnyHouse() {
        for (int i = 0; i < group.getSize(); i++) {
            if (i == (group.getSize() - 1)) {
                try {
                    System.out.print(group.getFromList(i).getName() + " ");
                } catch (GroupExeption e) {
                    e.printStackTrace();
                }

                km += 1;

            } else {
                try {
                    System.out.print(group.getFromList(i).getName() + ", ");
                } catch (GroupExeption e) {
                    e.printStackTrace();
                }
                km += 1;
            }
        }
        System.out.println("идут к дому Кролика");
    }


    public void goToThePigHouse() {
        for (int i = 0; i < group.getSize(); i++) {
            if (i == (group.getSize() - 1)) {
                try {
                    System.out.print(group.getFromList(i).getName() + " ");
                } catch (GroupExeption e) {
                    e.printStackTrace();
                }

                km += 1;

            } else {
                try {
                    System.out.print(group.getFromList(i).getName() + ", ");
                } catch (GroupExeption e) {
                    e.printStackTrace();
                }
                km += 1;
            }
        }
        System.out.println("идут к дому Пяточка");
    }
    public boolean getWhereIsTigra() {
        return whereIsTigra;
    }

    public void setWhereIsTigra(boolean whereIsTigra) {
        this.whereIsTigra = whereIsTigra;
    }


    public TypeOfWalking getWalk() {
        return walk;
    }

    public void setWalk(TypeOfWalking walk) throws GroupExeption {
        this.walk = walk;
        System.out.println("");
        System.out.print("Теперь группа из ");
        showgroup();
        WalkDescribe();
    }

    public void WalkDescribe() {
        if (walk.equals(TypeOfWalking.DefaultWalk)){
            System.out.println("идут как обычно");
            km += 1;
            fog.setDegree(1);
        }
        else if (walk.equals(TypeOfWalking.WalkingAlongside)){
            System.out.println("идут рядом");
            km += 1;
            fog.setDegree(3);
        }
        else if (walk.equals(TypeOfWalking.inSingleFile)){
            System.out.println("идут гуськом, друг за другом");
            km += 1;
            fog.setDegree(5);
        }
        else if (walk.equals(TypeOfWalking.onBothSides)){
            System.out.println("видит что по обе стороны тропинки встала колючая стена чертополоха");
            km += 1;
            fog.setDegree(10);
        }
    }
    public void getKm() throws GroupExeption {
        System.out.println("");
        System.out.print("Группа ");
        showgroup();
        System.out.println("прошла " + km + " киллометров");
    }
    public void ThinkAboutTigra() throws GroupExeption {
        if (fog.getDegree() == 10) {
            System.out.print("*Группа из ");
            showgroup();
            System.out.println(" думает, что Тигра исчез*");
        }
    }
    public void CantSayAnyThing() throws GroupExeption {
        System.out.print("Группа из ");
        showgroup();
        System.out.println(" не успевает ничего ему сказать");
    }
    public void descriptionFog(){
        System.out.println("");
        if (fog.getDegree() == 1) {
            System.out.println("Туман не наблюдается");
        }
        else if (fog.getDegree() == 3) {
            System.out.println("В воздухе можно было заметить нотки слабого тумана");
        }
        else if (fog.getDegree() == 5) {
            System.out.println("Туман начинал бросаться в глаза, но все попрежнему было видно");
        }
        else if (fog.getDegree() == 7) {
            System.out.println("Туман стоял густой, не всегда можно было разглядеть дальнее дерево, но все же было комфортно");
        }
        else if (fog.getDegree() == 10) {
            System.out.println("Туман был настолько густ, что Тигра стал временами пропадать");
        }
    }

}

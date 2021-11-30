public class CoolStory {
    public static void main(String[] args) throws FriendlessExeption,GroupExeption {
        Tigra Tigra = new Tigra("Тигра", 1);
        Bunny bunny = new Bunny("Кролик", 2);
        Bear vinni = new Bear("Винни-пух", 3);
        DefaultPersona ru = new DefaultPersona("Крошка Ру", 3);
        DefaultPersona pig = new DefaultPersona("Пятачок", 4);
        Group friends1 = new Group();
        Group tigran = new Group();
        Group solo = new Group(){
            public void goToThePigHouse() {
                System.out.println(group.getFromList(0).getName()+" идет к дому Пяточка");
            }
        };
        Bear.Thoughts thoughts = new Bear.Thoughts();
        tigran.addtogroup(Tigra);
        tigran.addtogroup(ru);
        solo.addtogroup(vinni);
        solo.goToThePigHouse();
        friends1.addtogroup(pig);
        friends1.addtogroup(vinni);
        vinni.setFear(vinni.bees);
        thoughts.thinkAboutBees();
        vinni.talkWithPig();
        friends1.goToTheBunnyHouse();
        friends1.addtogroup(bunny);
        bunny.talkwithgroupaboutplan();
        tigran.goToTheKengaHouse();
        HowFriendsAreWe(Tigra,ru);
        friends1.goToTheKengaHouse();
        Tigra.Waiting();
        bunny.TigraTurnout(tigran);
        friends1.setWalk(TypeOfWalking.WalkingAlongside);
        Tigra.run(friends1);
        friends1.showgroup();
        friends1.getKm();
        friends1.setWalk(TypeOfWalking.inSingleFile);
        friends1.descriptionFog();
        Tigra.run(friends1);
        friends1.showgroup();
        friends1.setWalk(TypeOfWalking.onBothSides);
        Tigra.run(friends1);
        friends1.showgroup();
        friends1.descriptionFog();
        Tigra.disappear();
        Tigra.HuntOnBunny();
        Tigra.HuntOnBunny();
        Tigra.HuntOnBunny();
        friends1.getKm();
        friends1.ThinkAboutTigra();
        Tigra.Say();
        friends1.CantSayAnyThing();
        Tigra.disappear();




    }
    public static void HowFriendsAreWe(Persona a, Persona b) {
        if ((a.getName().equals("Тигра") && b.getName().equals("Крошка Ру")) || (b.getName().equals("Тигра") && a.getName().equals("Крошка Ру"))) {
            System.out.println(a.getName() + " и " + b.getName() + " близкие друзья");
        }
        else if ((a.getFriendliness() + b.getFriendliness() < 10) && (a.getFriendliness() + b.getFriendliness() > 5)) {
            System.out.println(a.getName() + " и " + b.getName() + " хорошие друзья");
        } else if ((a.getFriendliness() + b.getFriendliness() > 0) && (a.getFriendliness() + b.getFriendliness() <= 5)) {
            System.out.println(a.getName() + " и " + b.getName() + " знакомые");
        }
    }
}


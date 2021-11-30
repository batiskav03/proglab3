

public class Bear extends Persona {
    public Bear(String name, int friendliness) throws FriendlessExeption {
        super(name, friendliness);
    }
    Bees bees = new Bees(false);
    private static boolean bearfear;
    private class Bees {
        private boolean honyDone;
        public Bees(boolean honyDone) {
            this.honyDone = honyDone;
        }
    }
    public void setFear(Bees e) {
        if (e.honyDone){
            bearfear = true;
        }
        else {
            bearfear = false;
        }
    }
    public static class Thoughts{
        public void thinkAboutBees() {

            if (bearfear) {
                System.out.println("Пух подумал о пчелах");
                System.out.println("Ему было страшно, так как он знал , что пчелы сегодня сделали весь мёд");
            }
            else {
                System.out.println("Пух подумал о пчелах");
                System.out.println("Ему было не страшно, но когда он себе представил весь мед, который пчелы не сделают в этот день, ему стало их страшно жалко");
            }
        }


    }
    public void talkWithPig() {
        boolean x;
        if (bearfear) {
            System.out.println("Пух рассказывает Пяточку о пчелах");
            x = true;
        }
        else {
            System.out.println("Почему то пух решает не говрить Пяточку свои мысли");
            x = false;
        }
        class bunnyanswer {
            public void answ() {
                if (x) {
                    System.out.println("Пяточок же,услышав о том что говорит Пух,начинает высказывать свои мысли про чащу леса");
                }
                else {
                    System.out.println("Не услышал от пуха ни слова, Пятачок решает продолжить, уже устоявшиюся, тишину");
                }
            }
        }
        bunnyanswer a = new bunnyanswer();
        a.answ();
    }


}

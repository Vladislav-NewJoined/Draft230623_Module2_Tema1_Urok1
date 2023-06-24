package lessons.java;

interface Animal {
    void say();
}
public class Draft0_Whole_Video_2_1_1 {
    static int catSayCounter = 0;
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void say () {
                System.out.println("mew");
                catSayCounter++;
                System.out.println(catSayCounter);
            }
        };
        Animal dog = new Animal() {
            @Override
            public void say () {
                System.out.println("gav");
            }
        };
        Animal duck = new Animal() {
            @Override
            public void say () {
                System.out.println("krya");
            }
        };
        cat.say();
        dog.say();
        duck.say();
    }
}
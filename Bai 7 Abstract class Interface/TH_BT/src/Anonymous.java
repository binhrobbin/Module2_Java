public class Anonymous {
    public static void main(String[] args) {
        Tester test = new Tester();
        test.testAbstract();
    }
}

      class Bird {
        void fly(){
            System.out.println("aaa");
        }
    }

    class Tester {

        public void testAbstract() {
//            final Bird bird = () -> System.out.println("flying");
            final Bird bird2 = new Bird() {
                @Override
                public void fly() {
                    System.out.println("flying aaaa");
                }
            };
            bird2.fly();
        }
    }

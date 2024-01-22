package Bt3_Fan;

public class RunFAN {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn_off(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(2);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}

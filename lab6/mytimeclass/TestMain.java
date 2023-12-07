package lab6.mytimeclass;

public class TestMain {
    public static void main(String[] args) {


        Mytime time1 = new Mytime(5, 5, 5);
        System.out.println(time1);
        time1.setHour(4);
        time1.setMinute(5);
        time1.setSecond(6);
        System.out.println(time1);
        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());

        time1.setTime(23, 59, 58);
        System.out.println(time1);
        System.out.println();

        System.out.println(time1.nextSecond());
        System.out.println(time1.nextSecond().nextSecond());

        System.out.println(time1.previousSecond());
        System.out.println(time1.previousSecond().previousSecond());
        System.out.println(time1);

        System.out.println(time1.nextMinute());
        System.out.println(time1.nextHour());
        System.out.println(time1.previousSHour().previousSHour());

    }
}

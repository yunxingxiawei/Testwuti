public class Ceshi01 {

    public static void main(String[] args) {

        byte b = 1;
        int i = 10;
        i = b+2;
        System.out.println(getType(i));
        System.out.println("打印语句改动了");
        System.out.println("gaile");
        System.out.println("IDEA集成GitHub后加了一句");

    }

    public static String getType(Object test) {
        //return test.getClass().getName().toString();
        return test.getClass().getName();

    }

}

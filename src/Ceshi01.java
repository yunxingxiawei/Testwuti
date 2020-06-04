public class Ceshi01 {

    public static void main(String[] args) {

        byte b = 1;
        int i = 10;
        i = b+2;
        System.out.println(getType(i));

    }

    public static String getType(Object test) {
        //return test.getClass().getName().toString();
        return test.getClass().getName();

    }

}

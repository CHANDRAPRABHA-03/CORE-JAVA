public class rotate {
    public static void main(String[] args) {
        String str = "hello";
        int rotate = 1;
        String rotated = str.substring(rotate) + str.substring(0, rotate);
        System.out.println("string " + str);
        System.out.println("rotated" + rotated);
    }}
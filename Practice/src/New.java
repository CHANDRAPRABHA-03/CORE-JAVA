public class New {
    public static void main(String[] args) {
        String name = "Chandra";
         String Updated = name.concat("V");
        System.out.println("Name : " + name);
        System.out.println("UpdatedName : " +Updated);
        String New_name = "ChandraV";

        if(Updated == New_name) {
            System.out.println("Matching");
        }
        else
        {
            System.out.println("Not Matching");
        }
    }
}

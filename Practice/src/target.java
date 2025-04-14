public class target{
    public static void main(String[] args) {
        int [] arr = { 1,9,8};
        int target = 9;

        boolean found = false;
        for(int num : arr){
            if(num == target){
                found = true;

            }
        }
        System.out.println(found ? "found" : "not found"
        );
    }
}
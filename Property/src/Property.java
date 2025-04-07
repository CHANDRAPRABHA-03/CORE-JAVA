public class Property {

    private  String propName;
    private String location;
    private double cost;
    private Site[] area;
    public Property(String propname,String location,double cost,Site[] area ){
       this.propName = propName;
       this.location =  location;
       this.cost = cost;
       this.area = area;
    }
    public void display (){
        System.out.println("Name :" +propName);
        System.out.println("Location :" +location);
        System.out.println("cost :" +cost);


    }

}

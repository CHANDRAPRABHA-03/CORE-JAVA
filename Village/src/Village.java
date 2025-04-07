public class Village {
    private String villagename;
    private int villageId;
    private Transport[] details;

    public Village(String villageName,int villageId, Transport[] details){
        this.villagename= villageName;
        this.villageId =villageId;
        this.details =details;
    }
    public void display(){
        System.out.println("VillageName :" +villagename );
        System.out.println("VillageId :" +villageId );

    }
}

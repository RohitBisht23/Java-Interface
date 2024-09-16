public class Main {
    public static void main(String[] args) {
        Hen henObj = new Hen();
        henObj.fly();

        //Interface as data-type
        Bird_interface obj1 = new Eagle();
        obj1.fly();
    }
}
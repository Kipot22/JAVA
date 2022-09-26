package school.lesson4.task4;
public class Park {
    String name;
    String schedule;
    int cost;

    public class ParkInner {
        public void launch (){
            System.out.println(name + " works " + schedule + ", " + "price " + cost );
        }
      /*  ParkInner parkInner = new ParkInner() {}
        public Park.ParkInner(String name, String schedule, int cost) {
            System.out.println(name + " works " + time + ", " + "price " + cost); }
        public void Pricelist() {
            System.out.println("Print");
        }*/
    }

    public static void main(String[] args) {
        ParkInner p = ParkInner.new ParkInner();
        p.launch();
       // new ParkInner("Rodeo", "10-16", 50);
    }
}






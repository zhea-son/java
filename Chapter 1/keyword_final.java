public class keyword_final {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}

final class Bike{
    final int speedlimit = 40;
    final void run(){
        System.out.println("Running");
        speedlimit = 60;
    }
}
class Enfield extends Bike{
    void run(){
        System.out.print("Classic 350 running");
    }
}
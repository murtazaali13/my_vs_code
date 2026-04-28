abstract class bike {
    abstract void run();
    void start() {
        System.out.println("bike is starting...");
    }
}
class honda extends bike {
    void run(){
        System.out.println("bike is running");
    }
}
public class abstractionn{
    public static void main(String[] args) {
        honda obj = new honda();
        obj.start();
        obj.run();
    }
}



interface InterfaceA {
    void play();
}

interface InterfaceB {
    void stop();
}

class MyPlayer implements InterfaceA, InterfaceB {

    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyPlayer player = new MyPlayer();

        player.play(); // from InterfaceA
        player.stop(); // from InterfaceB
    }
}
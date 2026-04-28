 import java.util.Random;
 public class random_number {
    public static void main(String[] args) {
        Random r = new Random();
        int a ;
        int b;
        int c;
        a = r.nextInt(1,7);
        b = r.nextInt(1,100);
        c = r.nextInt(150,160);
        boolean isHeads;
        isHeads = r.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");

        }
        else{
            System.out.println("TAILS");
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        

    }

}

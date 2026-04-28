import java.util.Scanner;
public class longest { //largest element 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements");
        int n = sc.nextInt();
        int longest; // its largest not longest
        int arr[] = new int[n];
        System.out.println("enter the elements:");

        for(int i = 0; i<n; i++){
             arr[i] = sc.nextInt();
        }
        longest = arr[0]; //largest not longest
        for(int i = 0; i<n; i++){
            if(arr[i] > longest){ 
                longest = arr[i];
            }
        }
        System.out.println("the largest element is: " + longest);
        sc.close();
    }

}

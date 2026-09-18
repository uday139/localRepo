
import java.util.*;

public class switch1 {
    public static void main (String [] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a num :");
        int a = sc.nextInt();

        switch (a) {
            case 1:System.out.println("ac is now on");
                break;
            case 2: System.out.println("its fan ");
                break;
            default: System.out.println("The windons are open");
                break;
        }

    }

}


import java.util.*;
public class new1 {
    public static void main(String [] arg){
        Scanner ne= new Scanner(System.in);
        int []z = new int [5];
        for(int i=0;i<5;i++){
            z[i]= ne.nextInt();

        }
        Arrays.sort(z);
        System.out.print(Arrays.toString(z));


    }
}

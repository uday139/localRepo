public class java2 {
    public static void main (String [] a){
        String q="Uday"; //this one is diffrrent than the bellow one 
        q = "sachin"; // but the name is same for both
        String abc=new String("sachin");
        System.out.println(q);
        String ab ="sachin";
        System.out.println(q==ab);
        System.out.println(ab.equals(q));
        System.out.println(q==abc);
    }
}

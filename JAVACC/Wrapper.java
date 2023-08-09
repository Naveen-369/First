public class Wrapper {
    public static void main(String args[]){
        Integer i=Integer.valueOf(789); //This is called "Boxing" and each of the Basic types are wrapped inside a classs called "wrapper class"
        System.out.println(i.intValue());   //.intValue() is for "Unboxing".
        Integer j=78;   //This is called "Auto-Boxing".
        System.out.println(j);  //Here we dont't use intValue() This is auto "unboxing".
        String inte="789";
        int ii=Integer.parseInt(inte);  //This is parsing -------- String converted into int and stored.
        System.out.println(ii);
        return;
    }
}

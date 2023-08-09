package main_topic_of_java;

class dep implements Cloneable{
    int id;
    String name;
    dep(int id, String name){
        this.id=id;this.name=name;
    }
    public Object clonObject () throws CloneNotSupportedException{
        return clone();
    }
    void update(String name){
        this.name=name;
    }
}

public class exception {
    public static void main(String arsg[]) throws CloneNotSupportedException{
        dep dd=new dep(56, "Naveen Kumar");
        dep df=(dep)dd.clonObject();
        System.out.println(df.id+"="+df.name);
        dd.update("Sand");
        System.out.println(df.id+"="+df.name);
        System.out.println(dd.id+"="+dd.name);
        return;
    }
}

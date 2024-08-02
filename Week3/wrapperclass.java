package Week3;

public class wrapperclass {
    public static void main(String[] args) {
        int x=25;
        Integer y=x; // autoboxing
        int z=y; //unboxing
        System.out.println(y);
        System.out.println(z);
        int a=499;
        int b=499;
        Integer c=499;
        Integer d=499;
        Integer f=27;
        Integer e=27;
        System.out.println(a==c);
        System.out.println(c==d);
        System.out.println(f==e);
    }
}

package Week3;

public class OOPss {
    static int num=4;
    public OOPss(){
        num++;
    }
    public static class Inner{
        public Inner(){}
        public static class Inner2{
            public Inner2(){}
        }
    }
}
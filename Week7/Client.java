package Week7;

public class Client {
    public static void main(String[] args) {
        Ac voltas = new Ac(true,25,"Right",10);
        System.out.println(voltas);
        voltas.Start=true;
        voltas.temp=25;
        voltas.swing="Right";
        voltas.Start=true;
        voltas.fanSpeed=10;
        System.out.println(voltas.temp);
        System.out.println(voltas.swing);
        Ac Haier=new Ac(true,25,"Right",10);
        Haier.temp=24;
        System.out.println(Haier.temp);
        Haier.Start=true;
        Haier.temp=25;
        Haier.swing="Right";
        Haier.Start=true;
        Haier.fanSpeed=10;
    }
}
public class Lambda {
    public static void main(String[] args) {
        Ilove i=null;
        i=(a,b)->System.out.println(a+" love "+b);
        i.love("you","me");
    }
}
interface Ilove{
    void love(String name,String name1);
}

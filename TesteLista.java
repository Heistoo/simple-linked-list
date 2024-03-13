import java.util.Random;

public class TesteLista{
public static void main(String[] args){
    Random r = new Random();
    Lista l = new Lista();
    System.out.println(l);
    for (int i=1; i<=10; i++){
        l.insereInicio(r.nextInt(10));
        System.out.println(l);
    }
}
}
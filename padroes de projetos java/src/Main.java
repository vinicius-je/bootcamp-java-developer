import padroes.singleton.SingletonEager;
import padroes.singleton.SingletonLazy;
import padroes.singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {

        //Testando o padrão Singleton
        SingletonEager se = SingletonEager.getInstance();
        System.out.println(se);

        SingletonLazy sl = SingletonLazy.getInstance();
        System.out.println(sl);

        SingletonLazyHolder slh = SingletonLazyHolder.getInstance();
        System.out.println(slh);

    }
}
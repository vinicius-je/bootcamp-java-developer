import padroes.facade.Facade;
import padroes.singleton.SingletonEager;
import padroes.singleton.SingletonLazy;
import padroes.singleton.SingletonLazyHolder;
import padroes.strategy.Car;
import padroes.strategy.Left;
import padroes.strategy.Right;

public class Main {
    public static void main(String[] args) {

        //Testando o padrão Singleton
        SingletonEager se = SingletonEager.getInstance();
        System.out.println(se);

        SingletonLazy sl = SingletonLazy.getInstance();
        System.out.println(sl);

        SingletonLazyHolder slh = SingletonLazyHolder.getInstance();
        System.out.println(slh);

        //Testando o padrão Strategy
        Right right = new Right();
        Car car = new Car();
        car.setDirection(right);
        car.moveTo();

        Left left = new Left();
        car.setDirection(left);
        car.moveTo();

        //Testando o padrão Facade
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }
}
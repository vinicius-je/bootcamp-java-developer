package padroes.strategy;

public class Left implements Direction {
    @Override
    public void moveTo() {
        System.out.println("Going to left direction");
    }
}

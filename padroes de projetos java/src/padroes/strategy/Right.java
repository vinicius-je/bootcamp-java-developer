package padroes.strategy;

public class Right implements Direction {
    @Override
    public void moveTo() {
        System.out.println("Going to right direction");
    }
}

package padroes.strategy;

public class Car {
    private Direction direction;

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    public void moveTo(){
        direction.moveTo();
    }
}

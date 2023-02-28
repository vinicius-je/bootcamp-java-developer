package entities.model;

import java.util.Objects;

public class Obj extends ObjTree<Obj>{
    Integer value;

    public Obj(Integer value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(value, obj.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Obj o) {
        int i = 0;

        if(this.value > o.value){
            i = 1;
        }else if(this.value < o.value){
            i = -1;
        }
        return  i;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

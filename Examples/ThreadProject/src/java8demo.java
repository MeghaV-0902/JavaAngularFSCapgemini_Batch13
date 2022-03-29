import java.util.*;
import java.util.function.Consumer;

class Car implements Comparable<Car>
{
    int id;
    String name;
    boolean gear;
    int doors;

    public Car(int id,String name, boolean gear, int doors) {
        this.id=id;
        this.name = name;
        this.gear = gear;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGear() {
        return gear;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gear=" + gear +
                ", doors=" + doors +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if(o.getId()>this.getId())
            return -1;
        else if(o.getId()==this.getId())
        {
            if(o.getName().compareTo(this.getName())>0)
            {
                return -1;
            }
            else if(o.getName().compareTo(this.getName())==0){
                return 0;
            }
            else
                return 1;
        }
        else
            return 1;

    }
}
public class java8demo
{
    public static void main(String[] args) {
       // Car car = new Car(1,"Audi", false, 4);
      //  Car car2 = new Car(3,"Ferarri",true,2);
        Car car3 = new Car(2,"Audi",false,2);

        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car(1,"Audi", false, 4));
        allCars.add(new Car(3,"Ferarri",true,2));
        allCars.add(car3);
        Collections.sort(allCars);

        allCars.forEach(i-> System.out.println(i));
    }
    public static int doubleIt(int i)
    {
        return i*2;
    }
}

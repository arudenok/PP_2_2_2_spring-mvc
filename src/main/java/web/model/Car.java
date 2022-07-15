package web.model;

public class Car {
    int id;
    String color;
    String nameCar;

    public Car(int id, String color, String nameCar) {
        this.id = id;
        this.color = color;
        this.nameCar = nameCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", nameCar='" + nameCar + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }
}

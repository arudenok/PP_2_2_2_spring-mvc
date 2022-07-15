package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars;
    private static int CAR_COUNT;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "black", "lada"));
        cars.add(new Car(++CAR_COUNT, "white", "volga"));
        cars.add(new Car(++CAR_COUNT, "orange", "opel"));
        cars.add(new Car(++CAR_COUNT, "red", "reno"));
        cars.add(new Car(++CAR_COUNT, "green", "nissan"));

    }

    @Override
    public List<Car> showCars(Integer count) {
        if(count == null){
            return cars.stream().limit(5).toList();
        }
        return cars.stream().limit(count).toList();
    }
}

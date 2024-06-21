package day12.Step2;

public class Step2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();
        car.speedUp();
        System.out.println("Car : " + car.speed);
//        System.out.println("Car : " + car.power);

        SportCar sportCar = new SportCar();
        sportCar.speedUp();
        System.out.println("SportCar : " + sportCar.speed);
        System.out.println("SportCar : " + sportCar.power);

        Car car2 = new Car();
        car2.speedUp();
        System.out.println("Car2 : " + car2.speed);
    }
}

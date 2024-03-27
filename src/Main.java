public class Main {
    public static void main(String[] args) {
        System.out.println("ДОБАВЛЯЕМ");
        GarageCar myGarage=new GarageCar();
        Car myCar1 = new Car("Ford", 200,4,"Mustang",2,false);
        Car myCar2 = new Car("LADA", 140,1, "Kalina", 4, false);
        Car myCar3 = new Car("Lexus", 130,5, "Alina", 4, true);
        Car myCar4 = new Car("BMW", 200,12, "Malina", 4, false);
        Car myCar5 = new Car("Audi", 210,555, "Nina", 4, true);
        myGarage.addCar(myCar1);
        myGarage.addCar(myCar2);
        myGarage.addCar(myCar3);
        myGarage.addCar(myCar4);
        myGarage.addCar(myCar5);
        Truck myTruck=new Truck("Dove",160,5,"DTS",700,true);
        myGarage.addCar(myTruck);
        myGarage.printGarage();
        System.out.println("УДАЛЯЕМ");
        myGarage.deleteAuto(myCar5);
        myGarage.deleteAuto(myCar2);
        myGarage.deleteAuto(myTruck);
        myGarage.deleteAuto(myCar1);
        myGarage.printGarage();
    }
}
import java.util.ArrayList;
public class GarageCar {
    private ArrayList<Auto> masCar=new ArrayList<Auto>();
    public void addCar(Auto m){
        masCar.add(m);
    }
    public GarageCar (){
    }
    public Boolean findCar(Auto m){
        return masCar.contains(m);
    }
    public GarageCar(ArrayList< Auto> n){
        masCar=n;
    }
    public void deleteAuto(Auto m){
        masCar.remove(m);
    }
    public void printGarage() { //для вывода на экран списка машин в гараже
        System.out.println("В гараже: ");
        for (Auto a : masCar){
            System.out.println("\t"+a.toString());
        }
    }
} 
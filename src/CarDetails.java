public class CarDetails {
    public static void main(String [] args){
        Car myCar = new Car ();
        myCar.brand="Tata";
        myCar.model="Tiago";
        myCar.year=2024;
        System.out.println("Brand:" +myCar.brand);
        System.out.println("Model:" +myCar.model);
        System.out.println("Year:" +myCar.year);
        //execute methods
        myCar.StartEngine();
        myCar.StopEngine();

    }
}

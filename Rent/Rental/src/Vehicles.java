import java.util.Scanner;
abstract  class Vehicles {
    private int carId;
    private String model;
    private String brand;
    private int isavilable;
    private double basePricePerDay;
    private double calcprice;
    public void setVehcles(int id , String b, String m , double p,int i){
        carId = id;
        model = m;
        basePricePerDay = p;
        brand = b;
        isavilable =i;
    }
    public int  getCarId() {
        return carId;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getisAvailable() {
        return isavilable;
    }
    void calculatePrice(int days){
         calcprice = basePricePerDay*days ;
    }
    public double getCalcprice() {
        return calcprice;
    }

}


// Car class
class Car extends Vehicles {
    //found by id
    public Car getCarById(int id) {
        for (int i = 0; i < car.length; i++) {
            if (car[i].getCarId() == id) {
                return car[i];
            }
        }
        return null; // not found
    }

    private int set_num;
    public void setSet_num(int s ){
        set_num = s;
    }
    public int getSet_num() {
        return set_num;
    }


    //car define
   private final Car[] car = new Car[6];
    public void car (){
      car[0] = new Car();
      car[0].setVehcles(1,"BMW","Q5",200,1);
      car[0].setSet_num(6);
      car[1] = new Car();
        car[1].setVehcles(2,"Toyota","camry",100,1);
        car[1].setSet_num(4);
      car[2] = new Car();
        car[2].setVehcles(3,"Hynday","Elantra",80,0);
        car[2].setSet_num(4);
      car[3] = new Car();
        car[3].setVehcles(4,"Mutsubishe","Outlander",150,1);
        car[3].setSet_num(6);
      car[4] = new Car();
        car[4].setVehcles(5,"BMW","Q5",100,0);
        car[4].setSet_num(4);
      car[5] = new Car();
        car[5].setVehcles(6,"Honda","Acord",100,1);
        car[5].setSet_num(4);

         // display info
        for (int i=0;i<car.length;i++){
            System.out.println(car[i].getCarId()+"-"+car[i].getBrand()+" "+car[i].getModel()+" "+car[i].getSet_num()+" Seat");
        }


    }


}
//Bike class
class Bike extends Vehicles {
    public Bike getBikeById(int id) {
        for (int i = 0; i < bike.length; i++) {
            if (bike[i].getCarId() == id) {
                return bike[i];
            }
        }
        return null; // not found
    }
    private int cc;
    // set cc
    public void setCc(int c){
        cc = c;
    }
    // get cc
    public int getCc(){
        return cc;
    }
    private final Bike[] bike = new Bike[6];
    void  bike(){
        bike[0] = new Bike();
        bike[0].setVehcles(1,"Yamaha","MT-07",60,1);
        bike[0].setCc(600);
        bike[1] = new Bike();
        bike[1].setVehcles(2,"Honda","CB500F",150,1);
        bike[1].setCc(800);
        bike[2] = new Bike();
        bike[2].setVehcles(3,"Kawasaki","Ninja 400",80,0);
        bike[2].setCc(500);
        bike[3] = new Bike();
        bike[3].setVehcles(4,"Suzuki","GSX-S750",120,1);
        bike[3].setCc(650);
        bike[4] = new Bike();
        bike[4].setVehcles(5,"BMW","G310R",100,0);
        bike[4].setCc(500);
        bike[5] = new Bike();
        bike[5].setVehcles(6,"BMW","Ducati",100,0);
        bike[5].setCc(650);
        for (int i=0;i<bike.length;i++){
            System.out.println(bike[i].getCarId()+"-"+bike[i].getBrand()+" "+bike[i].getModel()+" "+bike[i].getCc()+"CC");
        }
    }

}
//Truk class
class Truck extends Vehicles {
    //get car by id
    public Truck getTruckById(int id) {
        for (int i = 0; i < truck.length; i++) {
            if (truck[i].getCarId() == id) {
                return truck[i];
            }
        }
        return null; // not found
    }
    //found
    private int loadcapacity;
    // set the load capacity
    public void setLoadcapacity(int h) {
        loadcapacity = h ;
    }
    // get the load caacity
    public int getLoadcapacity() {
        return loadcapacity;
    }
    private final Truck[] truck = new Truck[6];
    void truck (){
        truck[0] = new Truck();
        truck[0].setVehcles(1,"Toyota","Tacoma",300,1);
        truck[0].setLoadcapacity(2000);
        truck[1] = new Truck();
        truck[1].setVehcles(2,"Ford","Ranger",200,1);
        truck[1].setLoadcapacity(1000);
        truck[2] = new Truck();
        truck[2].setVehcles(3,"Toyota","Dyna",350,0);
        truck[2].setLoadcapacity(2500);
        truck[3] = new Truck();
        truck[3].setVehcles(4,"Mitsubishi","Fuso Canter",360,1);
        truck[3].setLoadcapacity(2600);
        truck[4] = new Truck();
        truck[4].setVehcles(5,"Nissan","Cabstar",350,0);
        truck[4].setLoadcapacity(1500);
        truck[5] = new Truck();
        truck[5].setVehcles(6,"Isuzu","NPR",4000,1);
        truck[5].setLoadcapacity(3000);
        for (int i=0;i<truck.length;i++){
            System.out.println(truck[i].getCarId()+"-"+truck[i].getBrand()+" "+truck[i].getModel()+" "+truck[i].getLoadcapacity()+"Kg");
        }
    }
}
//Customer class
class Customer{
    private String name ;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name ;
    }
}


//Rental class
class RentalSys {
    Bike bike = new Bike();
    Customer p = new Customer();
    Truck c = new Truck();
    Car x = new Car();
    Scanner s = new Scanner(System.in);

    void rental() {

        System.out.println("----Welcome to Rental System----");
        System.out.println("we have cars , trucks and Bikes ");
        System.out.println("1- if you want Car ");
        System.out.println("2- if you want Truck");
        System.out.println("3- if you want Bike ");
        int z = s.nextInt();

        // if chose car
        if (z == 1) {
            x.car();
            System.out.println("write the Id of the car pls ");
            int f = s.nextInt();
            // check car availability
            Car selected = x.getCarById(f);

            if (selected.getisAvailable() >= 1) {
                System.out.println("what is your name ");
                p.setName(s.next());
                System.out.println("for how many day you want the car");
                int y = s.nextInt();
                selected.calculatePrice(y);
                System.out.println("The total price will be ;" + selected.getCalcprice() + "$");
                System.out.print("\nConfirm rental (Y/N): ");
                s.nextLine();
                String comf = s.nextLine();
                if (comf.equalsIgnoreCase("Y")) {
                    System.out.println("Thank you "+p.getName()+" ," +"\n" +"Your Car is : "+ selected.getBrand() + " " + selected.getModel());
                    System.out.println("The Car is successfully rented ");
                } else if (comf.equalsIgnoreCase("N")) {
                    System.out.println("The rent is canceled ");
                }
            } else {
                System.out.println("Car is not available!");
            }


        } else if (z == 2) {
            c.truck();
            System.out.println("write the Id of the Truck pls ");
            int q = s.nextInt();
            Truck selected = c.getTruckById(q);

            if (selected.getisAvailable() >= 1) {
                System.out.println("whatis your name ");
                p.setName(s.next());
                System.out.println("for how many day you want the car");
                int y = s.nextInt();
                selected.calculatePrice(y);
                System.out.println("The total price will be ;" + selected.getCalcprice() + "$");
                System.out.print("\nConfirm rental (Y/N): ");
                s.nextLine();
                String comf = s.nextLine();
                if (comf.equalsIgnoreCase("Y")) {
                    System.out.println("Thank you "+p.getName()+" ," +"\n" +"Your Truck is : "+ selected.getBrand() + " " + selected.getModel());
                    System.out.println("The Truck is successfully rented ");
                } else if (comf.equalsIgnoreCase("N")) {
                    System.out.println("The rent is canceled ");
                }
            } else {
                System.out.println("Truck is not available!");
            }

        } else if (z == 3) {
            bike.bike();
            System.out.println("write the Id of the Truck pls ");
            int q = s.nextInt();
            Bike selected = bike.getBikeById(q);
            if (selected.getisAvailable() >= 1) {
                System.out.println("whatis your name ");
                p.setName(s.next());
                System.out.println("for how many day you want the car");
                int y = s.nextInt();
                selected.calculatePrice(y);
                System.out.println("The total price will be ;" + selected.getCalcprice() + "$");
                System.out.print("\nConfirm rental (Y/N): ");
                s.nextLine();
                String comf = s.nextLine();
                if (comf.equalsIgnoreCase("Y")) {
                    System.out.println("Thank you "+p.getName()+" ," +"\n" +"Your Bike is : "+ selected.getBrand() + " " + selected.getModel());
                    System.out.println("The Bike is successfully rented ");
                } else if (comf.equalsIgnoreCase("N")) {
                    System.out.println("The rent is canceled ");
                }
            }
            else {
                System.out.println("Bike is not available!");
            }


        }
    }
}
//Main methode
class Main {
    public static void main(String[] args) {
        RentalSys f =  new RentalSys();
        f.rental();

    }
 }

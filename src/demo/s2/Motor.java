package demo.s2;

public class Motor {
    public String brand;
    // ham khoi tao - constructor
    public Motor(){
        System.out.println("Constructor Motor");
        //this.brand = "Ducati";
    }

    // getter
    public String getBrand(){
        return brand;
    }

    //setter
    public void setBrand(String brand){
        if(brand != "")
            this.brand = brand;
    }

    public void speedUp(){
        System.out.println("Moto speed up...");
    }

    public void run(){
        speedUp();
    }
}
package demo.s1;

public class Main {
    public static void main(String[] args){
//        car c = new Car();// tao lop doi tuong tu lop Car
        Car c; // khai bao 1 bien c co kieu du lieu Car --> chua co o nho
        c = new Car();// tao 1 o nho kich thuoc bang lop Car cho c --> tao doi tuong
        c.brand = "Toyota";
        c.run();
        // tao 1 doi tuong Car khac
        Car c2 = new Car();
        c2.brand = "Honda";
    }
}

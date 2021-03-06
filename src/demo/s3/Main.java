package demo.s3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int[] arrInt = new int[3];// khai bao 1 mang arrInt so nguyen 3 phan tu
        arrInt[0] = 10;
        arrInt[1] = 15;
        int[][] arrInt2 =  new int[3][4];
        arrInt2[0][0] = 3;
        arrInt2[1][3] = 7;
        //trong c
        // kich thuoc mang bi co dinh
        // int *p;
        // p =  (int *)malloc(5*sizeof(int)) --> sau do cho gia tri vao
        // p = (int *) realloc... -->cap phat dong  tu 5 o nho thanh 10
        // java - bo nho heap (heap memory)

        ArrayList arrL = new ArrayList();// doi tuong arraylist
        arrL.add(1);// them so 1 vao tap hop
        arrL.add("Hello");
        for (int i=0;i<arrL.size();i++){
            System.out.println(arrL.get(i));//y nghia tuong tu  arrL[i]
        }
        arrL.add(null);
        // gia sua quy uoc nhau la chi nap vao string -> kho su dung
        ArrayList<String> arrString =  new ArrayList<String>();
        arrString.add("Xin chao");
//        arrString.add(5);//error
//        ArrayList<int> arrI = new ArrayList<int>();// ArrayList chỉ làm việc với kiểu dữ liệu tham chiếu
        // khong phai dang nguyen thuy int float, double...
        // boxing - unboxing: int - Integer
        Integer x = new Integer(5);
        x += 4;// su dung y het int
        // muon 1 array list so nguyen
        ArrayList<Integer> arrinteger = new ArrayList<Integer>();
        arrinteger.add(4);

        ArrayList<Dog> arrDog = new ArrayList<Dog>();
        Dog d1 = new Dog();
        arrDog.add(d1);
        Dog d2 = new Dog();
        arrDog.add(d2);
        // muon them 100 con cho nua vao tap hop?
        for(int i=0;i<100;i++){
            arrDog.add(new Dog());
        }
        arrDog.get(100);// gia tri laf 1 con cho - 1 doi tuong tu class Dog
        // arrDog la tap hop co 2 con cho trong do
        for(int i=0;i<arrDog.size();i++){
            arrDog.get(i).run();
        }
        for(Dog d : arrDog){
            d.run();
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 10;
        String y = "hello";
        System.out.println(y+"---"+x);
        int n;
        // can nhap n tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        // tinh n giai thua
        int gt = 1;
        for(int i=1;i<=n;i++){
            gt*=i;
        }
        System.out.println(n+" giai thua = "+gt);
    }
}

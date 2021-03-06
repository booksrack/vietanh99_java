package lab.s3;

public class Main {
    public static void main(String[] args){
        Room r = new Room();
        r.setName("Phong so 1");
        r.setPosition("Tang 2");
        r.addUser("Bùi Minh Khải");
        r.addUser("Đinh Việt Hoàng");
        r.addUser("Lê Đức Quân");
        r.removeUser(2);
        for(String s: r.users){ // foreach
            System.out.println(s);
        }

//        for(int i=0;i<r.users.size();i++){
//            System.out.println(r.users.get(i));
//        }

    }
}
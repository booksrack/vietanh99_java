package lab.s4_2;

public class Main {
    public static void main(String[] args){
        SinhVien s1 = new SinhVien();
        s1.setId(1);
        s1.setFullName("bui minh khải");
        s1.setTel("0987654321");
        s1.setAddress("8 ton that thuyet");

        SinhVien s2= new SinhVien();
        s2.setId(2);
        s2.setFullName("Nguyen Van Duc");
        s2.setTel("123456789");
        s2.setAddress("so 9 ton that thuyet");

        LopHoc lh = new LopHoc();
        lh.setId(1);
        lh.setName("T2009M");
        lh.setRoom("A8");
        lh.addStudent(s1);
        lh.addStudent(s2);
        lh.printStudents();
    }
}
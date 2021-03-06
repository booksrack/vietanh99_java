package lab.s4_2;

import java.util.ArrayList;

public class LopHoc {
    int id;
    String name;
    String room;
    ArrayList<SinhVien> students;

    public LopHoc() {
        students = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void addStudent(SinhVien s){
        students.add(s);
    }

    public void removeStudent(int index){
        students.remove(index);
    }

    public void printStudents(){
        for (SinhVien s:students){
            System.out.println("MS:"+s.getId()+" Ten: "+s.getFullName());
        }
    }
}
import model.Group;
import model.Student;
import model.Teams;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Student>s1=new ArrayList<>();
        Student student1=new Student("ankit",18,1,"banasthali");
        Student student2=new Student("ashna",15,2,"chabahil");
        s1.add(student1);
        s1.add(student2);

        ArrayList<Student>s2=new ArrayList<>();
        Student student3=new Student("ashwin",18,3,"mitrapark");
        Student student4=new Student("shreebisha",16,4,"budhanilkantha");

        s2.add(student3);
        s2.add(student4);

        ArrayList<Student>s3=new ArrayList<>();
        Student student5=new Student("anshu",17,5,"mitrapark");
        Student student6=new Student("ashraya",17,6,"loktrantikchok");
        s3.add(student5);
        s3.add(student6);

        ArrayList<Teams>t1=new ArrayList<>();
        Teams teams1=new Teams("a",2,s1);
        Teams teams2=new Teams("b",3,s2);
        Teams teams3=new Teams("b",3,s3);
        t1.add(teams1);
        t1.add(teams2);
        t1.add(teams3);

        Group group1=new Group("lotutche",t1);
    }
}

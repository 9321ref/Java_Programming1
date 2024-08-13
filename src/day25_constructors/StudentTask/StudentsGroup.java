package day25_constructors.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {  //StudentsGrouo has a Student .there is a relationship between each other

    public String groupName;
    public int groupId;
    public ArrayList<Student> students;  // student class ismiyle ayni olmasi lazim ArrayList<Student>,Student icindeki argumentleri kullnmak icin
                                        // Student Objecti Constructor initiated yaptik .orada reference ettik
                                       //  public ArrayList<Student> students = new ArrayList<>(); bu sekildede yazilir
                                      // at the beginning size is : 0


    // A
    public StudentsGroup(String groupName, int groupId) {// creates the Student group object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        this.students = new ArrayList<>(); // at the beginning size is : 0
    }


    // B - first way for adding Student info to Arraylist
    public void addStudent(Student student) {
        students.add(student);
    }// --> Takes one student object,and adds it to the arraylist of students

/*
         parametre String degil cünkü Student Object kuruyoruz.
         bir ögrenciyle ilgili olan tüm instance variable dogrudan kullanabilmek icin,
        String kullanrsak örencinin adi,ID (String) olan nesnelri tek bilgiyi gecirebilirim
*/

    // --> overloading students into the Arraylist
    //  we do not need to write each student again
    public void addStudent(Student[] students){  // --> Array of students
        this.students.addAll(Arrays.asList(students));
    }// Takes one array of students, and add the array of student object by using

    //  second way for adding Student info to Arraylist
    public void addStudent(String name,int age, char gender,String id){
       Student student = new Student(name, age, gender, id); //--> create Student Object
       students.add(new Student(name,age,gender,id) );
    }// takes, name,age,gender,id of student info,creates student object by using the given info,then adds the student object to the array

    // E
    public void removeStudent(String id){
        students.removeIf( p -> p.id.equals(id));
    }//Takes the id and then removes the student object with specified id from arraylist of students to the arraylist of students

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId + '\'' +
                ", number of student=" + students.size() +
                '}';
    }
}


/*

	2. Create a custom class named StudentsGroup
Attributes:
   groupName, groupId, students (ArrayList<Students>)

     Add a constructor that can set the groupId and groupName
      initialize students arraylist in the constructor's body

 Methods:
addStudent(Student): adds the specified student to the students arrayList

removeStudent(id): removes the student with the specified id from the students arraylist

toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */
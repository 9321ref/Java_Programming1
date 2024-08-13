package day25_constructors.StudentTask;

public class TestObjects {

    public static void main(String[] args) {

        // yeni Student böyle tek tek ekleyebilirsin
        Student student1 = new Student("Enes",29,'M',"A16");
        Student student2 = new Student("Sevde",30,'F',"F16");
        Student student3 = new Student("Hasan",33,'M',"C16");
        Student student4 = new Student("Nurefsan",24,'F',"D16");
        Student student5 = new Student("Esad",31,'M',"E16");

/*
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);

        */
        // overloading ypark yeni ögrnci ekleyebilirsn
        Student[] students = {student2,student3,student4,student5};

        StudentsGroup group1 =new StudentsGroup("Java Turtles",1);

        group1.addStudent(student1);

        group1.addStudent(students);

        //yeni student böyle ekleyebilirsn
        group1.addStudent("Zeynep",30,'F',"Z16");

        System.out.println(group1);

         // remove
        group1.removeStudent("A16");
        group1.removeStudent("C16");
        System.out.println(group1);

        System.out.println("--------------------------------------------------------");

        for (Student each : group1.students){
            System.out.println(each.name +" : " +each.id);
        }
        System.out.println("--------------------------------------------------------");

        StudentsGroup group2 =new StudentsGroup("Java Turtles",2);
        StudentsGroup group3 =new StudentsGroup("Java Turtles",3);
        StudentsGroup group4 =new StudentsGroup("Java Turtles",4);

        StudentsGroup[] groups = {group1,group2,group3,group4};







    }
}



/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object's students list
 */
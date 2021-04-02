import java.util.*;

public class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    /**
     * Find all registered students.
     *
     * @return Set of all registered students
     */
    public static Set<Student> findAllStudents() {
        final Student alan = new Student("Alan Turing", 42, "Cryptography");
        final Student ada = new Student("Ada Lovelace", 37, "Mathematics");
        final Student steve = new Student("Steve Jobs", 56, "Telematics");
        final Student mary = new Student("Mary Kenneth Keller", 72, "Computer Science");
        Set<Student> students = new HashSet<>();
        students.add(alan);
        students.add(steve);
        students.add(ada);
        students.add(mary);
        return students;
    }

    /**
     * Find associated department for a student.
     *
     * @param name Name of a student
     * @returns Corresponding department of the student or null if no student was found
     **/
    public static String findDepartmentByStudentName(final String name) {

/*        Set mySet = new HashSet() ;
        mySet.add("0");
        mySet.add("1");
        mySet.add("0");

        Object[] arrayItem = uniqueItem.toArray();
        for(int i = 0; i < uniqueItem.size();i++){
            System.out.println("Item "+i+" "+arrayItem[i].toString());
        }


        Set mySet = findAllStudents();
        Object[] myArray = mySet.toArray();
        String value1 = myArray[0].toString();
        String value2 = myArray[1].toString();
        String value3 = myArray[2].toString();
        String value4 = myArray[3].toString();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);   */


    return "";}

        public static void main(String[] args) {

//        for (Object student : findAllStudents()) {
//                System.out.println(student);
//        }
            Student std = new Student("Alan",35, "Crypto");

        System.out.println(std.getName());
        System.out.println(std.getAge());
        System.out.println(std.getDepartment());

        findDepartmentByStudentName("alan");
        }
    }


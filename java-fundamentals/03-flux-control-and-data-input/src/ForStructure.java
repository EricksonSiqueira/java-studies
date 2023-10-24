public class ForStructure {
    public static void main(String[] args) {
        for(int index = 1; index <= 10 ; index ++) {
            String log = "O número atual é " + index;
            System.out.println(log);
        }

       String[] students = { "MARCOS", "JHON", "LUCAS", "PATRICIA"};
       String log;

       int totalStudents = students.length;

       log = "The list of students has " + totalStudents + " students";

       int registration;
       for(int index = 0; index < students.length; index++) {
        registration = index + 1;
        log = "Registration: " + registration + " | Student: " + students[index] + "\n";
        System.out.println(log);
       }
    }
}

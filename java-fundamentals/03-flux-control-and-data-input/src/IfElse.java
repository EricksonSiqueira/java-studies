public class IfElse {
    public static void main(String[] args) {
        float grade = 5.5f;

        if(grade >= 7) {
            System.out.println("Approved");
        } else if(grade >= 6) {
            System.out.println("Make bonus exam");
        } else {
            System.out.println("Repproved");
        }
    }
}

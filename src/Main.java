public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT", 0.20); // Sözlü notunun etkisi %20
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.30); // Sözlü notunun etkisi %30
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.25); // Sözlü notunun etkisi %25

        Teacher t1 = new Teacher("Hakan Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Hoca","90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Hoca", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ahmet", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40); // Sözlü not ve sınav notu
        s1.isPass();

        Student s2 = new Student("Mehmet", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40); // Sözlü not ve sınav notu
        s2.isPass();

        Student s3 = new Student("Ali", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,100,40); // Sözlü not ve sınav notu
        s3.isPass();

    }
}
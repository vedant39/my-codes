class Students{
    int roll ;
    String Name;
    int marks;
}
public class userarey
{
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.roll = 1;
        s1.Name = "NAVIN";
        s1.marks = 89;

        Students s2 = new Students();
        s2.roll = 2;
        s2.Name = "SANSKRUTI";
        s2.marks = 78;

        Students s3 = new Students();
        s3.roll = 3;
        s3.Name = "SANSKAR";
        s3.marks = 93;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Students student : students)
            System.out.println(student.roll + ")" + student.Name + ":" + student.marks);
    }
}

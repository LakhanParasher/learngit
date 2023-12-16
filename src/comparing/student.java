package comparing;

public class student implements Comparable<student> {
    int rollno;
    double marks ;
    public  student(int rollno, double marks){
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public int compareTo(student o) {
        int diff = (int)(this.marks-o.marks);
        return diff;
    }
}

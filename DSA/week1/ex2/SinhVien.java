package DSA.week1.ex2;

public class SinhVien {
    private int id;
    private double gpa;

    public SinhVien(int id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", gpa=" + gpa +
                '}';
    }

}

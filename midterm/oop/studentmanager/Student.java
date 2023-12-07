package midterm.oop.studentmanager;

public class Student implements MyStudentComparable {
    private String id;
    private String lastname;
    private String firstname;
    private int yearOfBirth;
    private double mathsGrade;
    private double physicsGrade;
    private double chemistryGrade;

    private Student() {
    }


    public static class StudentBuilder {
        private String id;
        private String lastname;
        private String firstname;
        private int yearOfBirth;
        private double mathsGrade;
        private double physicsGrade;
        private double chemistryGrade;

        public StudentBuilder(String id) {
            this.id = id;
        }

        public StudentBuilder withLastname(String lastname) {
            /* TODO */
            this.lastname = lastname;
            return this;
        }

        public StudentBuilder withFirstname(String firstname) {
            /* TODO */
            this.firstname = firstname;
            return this;
        }

        public StudentBuilder withYearOfBirth(int yearOfBirth) {
            /* TODO */
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public StudentBuilder withMathsGrade(double mathsGrade) {
            /* TODO */
            this.mathsGrade = mathsGrade;
            return this;
        }

        public StudentBuilder withPhysicsGrade(double physicsGrade) {
            /* TODO */
            this.physicsGrade = physicsGrade;
            return this;
        }

        public StudentBuilder withChemistryGrade(double chemistryGrade) {
            /* TODO */
            this.chemistryGrade = chemistryGrade;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.id = this.id;
            student.lastname = this.lastname;
            student.firstname = this.firstname;
            student.yearOfBirth = this.yearOfBirth;
            student.mathsGrade = this.mathsGrade;
            student.physicsGrade = this.physicsGrade;
            student.chemistryGrade = this.chemistryGrade;
            return student;
        }
    }

    public String getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getMathsGrade() {
        return mathsGrade;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public double getChemistryGrade() {
        /* TODO */
        return chemistryGrade;
    }

    public double getAverageGrade() {
        /* TODO */
        return getChemistryGrade() + getPhysicsGrade() + getMathsGrade() / 3.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", mathsGrade=" + mathsGrade +
                ", physicsGrade=" + physicsGrade +
                ", chemistryGrade=" + chemistryGrade +
                '}';
    }

    /**
     * Phương thức đưa ra tiêu chí so sánh 2 đối tượng kiểu Student sao cho
     * thứ tự tăng dần theo tên và sau đó đến họ.
     *
     * @param another
     * @return
     */
    @Override
    public int compareTo(Student another) {
        /* TODO */
        int firstNameComparison = this.firstname.compareTo(another.firstname);

        // If first names are the same, compare last names
        if (firstNameComparison == 0) {
            return this.lastname.compareTo(another.lastname);
        } else {
            return firstNameComparison;
        }
    }
}

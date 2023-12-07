package midterm.oop.studentmanager;

import java.util.*;

public class StudentManager {
    private List<Student> studentList;

    public StudentManager() {
        this.studentList = new LinkedList<>();
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     *
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if (index < 0 || limit > studentList.size()) {
            return false;
        }
        return true;
    }

    public List<Student> getStudentList() {
        /* TODO */
        return studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     *
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        studentList.add(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index, chỉ thêm vào nếu index có giá trị
     * nằm trong đoạn từ [0 - length], trong đó length là số sinh viên trong danh sách hiện tại.
     *
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        studentList.add(index, student);
    }

    /**
     * Xóa sinh viên ở vị trí index, chỉ xóa được nếu index nằm trong đoạn [0 - (length - 1)],
     * trong đó length là số sinh viên trong danh sách hiện tại.
     *
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        studentList.remove(index);
    }

    /**
     * Lấy ra sinh viên ở vị trí index.
     *
     * @param index
     * @return
     */
    public void studentAt(int index) {
        /* TODO */
        studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự tăng dần theo tên và sau đó đến họ.
     *
     * @return
     */
    public List<Student> sortStudentByName() {
        /* TODO */
        List<Student> list = new ArrayList<>(studentList);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // Compare last names first
                int lastNameComparison = o1.getLastname().compareTo(o2.getLastname());

                // If last names are the same, compare first names
                if (lastNameComparison != 0) {
                    return o1.getFirstname().compareTo(o2.getFirstname());
                } else {
                    return lastNameComparison;
                }
            }
        });
        return list;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự tăng dần theo tiêu chí, đầu tiên so sánh điểm trung bình,
     * nếu điểm trung bình bằng nhau thì so sánh điểm toán.
     * Sử dụng giao diện MyStudentComparator để thực hiện tiêu chí sắp xếp.
     *
     * @return
     */
    public List<Student> sortByGradeIncreasing() {
        /* TODO */
        List<Student> list = new ArrayList<>(studentList);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // Compare average grades first
                int avgGradeComparison = Double.compare(o1.getAverageGrade(), o2.getAverageGrade());

                // If average grades are the same, compare math grades
                if (avgGradeComparison == 0) {
                    return Double.compare(o1.getMathsGrade(), o2.getMathsGrade());
                } else {
                    return avgGradeComparison;
                }
            }
        });

        return list;
    }


    /**
     * Sắp xếp danh sách sinh viên theo thứ tự giảm dần theo tiêu chí, đầu tiên so sánh điểm trung bình,
     * nếu điểm trung bình bằng nhau thì so sánh điểm toán.
     * Sử dụng giao diện MyStudentComparator để thực hiện tiêu chí sắp xếp.
     *
     * @return
     */
    public List<Student> sortByGradeDecreasing() {
        /* TODO */
        List<Student> list = new ArrayList<>(studentList);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // Compare average grades first in descending order
                int avgGradeComparison = Double.compare(o2.getAverageGrade(), o1.getAverageGrade());

                // If average grades are the same, compare math grades in descending order
                if (avgGradeComparison == 0) {
                    return Double.compare(o2.getMathsGrade(), o1.getMathsGrade());
                } else {
                    return avgGradeComparison;
                }
            }
        });

        return list;
    }

    /**
     * Lọc ra howMany sinh viên có kết quả tốt nhất, theo tiêu chí đầu tiên so sánh điểm trung bình,
     * nếu điểm trung bình bằng nhau thì so sánh điểm toán.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestGrade(int howMany) {
        /* TODO */
        List<Student> list0 = new ArrayList<>(howMany);
        List<Student> list = new ArrayList<>(studentList);
        double maxHighestGrade = list.get(0).getAverageGrade();
        for (int i = 0; i < list.size(); i++) {
            if (maxHighestGrade <= list.get(i).getAverageGrade()) {
                maxHighestGrade = list.get(i).getAverageGrade();
            }
        }
        int index = 0;
        for (Student x : studentList) {
            if(x.getAverageGrade() == maxHighestGrade){
                list0.add(x);
            }
        }
        return list0;
    }

    /**
     * Lọc ra howMany sinh viên có kết quả thấp nhất, theo tiêu chí đầu tiên so sánh điểm trung bình,
     * nếu điểm trung bình bằng nhau thì so sánh điểm toán.
     *
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestGrade(int howMany) {
        /* TODO */
        List<Student> list0 = new ArrayList<>(howMany);
        List<Student> list = new ArrayList<>(studentList);
        double minHighestGrade = list.get(0).getAverageGrade();
        for (int i = 0; i < list.size(); i++) {
            if (minHighestGrade >= list.get(i).getAverageGrade()) {
                minHighestGrade = list.get(i).getAverageGrade();
            }
        }
        int index = 0;
        for (Student x : studentList) {
            if(x.getAverageGrade() == minHighestGrade){
                list0.add(x);
            }
        }
        return list0;
    }

    public static String idOfStudentsToString(List<Student> studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student student : studentList) {
            idOfStudents.append(student.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
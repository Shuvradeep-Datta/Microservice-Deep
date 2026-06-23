import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Student {
    private String name;
    private double grade;
    private String subject;

    public Student(String name, double grade, String subject) {
        this.name = name;
        this.grade = grade;
        this.subject = subject;
    }

    public String getName() { return name; }
    public double getGrade() { return grade; }
    public String getSubject() { return subject; }

    @Override
    public String toString() {
        return "Student(name='" + name + "')";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return Double.compare(s.grade, grade) == 0 &&
                Objects.equals(name, s.name) &&
                Objects.equals(subject, s.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, subject);
    }
}

class StudentGradeProcessingManager {

    // 1️⃣ Average grade per subject
    public Collector<Student, ?, Map<String, Double>> getSubjectAverageGrade() {
        return Collectors.groupingBy(
                Student::getSubject,
                Collectors.averagingDouble(Student::getGrade)
        );
    }

    // 2️⃣ Filter students above a threshold for a subject
    public Predicate<Student> filterBySubjectGrade(String subject, double grade) {
        return s -> s.getSubject().equals(subject) && s.getGrade() > grade;
    }

    // 3️⃣ Top N students by grade for a subject
    public Stream<Student> getTopStudents(Stream<Student> studentStream, String subject, int top) {
        return studentStream
                .filter(s -> s.getSubject().equals(subject))
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .limit(top);
    }

    // 4️⃣ Median per subject WITHOUT using gradesList in ArrayList constructor
    public Collector<Student, ?, Map<String, Double>> getMedianForSubject() {
        return Collectors.groupingBy(
                Student::getSubject,
                Collectors.collectingAndThen(
                        Collectors.mapping(
                                Student::getGrade,
                                Collectors.toCollection(ArrayList::new) // directly collects to ArrayList
                        ),
                        sortedGrades -> {
                            Collections.sort(sortedGrades); // sort in-place
                            int size = sortedGrades.size();
                            if (size == 0) return 0.0;
                            if (size % 2 == 1) return sortedGrades.get(size / 2);
                            return (sortedGrades.get(size / 2 - 1) + sortedGrades.get(size / 2)) / 2.0;
                        }
                )
        );
    }
}
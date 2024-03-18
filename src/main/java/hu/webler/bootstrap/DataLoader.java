package hu.webler.bootstrap;

import hu.webler.model.Course;
import hu.webler.model.Student;
import hu.webler.model.Teacher;
import hu.webler.value.Gender;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    public static void  LoadData() {

        Course course = new Course("Java programming");
        Student student = new Student("Oszkár", null, "Leopold", Gender.MALE, 1958);
        System.out.println(student);
        String learning = student.doSomething();
        System.out.println(learning);
        Teacher teacher = new Teacher("Csaba", "", "Vadász", Gender.MALE);
        System.out.println(teacher);
        String teaching = teacher.doSomething();
        System.out.println(teaching);
        System.out.println("---------------------");
        course.addStudent(student);
        course.printStudentList(course);
        Student szandi = new Student("Szandi", null, "Leopold", Gender.FEMALE, 1990);
        course.addStudent(szandi);
        System.out.println(course);
        Student csaba = new Student("Csaba", null, "Vadász", Gender.MALE, 1979);
        course.addStudent(csaba);
        System.out.println(course);
        course.removeStudent(csaba);
        System.out.println(course);
    }
}

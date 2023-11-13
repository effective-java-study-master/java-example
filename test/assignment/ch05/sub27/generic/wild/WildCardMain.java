package assignment.ch05.sub27.generic.wild;

import java.util.Arrays;

public class WildCardMain {

    // generic type 을 매개변수|리턴타입으로 사용할 때, 타입 파라미터를 제한할 목적
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + "   naems: " + Arrays.toString(course.getStudents()));
    }
    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + "   naems: " + Arrays.toString(course.getStudents()));
    }
    //  student 를 상속받은 클래스 또는 본인
    public static void registerCourseStudentUpper(Course<? super Student> course) {
        System.out.println(course.getName() + "   naems: " + Arrays.toString(course.getStudents()));
    }

    public static void doMain() {
        registerCourse(new Course<Person>("일반인 과정", 5));
        registerCourse(new Course<Student>("학생 과정", 3));
        registerCourse(new Course<Worker>("근로자 과정", 10));
        registerCourse(new Course<HighStudent>("학생 과정", 13));

//        registerCourseStudent(new Course<Person>("일반인 과정", 5));
        registerCourseStudent(new Course<Student>("학생 과정", 3));
//        registerCourseStudent(new Course<Worker>("근로자 과정", 10));
        registerCourseStudent(new Course<HighStudent>("학생 과정", 13));

        registerCourseStudentUpper(new Course<Person>("일반인 과정", 5));
        registerCourseStudentUpper(new Course<Student>("학생 과정", 3));
//        registerCourseStudentUpper(new Course<Worker>("근로자 과정", 10));
//        registerCourseStudentUpper(new Course<HighStudent>("학생 과정", 13));
    }

    public static void main(String[] args) {
        doMain();
        System.out.println("==============================");

        registerCourse(new Course<Person>("일반인 과정", 5));
        registerCourse(new Course<Student>("학생 과정", 3));
        registerCourse(new Course<Worker>("근로자 과정", 10));
        registerCourse(new Course<HighStudent>("학생 과정", 13));

        Course<Person> personCourse = new Course<>("일반인 과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new Person("학생"));
        personCourse.add(new Person("고딩"));

        Course<Student> studentCourse = new Course<>("ssstudent", 3);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고딩"));

        Course<HighStudent> highStudentCourse = new Course<>("high", 3);
        highStudentCourse.add(new HighStudent("고딩"));

        Course<Worker> workerCourse = new Course<>("직장인", 3);
        workerCourse.add(new Worker("직장인"));


        registerCourse(personCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        registerCourse(workerCourse);

        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);

        registerCourseStudentUpper(personCourse);

    }
}

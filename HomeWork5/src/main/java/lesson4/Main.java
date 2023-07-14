package lesson4;

import lesson4.controllers.GroupController;
import lesson4.controllers.StudentController;
import lesson4.controllers.TeacherController;
import lesson4.repositories.StudentRepository;
import lesson4.repositories.TeacherRepository;
import lesson4.services.GroupService;
import lesson4.services.StudentService;
import lesson4.services.TeacherService;
import lesson4.view.GroupView;
import lesson4.view.SortType;
import lesson4.view.StudentView;
import lesson4.view.TeacherView;

public class Main {

    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;

    private static TeacherRepository teacherRepository = new TeacherRepository();
    private static TeacherService teacherService = new TeacherService(teacherRepository);
   private static TeacherController teacherController = new TeacherController(teacherService);

    public static void main(String[] args) {
        StudentView view = getStudentController();
        GroupView groupView = getGroupView();
        TeacherView viewTeach = new TeacherView(teacherController);
//        -------------------------------------------------------------------------

        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "10А");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11А");

        viewTeach.create("Vladimir Vladimirovich Putin", 65, "000000", "11А");
        viewTeach.create("Zhirinovsky Vladimir Volfovich", 73, "11111", "11А");

        groupView.printAllFromGroup("11А");
//        groupView.printAllFromGroup("11А");
//        view.sendOnConsole();
//        view.sendOnConsole(SortType.NAME);
//        view.sendOnConsole(SortType.ID);
        view.sendOnConsole();


//        view.removeUser("Ivan Morozov");
//        viewTeach.removeUser("Vladimir Vladimirovich Putin");

//        viewTeach.sendOnConsole(SortType.ID);


        view.sendOnConsole();
        viewTeach.sendOnConsole();

    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService, teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }


}

package assignment.ch04.sub23.현우;

/* Q. 아래는 태그 달린 클래스이다. 계층구조로 바꾸어라 */

public class Question {
    enum Project {KB, HANA}
    final Project project;

    String name;
    int floor;
    String meetingRoom;


    public Question(String name, int floor) {
        project = Project.KB;
        this.name = name;
        this.floor = floor;
    }

    public Question(String name, String meetingRoom) {
        project = Project.HANA;
        this.name = name;
        this.meetingRoom = meetingRoom;
    }

    public String status() {
        switch (project) {
            case KB:
                return "KB 상태 : 울고싶다...";
            case HANA:
                return "HANA 상태 : 그나마 나을지도?";
            default:
                throw new AssertionError(project);
        }
    }
}
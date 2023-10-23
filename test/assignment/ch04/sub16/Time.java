package assignment.ch04.sub16;

public final class Time {

    public final int hour;

    public final int minute;
    public Time(int hour, int minute) {

        // 유효성 확인 후
        this.hour = hour;
        this.minute = minute;
    }
}

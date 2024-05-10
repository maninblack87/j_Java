package Study.Samples;

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}

class AlarmClock1 {
    private Time currentTime;
    private Time alarmTime;

    public AlarmClock1(Time c, Time a) {
        currentTime = c;
        alarmTime = a;
    }

    public Time getCurrentTime() {
        return currentTime;
    }

    public Time getAlarmTime() {
        return alarmTime;
    }

    public void printCurrentTime() {
        System.out.printf("현재 시간 : %d시 %d분 %d초\n", currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
    }

    public void printAlarmTime() {
        System.out.printf("알람 시간 : %d시 %d분 %d초\n", alarmTime.getHour(), alarmTime.getMinute(), alarmTime.getSecond());
    }
}

public class AlarmClockTest1 {
    public static void main(String[] args) {
        Time curr = new Time(12, 58, 30);
        Time alrm = new Time(5, 15, 0);
        AlarmClock1 a = new AlarmClock1(curr, alrm);
        a.printCurrentTime();
        a.printAlarmTime();
    }
}
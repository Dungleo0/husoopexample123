package lab4.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
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

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public Time nextSecond() {
        this.second += 1;
        if (this.second == 60) {
            this.second = 0;
            this.minute += 1;
        }
        if (this.minute == 60) {
            this.minute = 0;
            this.hour += 1;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public Time previousSecond() {
        this.second -= 1;
        if (this.second == -1) {
            this.second = 59;
            this.minute -= 1;
        }
        if (this.minute == -1) {
            this.minute = 59;
            this.hour -= 1;
        }
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }
}

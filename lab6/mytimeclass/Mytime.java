package lab6.mytimeclass;

public class Mytime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Mytime() {
    }

    public Mytime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
        if (second >= 0 && second <= 60) {
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 60) {
            this.second = second;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public Mytime nextSecond() {
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

    public Mytime nextMinute() {
        this.minute += 1;
        if (this.minute == 60) {
            this.minute = 0;
            this.hour += 1;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public Mytime nextHour() {
        this.hour += 1;
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public Mytime previousSecond() {
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

    public Mytime previousSMinute() {
        this.minute -= 1;
        if (this.minute == -1) {
            this.minute = 59;
            this.hour -= 1;
        }
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }

    public Mytime previousSHour() {
        this.hour -= 1;
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }
}

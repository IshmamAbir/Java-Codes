public class Subject {
    private int bangla;
    private int english;
    private int math;
    private int religion;

    public Subject(int bangla, int english, int math, int religion) {
        this.bangla = bangla;
        this.english = english;
        this.math = math;
        this.religion = religion;
    }

    public int getBangla() {
        return bangla;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getReligion() {
        return religion;
    }
}

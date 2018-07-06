package practice;

import java.util.Collection;

public class fifteenStudent {
    int id;
    int usualGrades;
    int midtermExam;
    int finalExam;
    double average;

    public fifteenStudent(int id, int usualGrades, int midtermExam, int finalExam) {
        this.id = id;
        this.usualGrades = usualGrades;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsualGrades() {
        return usualGrades;
    }

    public void setUsualGrades(int usualGrades) {
        this.usualGrades = usualGrades;
    }

    public int getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(int midtermExam) {
        this.midtermExam = midtermExam;
    }

    public int getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(int finalExam) {
        this.finalExam = finalExam;
    }

    public double getAverage() {
        average = usualGrades*0.3+midtermExam*0.3+finalExam*0.4;
        return average;
    }
}

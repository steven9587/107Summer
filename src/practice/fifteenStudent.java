package practice;

public class fifteenStudent {
    int id;
    int usualGrades;
    int midtermExam;
    int finalExam;
    float average;

    public fifteenStudent(int id, int usualGrades, int midtermExam, int finalExamm,float average) {
        this.id = id;
        this.usualGrades = usualGrades;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
        this.average = average;

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

    public float getAverage() {
        return average;
    }

    public void setAverage(float average ) {
        this.average = average;
    }
}
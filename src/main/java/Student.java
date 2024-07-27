//for keeping track of students
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //constructor to initialize fields
    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //no setter methods for unique values aka name and id, only for fields to be altered after initialization

    public void setGrade(int grade) {
        this.grade=grade;
    }

    //the school will receive funds, add to fees paid,
    public void payFees(int fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int getRemainingFees() {
        return feesTotal-feesPaid;
    }
    @Override
    public String toString() {
        return "Student's name :" + name + "Total fees paid so far $" + feesPaid;
    }
}

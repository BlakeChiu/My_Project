package com.tom.student;

public class GraduateStudent extends Student{
    int thesis; //加入屬性
    static int pass=70; //改變pass屬性

    //自己寫自己的建構子
    public  GraduateStudent(String name,int english,int math,int thesis){
        super(name,english,math);
        this.thesis=thesis;
    }

    //而且你有個方法不合我用就做覆寫的工作
    @Override
    public void print() {
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math +
                "\t" + thesis + "\t" + getAverage() + "\t" +
                ((getAverage() >= pass) ? "PASS" : "FAILED"));
        char grading = 'F';
        switch (average / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\t" + grading);
    }
}

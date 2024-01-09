import java.util.Scanner;

public class Main {

    public double findSum(double[] marks,int n){
        double total = 0;
        for (int i=0;i<n;i++){
            total +=marks[i];
        }
        return total;
    }
    public void print(int n,double[] marks,String[] sub){
        System.out.println("--Subject--\t\t\t"+"--Marks--");
        for(int i=0;i<n;i++){
            System.out.println(sub[i] + "\t\t\t\t  " + marks[i]);
        }
    }
    public char grade(double marks){

        if (marks>=75)
            return 'A';
        else if (marks>=65)
            return 'B';
        else if(marks>=55)
            return 'C';
        else if(marks>=35)
            return 'S';
        else
            return 'F';
    }

    public static void main(String[] args) {

        Scanner sun = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sun.nextInt();
        String[] subject = new String[n];
        double[] marks = new double[n];
        System.out.println("Enter the subject and marks: ");

        for (int i = 0;i<n;i++){
            subject[i] = sun.next();
            marks[i] = sun.nextInt();
        }
        Main obj = new Main();
        obj.print(n,marks,subject);

        double total = obj.findSum(marks,n);
        System.out.println("Total of marks: "+ total);

        double avg = total/n;
        System.out.println("Average of marks: "+ avg);

        char grade = obj.grade(avg);
        System.out.println("Grade of student: "+ grade);
    }
}
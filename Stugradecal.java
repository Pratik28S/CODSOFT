import java.util.Scanner;
import java.util.Arrays;

public class Stugradecal {
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter total number of subjects: ");
    int tot_sub= scan.nextInt();
    int sum=0;
    int[] arr =new int[tot_sub];
    System.out.println("Enter marks obtained in each subject out of 100: ");
    for(int i=0;i<tot_sub;i++){
        arr[i]=scan.nextInt();
        sum+=arr[i];
    }
    double avg_perc=(double)sum/tot_sub;
        char grade;
        if (avg_perc >= 90) {
            grade = 'A';
        } else if (avg_perc >= 80) {
            grade = 'B';
        } else if (avg_perc >= 70) {
            grade = 'C';
        } else if (avg_perc >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    System.out.println("Your Total marks are: "+sum+"\nYour Average percentage and Grade is: "+avg_perc+" & "+grade);

}
}

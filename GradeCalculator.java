/*                     STUDENT GRADE CALCULATOR
    Input:- Take marks obtained ( out of 100 ) in each subject.
    Calculate Total Marks:- Sum up the marks obtained in all subjects.
    Calculate Average Percentage :- Divide the total marks by the total number of subjects to get the average percentage.
    Grade Calculation :- Assign grades based on the average percentage achieved.
    Display Results :- Show the total marks , average percentage , and the corresponding grade to the user.
 */

import java.util.Scanner;

class GradeCalculator{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Subjects");
        int nsubject ;
        nsubject = sc.nextInt();
        String[] subject = new String[nsubject];

        for(int i=0 ; i<nsubject ; i++){
            System.out.println("Enter Subject - "+ (i+1) + " :: ");
            subject[i] = sc.next();
            System.out.println();
        }

        int[] gr = new int[nsubject];

        for(int i=0 ; i<nsubject ; i++){
            System.out.print("Marks of "+ subject[i] + " are :: ");
            gr[i] = sc.nextInt();
            System.out.println();
        }
        int sum =0 ;
        for(int i=0 ; i<nsubject ; i++){
            sum+=gr[i];
        }

        double avg =0;
        avg = sum /nsubject;

        System.out.println("Total Marks Obtained out of "+ nsubject*100 + " is " +sum);
        System.out.println();

        System.out.println("Average marks are "+avg);
        System.out.println();
        
        if(avg >= 90)
            System.out.println("You got A grade");
        else if(avg <=89 && avg>=70 )
            System.out.println("You got B grade");
        else if(avg <=69 && avg >=50)
            System.out.println("You got C grade");
        else if(avg <=49 && avg >=34)
            System.out.println("You got D grade");
        else
            System.out.println("Sorry you are Fail");
            sc.close();
    }
}
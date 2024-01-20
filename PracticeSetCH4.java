import java.util.Scanner;
public class PracticeSetCH4 {
    
    public static void main(String[] args) {
        // Question 2:
        /*
         * int marksMaths;
         * int marksPhysics;
         * int marksChemitry;
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("Enter marks for Maths: ");
         * marksMaths = sc.nextInt();
         * 
         * System.out.println("Enter marks for Physics: ");
         * marksPhysics = sc.nextInt();
         * 
         * System.out.println("Enter marks for Chemistry: ");
         * marksChemitry = sc.nextInt();
         * 
         * System.out.println("Maths: " + marksMaths + "\nPhysics: " + marksPhysics +
         * "\nChemistry: " + marksChemitry);
         * 
         * int sum = marksChemitry+marksMaths+marksPhysics;
         * float percent = (sum/3);
         * 
         * // if(marksChemitry>33 && marksMaths>33 && marksPhysics>33){
         * // if(sum > 40){
         * // System.out.println("Student has passed with " + percent + "%");
         * // }
         * // }
         * // else {
         * // System.out.println("Student has Failed!");
         * // }
         * if(percent > 40 && marksChemitry>33 && marksMaths>33 && marksPhysics>33){
         * System.out.println("Student has passed with " + percent + "%");
         * }
         * else{
         * System.out.println("Student has failed!");
         * }
         */

        //Question 3:
        /* 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter income: ");
        float tax = 0.0f;
        float income;
        income = s.nextFloat();
        
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income > 2.5f && income <= 5.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
        }
        else if(income > 5.0f && income <= 10.0f){
            tax = tax + 0.05f *(5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if(income > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);  
        }
        System.out.println("Income tax paid by the employe is " + tax + " L");
    */

    //Question 4:
    /*
    Scanner ss = new Scanner(System.in);
    System.out.println("Enter the day Number:");
    byte day = ss.nextByte ();

    switch (day) {
        case 1:
            System.out.println("It's Monday");
            break;

        case 2:
        System.out.println("It's Tuesday");
            break;

        case 3:
        System.out.println("It's Wednesday");
            break;

        case 4:
        System.out.println("It's Thursday");
            break;

        case 5:
        System.out.println("It's Friday");
            break;

        case 6:
        System.out.println("It's Saturday");
        break;

        case 7:
        System.out.println("It's Sunday");
        break;

        default:
        System.out.println("Enjoy!");
            break;
    }*/

    //Question 5
    /*
    Scanner sq = new Scanner(System.in);
    System.out.print("Enter year:");
    int year = sq.nextInt();

    if( year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0) ){
        System.out.println(year + " is a leap year.");
    }
    else{
        System.out.println(year + " is not a leap year.");
    }*/

    //Question 6
    Scanner ss = new Scanner(System.in);
    System.out.println("Enter website: ");
    String webSite = ss.nextLine();
    if( webSite.endsWith(".com") ){
        System.out.println("It is a commercial website");
    }
    else if( webSite.endsWith(".in")){
        System.out.println("It is a indian website.");
    }
    else if( webSite.endsWith(".org")){
        System.out.println("This is a n organisational website");
    }

    }
}

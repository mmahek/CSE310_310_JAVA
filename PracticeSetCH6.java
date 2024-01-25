import java.util.Scanner;
public class PracticeSetCH6 {
    public static void main(String[] args) {
        /*Question 1: 
        float [] mahek;
        mahek = new float[5];
        float sum = 0.0f;
        Scanner s = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++ ){
            System.out.print("mahek["+ i +"] = ");
            mahek[i] = s.nextFloat();
            sum = sum+mahek[i];
        }
        System.out.println("Values input are: ");
        for(int j = 0 ; j < 5 ; j++){
            System.out.println("mahek[" + j + "] = " + mahek[j]);
        }
        System.out.println("Sum = " + sum);*/

        /*Question 2: 
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter the name to search: ");
        // String nameToSearch = s.nextLine();
        String nameToSearch = "ahem";
        String [] sectionGM = {"mahek", "arjun", "aaradhya", "bhim", "suraj", "mishka"};
        //sectionGM = new String[11];
        
        // for(int i = 0 ; i < 11 ; i++){
        //         System.out.print("Enter name["+ i + "] = ");
        //         sectionGM[i] = s.nextLine();
        // }
        // for(int j = 0 ; j < 11 ; j++){
        //     System.out.println("sectionGM["+j+"]="+sectionGM[j]);
        // } 
        int flag = 0;
        for (int j = 0; j < 6; j++) {
            if(sectionGM[j] == nameToSearch){
                System.out.println("sectionGM[" + j + "] = " + sectionGM[j]);
                
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.err.println("Sorry, no match found!");
        }else{
            System.out.println("yes! match found");
        }
    */
        /*Question 3: */
        Scanner m = new Scanner(System.in);
        System.err.print("Enter the strength of students: ");
        int strengthOfStudents = m.nextInt();
        int [] physicsMarks ;
        int sum = 0;
        physicsMarks = new int[strengthOfStudents];
        System.err.println("Enter the marks: ");
        for(int i = 0 ; i < strengthOfStudents ; i++){
            System.out.print("physicsMarks[" + i + "] =");
            physicsMarks[i] = m.nextInt();
            sum = sum + physicsMarks[i];
        }
            System.out.println("Sum of marks : " + sum);
            System.out.println("Average marks :  " + sum/strengthOfStudents);
    }
}

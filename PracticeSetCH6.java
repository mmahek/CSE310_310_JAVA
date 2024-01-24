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

        /*Question 2: */
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter the name to search: ");
        // String nameToSearch = s.nextLine();
        String nameToSearch = "mishka";
        String [] sectionGM = {"mahek", "arjun", "aaradhya", "bhim", "suraj", "mishka"};
        //sectionGM = new String[11];
        
        // for(int i = 0 ; i < 11 ; i++){
        //         System.out.print("Enter name["+ i + "] = ");
        //         sectionGM[i] = s.nextLine();
        // }
        // for(int j = 0 ; j < 11 ; j++){
        //     System.out.println("sectionGM["+j+"]="+sectionGM[j]);
        // } 
        for (int j = 0; j < 6; j++) {
            if(sectionGM[j] == nameToSearch){
                System.out.println("sectionGM[" + j + "]=" + sectionGM[j]);
                System.out.println("yes! match found");
                break;
            }
            else{
                System.out.println("sorry");
            }
            
        }

    }
}

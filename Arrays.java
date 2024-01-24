public class Arrays {
    public static void main(String[] args) {

        /*
         * Three ways to create array in java:
         * 1. Declaration & memory allocaion and then initialization:
         * int [] marks;//Declation
         * marks = new int[5];//memory allocation
         * marks[0] = 100;//Initialization
         * marks[1] = 91;
         * marks[2] = 83;
         * marks[3] = 67;
         * marks[4] = 76;
         */

        /*
         * 2.Declaration and memory allocation then initialization:
         * int [] marks = new int[5];//Declation + Memory Allocation
         * 
         * 3. Declation, memory allocation and initialization all together:
         * int[] marks = {100, 91, 83, 67, 76};//Declaration + Initialize - Java will
         * know the size it self
         * System.out.println(marks[5]);
         */
         //int[] marks = { 100, 91, 83, 67, 76 };
        //  System.out.println(marks[2]);
        //  System.out.println(marks.length);

         float[] marks = { 23.2f , 23.5f , 45.5f , 65.4f};
         //System.out.println(marks[2]);
         // Displaying an array- using for loop
         System.out.println("Displaying elements of an array using for loop: ");
         for(int i = 0 ; i < marks.length ; i++){
                System.out.println(marks[i]);
         }
         //reversed order
         System.out.println("Displaying elements of an array using for loop in reversed order: ");
         for(int i = marks.length-1; i>=0;i--){
            System.out.println(marks[i]);
         }
         System.out.println("Displaying elements of an array using for each loop: ");
         for(float element: marks){
            System.out.println(element);
         }         
    }
}

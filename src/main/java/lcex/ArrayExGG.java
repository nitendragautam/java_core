package lcex;

public class ArrayExGG {

    public static void main(String[] args){
        int[] a  = {10,20,30,40};

        System.out.println(a.length);

        a[2] = 50; //Assigning value 2 at second indexes
        System.out.println(a[2]);

        System.out.println(a[1]);

        //Different ways of creating array 

        /* =====First Way======*/
        int[] numArry = new int[3]; //Declaring a array and allocating some memory at  same time.

        //Array Value Assignment
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;


        /* =====Second Way ======*/
        //Here declaration, assigning and allocating memory happens at same time.
        int []numArray1 = {10,20,30}; 

        // Indexes in Array of n size goes from 0 to length of n -1

        /* =====Third Way: using a loop ======*/

        int []loopArr = new int[3];
        int x = 10;
        for (int i =0; i< loopArr.length; i++){
            loopArr[i] = x;
            x = x+10;

        }


        System.out.println(loopArr[2]);


    }
    
}

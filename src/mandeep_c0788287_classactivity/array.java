package mandeep_c0788287_classactivity;
import java.util.Arrays;
import java.util.Collections;
    public class array {
        public static void main(String [] args){
            Integer[] intArr = new Integer[] {21,33,41,72,52,64,11,55,17,24};

            // displaying in reverse order
            System.out.println("displaying in reverse order");
            for(int i=intArr.length-1;i>=0;i--){
                System.out.println(intArr[i]);
            }

            System.out.println("displaying in Descending order");

            Arrays.sort(intArr, Collections.reverseOrder());

            for(int i=0;i<intArr.length;i++){
                System.out.println(intArr[i]);
            }

            System.out.println("displaying in Ascending order");

            Arrays.sort(intArr);

            for(int i=0;i<intArr.length;i++){
                System.out.println(intArr[i]);
            }

            System.out.println("displaying only ODDs");

            for(int i=0;i<intArr.length;i++){
                if(i%2!=0)
                    System.out.println(intArr[i]);
            }

            System.out.println("displaying only EVENs");

            for(int i=0;i<intArr.length;i++){
                if(i%2==0)
                    System.out.println(intArr[i]);
            }

            System.out.println("Sum of all");

            int sum = 0;
            for(int i=0;i<intArr.length;i++){
                sum += intArr[i];
            }
            System.out.println(sum);
        }

    }



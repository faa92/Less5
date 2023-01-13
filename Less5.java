import java.util.Arrays;
import java.util.Random;

public class Less5 {
    public static void main (String[] args) {
//    int [] [] twoRowArray = new int[3][];
//        twoRowArray[0] = new int[4];
//        twoRowArray[1] = new int[2];
//        twoRowArray[2] = new int[3];
//
////        Random random = new Random();
//
////        for (int[] inner : twoRowArray) {
////            Arrays.fill(inner,(int)(Math.random()*5));   //*5 разбежка рандома
////        }
//
//        for (int i=0; i<twoRowArray.length; i++) {
//            for (int j=0;i<twoRowArray[i].length;j++){
//                System.out.println(twoRowArray [i] [j]);
//            }
//            System.out.println("\n");
//        }
//        System.out.println(twoRowArray);
//        System.out.println(Arrays.toString(twoRowArray));
////        System.out.println(Arrays.deepToString(twoRowArray));
//    int[] arr1=new int[]{1,2,5,1,4};                         //для стрингов тоже самое
//    int[] arr2=new int[]{1,2,5,1,4};
//        System.out.println(Arrays.equals(arr1,arr2));            //метод сравнения массива

        int [] [] [] arr = {{ {1,2,3} },{{4,5,6}, {7,8,9}},{{1,2},{4,3},{5,6}}};

        for (int i=0; i<arr.length;i++) {
//            System.out.println(arr[i]);

            for (int j =0; j<arr [i].length; j++){
//                System.out.println(j);

                for (int k =0; k<arr[i][j].length;k++){
                    System.out.print(arr [i][j][k]+" ");

                }
                System.out.println();
            }


        }


















    }
}

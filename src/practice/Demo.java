package practice;

public class Demo {

    public static void main(String[] args) {
//        int nums[] = {3, 7, 2, 4};
//        nums[2] = 0;
//
//        System.out.println(nums[2]);

//        int nums2[] = new int[4];
//        nums2[0] = 14;
//        nums2[1] = 1;
//        nums2[2] = 32;
//        nums2[3] = 5;
//
//        for(int i=0; i< 4; i++){
//            System.out.println(nums2[i]);
//        }

        int nums[][] = new int[3][4];
        int random = 0;



        for(int i = 0; i < 3; i++) {
            for(int j=0; j<4; j++){
               nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

//        for(int i = 0; i < 3; i++) {
//            for(int j=0; j<4; j++){
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}

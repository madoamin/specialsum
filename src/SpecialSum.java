public class SpecialSum {
    public static void main (String[] args){

        int x;
        int y;
        x = Integer.MAX_VALUE;
        y = Integer.MIN_VALUE;
        int z = 5;
        int a = 2;

        int sum = 0;
        int counter = 1;
        String name = "mahmoud";
        while ( counter <= 100 ){
            if ((counter % 3) != 0 ){
                sum = sum + counter;
            }
            counter = counter + 1;
        }
        System.out.println("sum 1 = " + sum);


        int su = 0;
        int counte = 1;

        while ( counte <= 50 ){
            if ((counte % 3) != 0 ){
                su = su + counte;
            }
            counte = counte + 1;
        }
        System.out.println("sum 2 = " + su);

    }
}

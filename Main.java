import java.util.*;
public class Main {

    public static void main(String[] args){

        Car Volvo240 = new Volvo240();
        Car saab95 = new Saab95();
        saab95.move();


        //Create_world /lägg i klass?
        int[][] world = new int[100][100];
        int new_value = -1;
        for (int r = 0; r < world.length; r++){
            for (int c = 0; c < world[r].length; c++) {
                new_value++;
                world[r][c]= new_value;
            }
        }

        System.out.println(Arrays.deepToString(world)); //bara för att checka så det skapades en grej en array


    }
}

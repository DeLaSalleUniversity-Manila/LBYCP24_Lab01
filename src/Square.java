/**
 * Draw a square-like shape that has its 4 sides composed of 6 asterisks (*) in the length
 * Created by cobalt on 9/21/15.
 */
public class Square {
    public static void main(String[] args){
        int side = 10;
        for(int i = 0; i < side; ++i){
            for(int j = 0; j < side; ++j){
                if((i == 0) || (i == side - 1))
                    System.out.print("* ");
                else{
                    if((j == 0) || (j == side - 1))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

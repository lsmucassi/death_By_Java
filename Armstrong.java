import java.util.Scanner;

public class Armstrong {

    public static void main(String args[]){
        result();
    }

    public static boolean isArm(int arm){
        int orig = arm, res = 0;

        while (arm != 0){
            int rem = arm % 10;
            res = res + rem * rem * rem;
            arm = arm / 10;
        }
        if (orig == res)
            return true;
        return false;
    }

    public static void result(){
        System.out.println("Enter a number Or a Zero to Exit: ");
        int arm = new Scanner(System.in).nextInt();
        while (arm != 0){
            if (isArm(arm)){
                System.out.println("The number "+ arm +" is an armstrong number");
            }else
                System.out.println("The number "+ arm +" is NOT an armstrong number");
            System.out.println("Enter a number Or a Zero to Exit: ");
            arm = new Scanner(System.in).nextInt();
            if (arm == 0) {
                System.out.println("Exiting...");
            }
        }
    }

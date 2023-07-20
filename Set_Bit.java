import java.util.Scanner;

public class Set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextByte();
        int num2 = sc.nextInt();
        if(num1==num2)
        {
            System.out.println(calpow(num1));
        }
        else
            System.out.println(calpow(num1)+calpow(num2));
    }
    public static int calpow(int num1)
    {
        if(num1==0)
            return 1;
        int rrr =  2 * calpow(num1-1);
        return rrr;
    }
}

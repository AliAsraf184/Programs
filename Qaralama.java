import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Qaralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        int [] arr1 = new int[4];
        for (int i = 1; i <= 3; i++) {
            arr[i]= sc.nextInt(); }

            for (int j = 1; j <=3; j++) {
                arr1[j]= sc.nextInt();
            }
        if((arr[2]>arr1[2] && arr[3]>arr1[3])|| (arr[2]<arr1[2]&& arr[3]<arr1[3])) System.out.print(2+" ");
        else if(arr[3]>arr1[3]||arr[3]<arr1[3]) System.out.print(1+" ");
        else if(arr[2]<arr1[2] || arr[2]>arr1[2] ) System.out.print(1+" ");
        else if (arr[2]==arr1[2]|| arr[3]==arr1[3]||arr[1]>arr1[1]) System.out.print(0+" ");
         if(arr[1]>arr1[1]||arr[1]<arr1[1]) System.out.print(1); else System.out.print(0);

    }
        }


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] list={35,12,4,-23,22,-4,421,-392};
        System.out.println("Dizi : "+Arrays.toString(list));

        System.out.print("Değer Giriniz : ");
        Scanner scanner= new Scanner(System.in);
        int inputValue=scanner.nextInt();

        System.out.println("Girilen sayıdan büyük, en küçük sayı :" +minValue(list,inputValue));
        System.out.println("Girilen sayıdan küçük, en büyük sayı :"+maxValue(list,inputValue));
    }

    /*
     Girilen sayıdan büyük, en küçük sayıyı bulan metot.
     */
    public static int minValue(int[] list,int number){

        int minDiff=99999999;
        int minIndex=0;
        for (int i = 0; i < list.length; i++) {
            if(list[i]>number){
                int diff=list[i]-number;
                if(diff<minDiff){
                    minDiff=diff;
                    minIndex=list[i];
                }
            }
        }
        return minIndex;
    }

    /*
    Girilen sayıdan küçük, en büyük sayıyı bulan metot.
     */
    public static int maxValue(int[] list,int number){
        int minDiff=99999999;
        int maxValue=0;
        for (int i = 0; i < list.length; i++) {
            if(list[i]<number){
                int diff=number-list[i];
                if(diff<minDiff){
                    minDiff=diff;
                    maxValue=list[i];
                }
            }
        }
        return maxValue;
    }
}

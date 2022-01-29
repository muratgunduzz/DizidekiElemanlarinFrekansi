import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int [] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int value = 0;
        int count = 0;
        int [] nArr = new int [arr.length];
        Arrays.sort(arr);
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    nArr[value] = arr[j];
                    System.out.println(arr[j]);
                    value++;
                    break;
                }
            }
        }
        System.out.println("Sayı "+count+" kere tekrar etti.");
        System.out.println(Arrays.toString(nArr));
    }
}

import java.util.Arrays;

public class DizidekiElemanFrekans {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int count = 0;
        int value = 0;
        Arrays.sort(arr);
        for (int i = 0 ;i<arr.length;i++){
            value = arr[i];
            for (int j = 0;j<arr.length;j++){
                if (value == arr[j]){
                    count++;
                }else if (i > 1 && value == arr[j]){
                    return;
                }
            }
            System.out.println(value+" sayısı "+count+" kere tekrar etti."); // tam olarak istediğim gibi olmadı.
            count = 0;
        }
    }
}

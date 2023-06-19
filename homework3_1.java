/*Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее ариф. значение
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class homework3_1 {
    public static ArrayList <Integer> CreateArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(1000));
        }
        return list;
    }  
    public static void ShowArray(ArrayList<Integer> array){
        for (int i:array)
            System.out.printf(" %d " ,i);
    }
    public static void DeletingEvenNumbers(ArrayList<Integer> array){
        ArrayList<Integer> list2 = new ArrayList<Integer>(array.size());
        for (int i:array){
            if (i%2!=0){
                list2.add(i);
            }
        }
        for (int j:list2)
            System.out.printf("%d " ,j);
    }  
    public static int Minimum(ArrayList<Integer> array){
        int min=array.get(0);
        for (int i:array)
        {
            if (i<=min) min=i;
        }
        return min;
    }  
    public static int Maximum(ArrayList<Integer> array){
        Collections.sort(array);
        return array.get(array.size()-1);
    }
    public static float Average(ArrayList<Integer> array){
        float sum=0;
        for (int i: array){
            sum+=i;
        }
        float a= sum/array.size();
        return a;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = CreateArray(10);
        System.out.print("Array: ");
        ShowArray(array);
        System.out.println();
        System.out.print("Deleting Even Numbers:  ");
        DeletingEvenNumbers(array);
        System.out.println();
        System.out.println("Minimum: " +Minimum(array));
        System.out.println("Maximum: " + Maximum(array));
        System.out.printf("Average:  %.2f",Average(array));    
    }
    
}

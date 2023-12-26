
public class Main {
    public static void main(String[] args) {
        int list[] = {1,2,3,2,1,2,3,4,5,64,3,2,2,4,5,7,8,0,9,7,6,5,-333};
        SelectionSort(list);
        for (int e : list) {
            System.out.print(e + "\t");
        }
    }
    public static void SelectionSort (int list[]) {
        int min;
        for (int i = 0; i < list.length - 1; i++) {
            min = i;
            for (int j = i + 1 ; j < list.length ; j++) {
                if (list[j] < list[min]){
                    min = j;
                }
            }
            if (min!=i) {
                int temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }
    }
}
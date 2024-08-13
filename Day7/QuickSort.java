package Day7;

public class QuickSort {
    public void display(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low;
        int j=low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }

    public void sort(int[] arr, int low, int high){
        if(low<high){ //BASE CASE
            int p= partition(arr, low, high);
            sort(arr, low, p-1); //LEFT
            sort(arr, p+1, high); //RIGHT
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[] {8,-3,5,2,6,9,-6,1,3};
        QuickSort obj= new QuickSort();
        obj.display(arr);
        obj.sort(arr, 0, arr.length-1);
        obj.display(arr);
    }
}

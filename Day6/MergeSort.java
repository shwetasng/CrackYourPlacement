package Day6;

public class MergeSort {
    public void display(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
    }

    public void sort(int[] arr, int[] temp, int low, int high){
        if(low<high){
            int mid=low+(high-low)/2; // takes care of Integer Overflow condition
            sort(arr, temp, low, mid);
            sort(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    public void merge(int[] arr, int[] temp, int low, int mid, int high){
        for(int i=low;i<=high;i++){
            temp[i]=arr[i];
        }
        int i=low; int j=mid+1; int k=low;
        while(i<=mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }

        // Case-1: if left subarray is exhausted--> do nothing

        // Case-2: if right subarray is exhausted
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        int [] arr={9,5,2,4,3,-4,0};
        int n=arr.length;
        MergeSort obj = new MergeSort();
        obj.display(arr);
        obj.sort(arr, new int[arr.length], 0, n-1);
        obj.display(arr);
    }
    
}

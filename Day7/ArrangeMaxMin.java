package Day7;

public class ArrangeMaxMin {
    public void display(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void arrangeMaxMin(int[] arr){
        int maxIdx = arr.length-1;
        int minIdx = 0;
        int max= arr[maxIdx]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[maxIdx]%max)*max;
                maxIdx--;
            }else{
                arr[i]=arr[i]+(arr[minIdx]%max)*max;
                minIdx++;
            }
        }
        for(int i=0;i<arr.length;i++){// This is to fill the array with rearranged element
            arr[i]=arr[i]/max;
        }
    }
    public static void main(String[] args) {
        int[] arr= new int[] {2,3,5,6,8,9};
        ArrangeMaxMin obj = new ArrangeMaxMin();
        obj.display(arr);
        obj.arrangeMaxMin(arr);
        obj.display(arr);
    }
    
}

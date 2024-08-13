package Day7;

public class SortedSquares {
    public void display(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] sortedSquares(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        int i=0;
        int j=n-1;
        for(int k=n-1;k>=0;k--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                result [k] = arr[i]*arr[i];
                i++;
            }
            else{
                result[k]=arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr= new int[] {-4, -1, 0, 3, 10};
        SortedSquares obj = new SortedSquares();
        obj.display(arr);
        int [] result=obj.sortedSquares(arr);
        obj.display(result);
    }
    
}

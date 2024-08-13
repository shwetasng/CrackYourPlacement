package Day7;

public class DutchNationalFlag {

    public void display(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void sort(int[] arr){
        int n=arr.length;
        int i=0;
        int j=0;
        int k=n-1;

        while(i<=k){
            if(arr[i]==0){
                swap(arr, i,j);
                i++;
                j++;
            }else if(arr[i]==1){
                i++;
            }else if(arr[i]==2){
                swap(arr, i,k);
                k--;
            }


        }
    }

    public void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    public static void main(String[] args) {
        int[] arr= new int[] {2,0,2,2,0,1,1};
        DutchNationalFlag obj=new DutchNationalFlag();
        obj.display(arr);
        obj.sort(arr);
        obj.display(arr);
    }
}

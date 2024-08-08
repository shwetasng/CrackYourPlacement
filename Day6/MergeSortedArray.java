package Day6;

public class MergeSortedArray {

    public void display(int[] array){
        int n =array.length;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public int[] merge(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] result= new int[n+m];

        // make 3 pointers
        int i=0; int j=0; int k=0;
        
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            result[k]=arr2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{2,3,5,10};
        int[] arr2=new int[]{4,6,11,15};

        MergeSortedArray obj = new MergeSortedArray();
        int result[]=obj.merge(arr1, arr2);
        obj.display(result);

    }
}

public class MergeSort {

    public void sort(int arr[],int first, int last){

        if(first>=last) return;
        else{

            int mid=first+last/2;
            sort(arr,first,mid);
            sort(arr,mid+1,last);

            merge(arr,first,mid,last);
        }

    }

    private void merge(int[] arr, int first, int mid, int last) {

        int l1=mid-first+1;
        int r1=last-mid;

        int[] left=new int[l1];
        int[] right=new int[r1];

        for(int i=0;i<left.length;i++){
            left[i]=arr[i+first];
        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[i+mid+1];
        }
        int i=0,j=0;
               int k=first;
               while(i<l1 && j<r1){
                   if(left[i]<=right[j]){
                       arr[k]=left[i];
                       j++;
                   }
                   else{
                       arr[k]=right[j];
                       j++;
                   }
                   k++;

               }
               while (i<l1){
                   arr[k]=left[i];
                   i++;
                   k++;

               }
        while (j<r1){
            arr[k]=right[j];
            j++;
            k++;

        }

    }

}

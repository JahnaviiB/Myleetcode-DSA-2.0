public class mergesort {
    public static void main(String[] args){
        int[] intArray = {20,35,-15,7,55,1,-22};
        mergeSort(intArray,0,intArray.length);

                for(int i=0;i< intArray.length;i++){
                    System.out.println(intArray[i]);
                }
    }
    public static void mergeSort(int[] input,int s,int e){
        if(e-s<2){
            return;
        }
        int mid = (s+e)/2;
        mergeSort(input,s,mid);
        mergeSort(input,mid,e);
        merge(input,s,mid,e);
    }
    public static void merge(int[] input,int s,int mid,int e){
        if(input[mid-1]<= input[mid]){
            return;
        }

        int i = s;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[e-s];
        while(i<mid && j< e){
            temp[tempIndex++] = input[i] <=  input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i , input, s+tempIndex, mid - i);
        System.arraycopy(temp,0,input,s,tempIndex);

    }
}

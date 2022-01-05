public class Test14 {
 ///////////
    public static void main(String[] args) {

        int[] arr1={6, 2, 4, 10, 5};
        //int[] arr2={3, 9, 10, 13, 1, 2};

        findMinMax res= new findMinMax();
        
        System.out.println("max : "+res.max(arr1)+" min : "+res.min(arr1));
    }

    public static class findMinMax {
        public int max(int []arr){
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
        public int min(int []arr){
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        }
        
        
    }
}

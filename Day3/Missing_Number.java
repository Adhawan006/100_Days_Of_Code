    package hundred_days_of_code.Day3;

class Missing_Number {

    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,5};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int arr[]) {
        int x = 0;
        while(x < arr.length){
            int correct = arr[x] - 1;
            if( correct<arr.length && arr[x] != arr[correct] ){
                swap(arr, x, correct);
            }
            else{
                x++;
            }
            
        }

        for(int y = 0; y < arr.length; y++){
            if(arr[y] != y + 1){
                return y+1;
            }
        }
        return arr.length + 1;
        
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
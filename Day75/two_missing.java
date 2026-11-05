package hundred_days_of_code.Day75;

public class two_missing{
    public static void main(String[] args) {
    int n = 7;
    int[] arr = {1, 2, 3, 4, 5};  
    
    int x0 = 0;
    int x1 = 0;
    int x2 = 0;

    for(int x = 1; x <= n; x++){
        x0 = x0 ^ x;
    }
    for(int x = 0; x < arr.length; x++){
        x1 = x1 ^ arr[x];
    }
    x2 = x0 ^ x1;  // 0^6^7
    
    x2 = x2 & ~(x2-1); // to cancel all unnceccesary 1's since only msb is needed

    int x3 = 0;
    int x4 = 0;

    for(int x = 1; x <= n; x++){
        if((x2 & x)==0){
            x3 = x3^x;
        }
        else{
            x4 = x4^x;
        }
    }

    for(int x = 0; x < arr.length; x++){
        if((x2 & arr[x])==0){
            x3 = x3^arr[x];
        }
        else{
            x4 = x4^arr[x];
        }
    }   
    System.out.println(x3 + " " + x4); 
    }

}

import java.util.*;
public class ArrayX {

    // LINERSERACH PROBLEM

    // public static int liner_search(int Number[],int key){
    //     for(int i=0 ; i<Number.length ; i++){
    //         if(Number[i]== key){
    //             return i;      
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int Number[]={12,35,48,95,96,98,99};
    //     int key= 28;
        
    //     int index =liner_search(Number, key);
    //     if (index == -1){
    //             System.out.println("Haar ke baad Jeet hai");
    //     }else{
    //         System.out.println("key is at index:"+ index );
    //     }

    // }

    // FIND THE LARGEST ELEMENT

    // public static int get_largest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;

    //     for (int i=0 ; i<=numbers.length ; i++){
    //         if(largest < numbers[i] ){
    //             largest=numbers[i];
    //         }
    //     }
    //     System.out.println("Largest Value is:"+ largest);
    //     return largest ;
    // }
    // public static void main(String[] args) {
    //     int number[]={2,4,6,8,10};
    //     System.out.println("Largest Value is:" + get_largest(number));
    // }

    // FIND THE NUMBER USING BINARY SEARCH

    // public static int bi_serach(int numbers[] , int key) {
    //     int start=0, end = numbers.length-1;

    //     while (start<=end) {
    //         int mid =(start + end) / 2 ;

    //         if (numbers[mid] == key) {
    //             return mid;
    //         }
    //         if(numbers[mid]< key){
    //             start=mid+1;
    //         }else{
    //             end=mid-1;
    //         }
            
    //     }
    //     return -1;
    // }

    // public static void main( String args[]){
    //     int numbers[] ={45,12,789,46,13,34,389};
    //     int key= 48;

    //     System.out.println("Index key is at :" + bi_serach(numbers, key));

    // }

    // REVERSE AN ARRAY
    // public static void Rev_arry(int numbers[]) {
    //     int first =0 ,
    //         last =numbers.length-1;
    //         while(first <last){
    //             //swap
    //             int temp= numbers[last];
    //             numbers[last]=numbers[first];
    //             numbers[first]=temp;
                
    //             first++;
    //             last--;
    //         }
    // }
                

    // public static void main(String[] args) {
    //     int numbers[]={2,4,6,8,10};
    //     // For print
    //     Rev_arry(numbers);
    //     for(int i=0 ; i<numbers.length ; i++){
    //         System.out.print(numbers[i] + " ");
    //     }
    //     System.out.println();
    // }

    // PRINT PAIRS OF AN ARRAY

    // public static void prin_pair(int numbers[]){
    //     for(int i=0; i<=numbers.length ; i++){
    //         int curr =numbers[i];

    //         for (int j=i+1; j<=numbers.length ;j++){
    //             System.out.print("(" + curr + "," + numbers[j] + ")");     
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int numbers[]={ 2,4,6,8,9};
    //     prin_pair(numbers);
    // }

    //TRAP RAIN-WATER PROBLEM

    // public static int trap_water(int height[]){
    //     int n=height.length;

    //     // left max-boudary
    //     int leftMax[]= new int[n];
    //     leftMax[0]= height[0];
    //     for( int i=n ; i<n ; i++){
    //         leftMax[i]= Math.max(height[i], leftMax[i-1]);
    //     }

    //     // right max-boudary
    //     int rightMax[]= new int[n];
    //     rightMax[n-1]= height[n-1];
    //     for( int i=n-2 ; i>=0 ; i--){
    //         rightMax[i]= Math.max(height[i], rightMax[i+1]);
    //     }

    //     int trapwater=0;

    //     //loop
    //     for(int i=1; i<n-1; i++){
    //         int waterlevel =Math.min(leftMax[i],rightMax[i] );
    //         trapwater += waterlevel - height[i];
    //     }
    //     return trapwater;
    // } 
    
    // public static void main(String[] args) {
    //     int height[]={4,2,0,6,3,2,5};
    //     System.out.println("Trap water is:" + trap_water(height));
    // }

    // BUY & SELL STOCK PROBLEM

    public static int Buy_sell (int princes[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n= princes.length;

        for (int i=0 ; i<=n ; i++){
            if (buyPrice < princes[i]) {// profit
                int profit = princes[i] - buyPrice; // todayprofit
                maxProfit= Math.max(maxProfit, profit);
            }else{
                buyPrice= princes[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(Buy_sell(prices));
    }

}

// import java.util.*;
// public class binearySearch {
//     public static int bs(int arr[],int key){
//         int start = 0;
//         int end = arr.length-1;
//         if(start<=end){
//             int mid = (start+end)/2;
//             if(arr[mid]==key){
//                 return mid;
//             }
//             if (arr[mid]<key){
//                 start = mid+1;
//             }else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int arr[]={12,13,15,16,17,18,19,20,21,22,23,24};
//         int key = 21;
//         System.out.println(bs(arr, key));

//     }
// }





// import java.util.*;
// class binearySearch{
/     public static int bs(int arr[],int key){
//         int start = 0;
//         int end = arr.length-1;

//         while(start <= end){
//             int mid = (start+end)/2;


//             if(arr[mid]==key){
//                 return mid;
//             }
//             if (arr[mid]<key){
//                 start = mid+1;
//             }else{
//                 end = mid -1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int arr[]={1,2,3,4,5,6,7};
//         int key =5;
//         System.out.println(bs(arr, key));

//     }
// }
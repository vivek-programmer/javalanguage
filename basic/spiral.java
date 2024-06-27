// package basic;

// public class spiral {
//     public  static  void spirla(int arr[][]){
//         int startrow=0,
//         endrow=arr.length-1,
//         startcol=0,
//         endcol=arr[0].length-1;
//         while(startrow<=endrow&&startcol<=endcol){
//             for(int i=startcol;i<=endcol;i++){
    
//                 System.out.print(arr[startrow][i]+" ");
//             }
//             for(int i=startrow+1;i<=endrow;i++){
                
//                 System.out.print(arr[i][endcol]+" ");
//             }
//             for(int i=endcol-1;i>=startcol;i--){ 
//                 if (endcol==startcol){
//                     break;
//                 }            
//                 System.out.print(arr[endrow][i]+" ");
//             }
//             for(int i=endrow-1;i>=startrow;i--){
//                 if(endrow==startrow){
//                     break;
//                 }
//                 System.out.print(arr[i][startcol]+" ");
//             }
//             startrow++;
//             endrow--;
//             startcol++;
//             endcol--;
//         }

//     }
//     public static void main(String[] args) {
//         int arr[][]={
//             {2,3,5,4},{4,5,6,7},{7,8,9,4},{23,5,7,4}
//         };
//         spirla(arr);
//     }
// }

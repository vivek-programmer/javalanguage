// public class Stairecase {
//     public static boolean search (int matrix[][],int key) { 
//         int row=0,col=matrix.length-1;
//         while (row<matrix.length-1&&col>=0){
//             if (matrix[row][col]==key){
//                 System.out.print("key is found at ("+row+","+col+")");
//                 return true;
//             }
//             else if (key<matrix[row][col]){
//                 col--;
//             }
//             else {
//                 row++;
//             }
//         }
//         System.out.print("element is not found in the search");
//         return false ;
//     }
//     public static void main(String[] args) {
//         int matrix[][]={
//             {10,20,25,40},
//             {20,40,60,80},
//             {30,50,70,90},
//             {45,65,75,95}
//         };
//         int key=30;
//         search(matrix, key);
//     }
// }

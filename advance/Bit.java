// package advance;

// public class Bit {
//     //a<<b=a*2^b
//     //a>>b=a/2^b
//     public static void odd_even(int n){
//         int bitmask=1;
//         if ((n&bitmask)==0){
//             System.out.println("number is even");
//         }
//         else if ((n&bitmask)==1){
//             System.out.println("number is odd");
//         }
//     }
//     public static int getIthbit(int n,int i){
//         int bitmask=1<<i;
//         if ((n&bitmask)==0){
//             return 0;
//         }
//         else {
//             return 1;
//         }
//     }
//     public  static  int setIthbit (int n,int i){
//         int mask=1<<i;
//         return  n|mask;
//     }
//     public  static  int clearIthbit (int n,int i){
//         int mask=~(1<<i);//cause i left shift give the bit to perform make it 0 by negation and not to affect other
//         return  n&mask;
//     }
//     public static int updateIthbit (int n,int i,int newbit){
//         // if (newbit==0){
//         //     return clearIthbit(n, i);
//         // }
//         // else {
//         //     return setIthbit(n, i);
//         // }
//         n=clearIthbit(n, i);
//         int mask=newbit<<i;
//         return  n|mask;
//         }
//         public static int  clearIbits(int n,int i){
//             int mask=(~0)<<i;
//             return n&mask;}
//     public  static int clearinrange (int n,int j,int i){
//         int a =((~0)<<(j+1));
//         int b=(1<<i)-1;
//         int mask=a|b;
//         return n&mask;
//     }
//     public static boolean ispowerof2(int n){
//         if((n&(n-1))==0){
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
//     public static int countbits(int n){
//         int count=0;
//         while(n>0){
//             if ((n&1)!=0){
//                 count++;
//             }
//             n=n>>1;
//         }
//         return count;
//     }
//     public static int fastexpo(int a,int n){
//         int ans=1;
//         while(n>0){
//             if ((n&1)!=0){
//                 ans=ans*a;
//             }
//             a=a*a;
//             n=n>>1;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//     //    int n= getIthbit(4, 1);
//     //    System.out.println(n);
//     System.out.println(fastexpo(5, 3));
//     }
// }

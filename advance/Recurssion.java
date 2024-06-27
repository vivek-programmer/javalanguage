// package advance;

// public class Recurssion {
//     public static  int fact (int n){
//         if (n==0){
//             return 1;
//         }
//         int fn=n*fact(n-1);
//         return fn;
//     }
//     public static int fiboonacci (int n){
//         if (n==0||n==1){
//             return n;
//         }
//         int fnm1=fiboonacci(n-1);
//         int fnm2=fiboonacci(n-2);
//         int f=fnm1+fnm2;
//         return f;
//     }
//     public static boolean isshorted(int arr[],int i){
//         if (i==arr.length-1){
//             return true;
//         }
//         if (arr[i]>arr[i+1]){
//             return  false;
//         }
//         return  isshorted(arr, i+1);
//     }
//     public static int lastocc(int arr[],int i,int key){
//        if (i==arr.length){
//         return -1;
//        }
//        int isfound= lastocc(arr, i+1,key);
//        if(isfound==-1&&arr[i]==key){
//         return i;
//        }
//        return isfound;
//     }
//     public static int optimizedpower(int a,int m){
//         if(m==0){
//             return 1;
//         }
//         int halfpower=optimizedpower(a, m/2);
//         int halfpowersq=halfpower*halfpower;
//         if(m%2!=0){
//             halfpowersq=halfpowersq*a;
//         }
//         return halfpowersq;
//     }
//     public static void main(String[] args) {
//         int arr[]={7,7,7,7};

//         System.err.println(optimizedpower(2, 10));
//     }
    
// }

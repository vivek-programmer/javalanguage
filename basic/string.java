// package basic;

// public class string {
//     // public static void charte(String fullname){
//     // for (int i=0;i<fullname.length();i++){
//     // System.out.print(fullname.charAt(i)+" ");
//     // }
//     // }
//     // public static boolean ispalindrome(String str){
//     // for (int i=0;i<str.length()/2;i++){
//     // int n=str.length();
//     // if(str.charAt(i)!=str.charAt(n-1-i)){
//     // return false;
//     // }
//     // }
//     // return true;
//     // }
//     // public static String touppercase(String str) {
//     //     StringBuilder sb = new StringBuilder(" ");
//     //     char ch = Character.toUpperCase(str.charAt(0));
//     //     sb.append(ch);
//     //     for (int i = 1; i < str.length(); i++) {
//     //         if (str.charAt(i) == ' ' && i < str.length() - 1) {
//     //             sb.append(str.charAt(i));
//     //             i++;
//     //             sb.append(Character.toUpperCase(str.charAt(i)));
//     //         } else {
//     //             sb.append(str.charAt(i));
//     //         }
//     //     }
//     //     return sb.toString();
//     // }
//     public static String compress(String str){
//         String sb="";
//         for(int i=0;i<str.length();i++){
//             Integer count=1;
//             while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             sb+=str.charAt(i);
//             if (count>1){
//                 sb+=count.toString();
//             }
//         }
//         return sb;
//     }

//     public static void main(String[] args) {
//         char arr[] ={'a','b','c','d'};
//         String name;
//         // STRINGS ARE UNMUTABLE
//         Scanner sc =new Scanner (System.in);
//         name =sc.nextLine();
//         System.out.println(name);
//         String name="vivek";
//         String last ="kumar";
//         String fullname=name+" "+last;
//         String str="klmadsm";
//         System.out.println(ispalindrome(str));
//         String s1="tony";
//         String s2="tony";
//         String s3=new String("tony");
//         if (s1==s2){
//         System.out.println("strings are equal");
//         }
//         if (s1.equals(s3)){
//         System.out.println("not equal");
//         }
//         String name = "hi i am vivek";
//         String me=touppercase(name);
//         System.out.println(me);
//         String str="aaabbbcccdd";
//         System.out.println(compress(str));
//     }
// }

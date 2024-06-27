package StanderedProblem;

public class Pair {
    public static int pairways(int n){
        if (n==1||n==2) {
            return n;
        } 
        int fnm1=pairways(n-1);//dry run kr lena
        int ways=(n-1)*pairways(n-2);
        return fnm1+ways;
      }
      public static void binaryString(String str,int n,int lastoccrance){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryString(str+"0", n-1, 0);
        if(lastoccrance==0){
            binaryString(str+"1", n-1, 1);
        }
      }
    public static void main(String[] args) {
        String str="";
        binaryString(str, 3,1);
    }
}

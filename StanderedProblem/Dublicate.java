package StanderedProblem;

public class Dublicate {
    public static void Dublicatechar(String str,StringBuilder newstr,boolean map[],int i){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        if (map[str.charAt(i)-'a']==true){
            Dublicatechar(str, newstr, map, i+1);
        }
        else {
            map[str.charAt(i)-'a']=true;
            Dublicatechar(str, newstr.append(str.charAt(i)), map, i+1);
        }
    }
    public static void main(String[] args) {
        String str="aappnnacollege";
        
         boolean map[]=new boolean[26];
        Dublicatechar(str, new StringBuilder(""), map, 0);
    }
}

import java.util.HashMap;

public class Question_08 {
    public static void main(String[] args) {
        String s="LVIII";
        System.out.println(RomanToInt(s));
    }
    public static int RomanToInt(String s){
        HashMap<Character,Integer> ans = new HashMap<>();
        ans.put('I',1);
        ans.put('V',5);
        ans.put('X',10);
        ans.put('L',50);
        ans.put('C',100);
        ans.put('D',500);
        ans.put('M',1000);
        int result = ans.get(s.charAt(s.length()-1));
        for(int i = s.length()-2;i>=0;i--){
            if(ans.get(s.charAt(i))< ans.get(s.charAt(i+1))){
                result-=ans.get(s.charAt(i));
            }else{
                result+=ans.get(s.charAt(i));
            }
        }
        return result;
    }
}

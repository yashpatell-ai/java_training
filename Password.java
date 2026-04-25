import java.util.*;

public class Password {
    static String passwordStrength(String pass){
        boolean haslength = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpechar = false;

        if(pass.length()>=8)
            haslength=true;
        for(char c : pass.toCharArray()){
            if(Character.isDigit(c))
                hasDigit=true;
            else if(Character.isUpperCase(c))
                hasUpper=true;
            else
                hasSpechar = true;
        }
        if(haslength && hasDigit && hasSpechar && hasUpper){
            return "Strong";
        }
        return "weak";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = passwordStrength(s);
        System.out.println(ans);
    }
}
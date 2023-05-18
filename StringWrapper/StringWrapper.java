/**
 * StringWrapper
 */
public class StringWrapper {
    public String s;
    
   
    public static void main(String[]args) {
        StringWrapper b = new StringWrapper();
        b.s = "hello";
        changeString(b);
        System.out.println(b.s);
        
    }

    static void changeString(StringWrapper racghel) {
        racghel.s += " World";
    }
}

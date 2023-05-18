public class StringWrapper2 {
    public String s;


    public static void main(String []args) {
        StringWrapper2 st = new StringWrapper2();
        st.s ="Hello";
        changeString(st);
        System.out.println(st.s);
        change(st);
        System.out.println(st.s);

        
    }

    static void changeString(StringWrapper2 t) {
        t.s += " world";
    }

    static void change(StringWrapper2 t) {
        // System.out.println( s.concat(" World is Changed"));
        t.s = t.s.concat(" World is Changed");
    }
    
}

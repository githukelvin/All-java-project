class Y{
    public static void main(String args[]) {
        X Obj = new X();
        double results;
        Obj.methodA(10);
        Obj.methodA(10, 20);
        results = Obj.methodA(5.5);
        System.out.println("Result: " + results);
        
        
    }
}
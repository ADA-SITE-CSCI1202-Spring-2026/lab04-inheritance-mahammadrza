public class MathDemo {
    public static int min(int a , int b){
        return (a > b) ? b :a;
    }
    
    public static int max (int a , int b){
        return (a > b) ? a : b;
    }

    public static int sum(int[] args){
        int s = 0; 
        for (int num : args){
            s = s + num;
        }
        return s;
    }

    public static void main(String[] args){
        System.out.println("Max " + max(10, 100));
    }

}

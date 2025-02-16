public class App { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
        
        int start = 13; 
        while (start > 0) { 
            System.out.println(start); 
            start = start / 2; 
        } 
        
        for (int answer = start; answer > 0; answer = answer % 2) { 
            System.out.println(answer); 
        } 
        
        String result = convert(start); 
        if (start != 0) {
            System.out.println(result + start % 2 + start / 2); 
        } else {
            System.out.println(result);
        }
    } 
    
    public static String convert(int input) { 
        return ""; 
    } 
}

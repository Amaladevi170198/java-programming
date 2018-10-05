class OddEven { 
    public static boolean isEven(int n) 
    { 
        if((n & 1) == 0) 
            return true; 
        else
            return false; 
    } 
      public static void main(String[] args) 
    { 
        int n = 12; 
        if(isEven(n) == true) 
            System.out.print("Even"); 
        else
            System.out.print("Odd"); 
    } 
} 

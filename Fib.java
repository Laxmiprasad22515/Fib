public class FibonacciSeries
{
    public static void main(String[] args) 
    {
        int n = 10;
        int fTerm = 0, sTerm = 1;
        
        System.out.println("Fibonacci Series till " + n + " terms:");
        
        for (int i = 1; i <= n; ++i) 
	{
            System.out.print(firstTerm + ", ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

import java.sql.SQLOutput;

public class LoopsExcercises {

    public static int addOdds(int n) // doesn't account for numbers below 1
    {
//        int sum = 0;              // Alternate Method
//        if (n % 2 == 0)
//        {
//            n -= 1;
//        }
//        while (n >= 1)
//        {
//            sum += n;
//            n -= 2;
//        }
//        return sum;
        int sum = 0;
        int count = 1;
        while (count <= n)
        {
            sum += count;
            count += 2;
        }
        return sum;
    }

    public static int howManyYears(double startpop, double endpop) // doesn't account for numbers below 1
    {
        int numyear = 0;
        while (startpop <= endpop)
        {
            startpop *= 1.0113 ;
            numyear ++; 
        }
        return numyear; 
    }

    public static void printSum(int n) // doesn't account for numbers below 1
    {
        int sum = 1;
        int count = 1;
        System.out.print(count);
        count++;
        while (count <= n) {
            sum += count;
            System.out.print(" + " + count);
            count++;
        }
        System.out.println(" = " + sum);
    }


    public static boolean isPerfectSquare(int n)
    {
        int count = 1;
        while (true)
        {
        // System.out.print(count + " ");
          n -= count;
          count += 2;
            if (n == 0) { return true;  }
            if (n < 0)  { return false; }
        }
    }

    public static int sumDigits(int n)
    {
        int sum = 0;
        while (n >= 1)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    public static void main(String[] args)
    {
        System.out.println(addOdds(1));
        System.out.println(addOdds(7));
        System.out.println(addOdds(17));
        System.out.println(addOdds(28));
        System.out.println("");
        System.out.println(howManyYears(120, 150));
        System.out.println(howManyYears(270, 500));
        System.out.println(howManyYears(300, 304));
        System.out.println(howManyYears(10, 11));
        System.out.println("");
        printSum(21);
        printSum(28);
        printSum(15);
        printSum(9);
        System.out.println("");
        System.out.println(isPerfectSquare(49));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(71));
        System.out.println(isPerfectSquare(17));
        System.out.println(isPerfectSquare(-1));
        System.out.println("");
        System.out.println(sumDigits(11));
        System.out.println(sumDigits(55));
        System.out.println(sumDigits(179));
        System.out.println(sumDigits(4974));
    }
}

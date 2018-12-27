import java.util.Scanner;

public class First {

        public static long getSum(long number)
        {
            long rev=0,sum=0;
            while(number>0) {
                long r = number % 10;
                if (r % 2 == 0)
                    sum += r;
                rev = rev * 10 + r;
                number = number / 10;
            }
            return sum;
        }

        public static long getReverse(long number)
        {
            long rev=0,sum=0;
            while(number>0) {
                long r = number % 10;
                if (r % 2 == 0)
                    sum += r;
                rev = rev * 10 + r;
                number = number / 10;
            }
            return rev;
        }

        public static boolean checkPalindrome(long number,long rev)
        {
            if(number==rev)
                return true;
            else
                return false;
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            long number;
            number=sc.nextLong();
            long temp = number;
            long rev=getReverse(number);

            boolean isPalindrome = checkPalindrome(number,rev);

            long sum = getSum(number);

            if(isPalindrome)
            {
                if(sum>25)
                {
                    System.out.println("Palindrome and sum is greater than 25");
                }
                else
                    System.out.println("Palindrome and sum is not greater than 25");
            }
            else
                System.out.println("Not Palindrome");
        }
}



public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        while (number!=0) {
            System.out.println(number%10);
            number/=10;
        }
    }


    public int countLetter(String word, String letter) {
        int i = 0;
        int c = 0;
        while (i!=word.length()) {
            if (letter.equals(word.substring(i,i+1))) {
                c++;
            }
            i++;
        }
        return c;
    }

    public int maxDoubles(int number, int threshold) {
        int c = 0;
        while (number <= threshold) {
            number*=2;
            c++;
        }
        if (c==0) {
            return 0;
        }
        return c-1;
    }


    public boolean isPrime(int number) {
        if (number==1) {
            return false;
        }

        int c=2;
        while (c<number) {
            if ((c*(number/c))==number) {
                return false;
            }
            c++;
        }
        return true;
    }
}

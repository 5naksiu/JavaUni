import java.math.BigInteger;
public class Ułamek {
    private int counter;
    private int denominator;

    public Ułamek(int counter, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be equal to 0");
        }
        this.counter = counter;
        this.denominator = denominator;

        simplify();
    }
    private void simplify() {
        int nwd = nwd(Math.abs(counter), Math.abs(denominator));
        this.counter /= nwd;
        this.denominator /= nwd;
    }
    private int nwd(int a, int b) {
        BigInteger nwd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
        return nwd.intValue();
    }
    public Ułamek add(Ułamek ułamek) {
        int newdenominator = denominator * ułamek.denominator;
        int newcounter = counter * ułamek.denominator + ułamek.counter * denominator;

        return new Ułamek(newcounter,newdenominator);
    }
    public Ułamek substraction(Ułamek ułamek) {
        int newdenominator = denominator * ułamek.denominator;
        int newcounter = counter * ułamek.denominator - ułamek.counter * denominator;

        return new Ułamek(newcounter,newdenominator);
    }
    public Ułamek multiply(Ułamek ułamek) {
        int newdenominator = denominator * ułamek.denominator;
        int newcounter = counter * ułamek.counter;

        return new Ułamek(newcounter,newdenominator);
    }
    public Ułamek divide(Ułamek ułamek) {
        int newdenominator = denominator * ułamek.counter;
        int newcounter = counter * ułamek.denominator;

        return new Ułamek(newcounter,newdenominator);
    }



    public String toString() {
        if (denominator == 1){
            return String.valueOf(counter);
        }else{
            return counter + "/" + denominator;
        }

    }
}

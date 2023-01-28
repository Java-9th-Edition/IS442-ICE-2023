
public class Rational {
    private int numerator = 1;
    private int denominator = 1;

    public Rational(int a, int b) {
        this.numerator = a;
        this.denominator = b;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    public Rational add(Rational rat2) {
        int newNumerator = (this.getNumerator() * rat2.getDenominator())
                + (this.getDenominator() * rat2.getNumerator());
        int newDenom = this.getDenominator() * rat2.getDenominator();

        return new Rational(newNumerator, newDenom);
    }

    public Rational subtract(Rational rat2) {
        int newNumerator = (this.getNumerator() * rat2.getDenominator())
                - (this.getDenominator() * rat2.getNumerator());
        int newDenom = this.getDenominator() * rat2.getDenominator();

        return new Rational(newNumerator, newDenom);
    }

    public Rational multiply(Rational rat2) {
        int newNumerator = this.getNumerator() * rat2.getNumerator();
        int newDenom = this.getDenominator() * rat2.getDenominator();

        return new Rational(newNumerator, newDenom);
    }

    public Rational divide(Rational rat2) {
        int newNumerator = this.getNumerator() * rat2.getDenominator();
        int newDenom = this.getDenominator() * rat2.getNumerator();

        return new Rational(newNumerator, newDenom);
    }

}
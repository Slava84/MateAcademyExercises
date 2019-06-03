package complexNumber;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != getClass()) return  false;

        ComplexNumber complexNumber = (ComplexNumber) obj;
        return getRe() == complexNumber.getRe() && getIm() == complexNumber.getIm();

    }

    @Override
    public int hashCode() {
        return (int) (31 * (getRe() * getIm() - getIm()));
    }
}

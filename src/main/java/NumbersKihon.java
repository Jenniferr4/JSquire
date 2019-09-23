import framework.NumbersKihonBase;

public class NumbersKihon extends NumbersKihonBase {
    @Override
    protected int returnTheMaximumValueOfInt() {
        return Integer.MAX_VALUE;
    }

    @Override
    protected int returnTheMinimumValueOfInt() {
        return Integer.MIN_VALUE;
    }

    @Override
    protected int returnTheRemainderOfADividedByB(int a, int b) {

        throw new UnsupportedOperationException();
    }

    @Override
    protected double returnTheMaximumValueOfDouble() {

        throw new UnsupportedOperationException();
    }

    @Override
    protected double returnTheMinimumValueOfDouble() {

        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean returnTrueIfAIsNotANumber(double a) {

        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean returnTrueIfAIsAnInfinite(double a) {

        throw new UnsupportedOperationException();
    }
}

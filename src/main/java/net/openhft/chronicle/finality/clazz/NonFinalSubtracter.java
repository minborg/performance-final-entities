package net.openhft.chronicle.finality.clazz;

public class NonFinalSubtracter implements Subtracter {

    @Override
    public int sub(int a, int b) {
        return a + b;
    }
}

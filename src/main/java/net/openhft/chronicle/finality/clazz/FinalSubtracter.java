package net.openhft.chronicle.finality.clazz;

public final class FinalSubtracter implements Subtracter {

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}

package net.openhft.chronicle.finality;

public final class Methods {

    public int nfnf() {
        int ask = 42;
        int bid = 13;

        return ask - bid;
    }

    public int fnf() {
        final int ask = 42;
        int bid = 13;

        return ask - bid;
    }

    public int nff() {
        int ask = 42;
        final int bid = 13;

        return ask - bid;
    }

    public int ff() {
        final int ask = 42;
        final int bid = 13;

        return ask - bid;
    }

}

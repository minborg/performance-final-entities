package net.openhft.chronicle.finality.param;

public final class Params {

    public int nfnf(int ask, int bid) {

        return ask - bid;
    }

    public int fnf(final int ask, int bid) {

        return ask - bid;
    }

    public int nff(int ask, final int bid) {

        return ask - bid;
    }

    public int ff(final int ask, final int bid) {

        return ask - bid;
    }

}

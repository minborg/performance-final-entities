package net.openhft.chronicle.finality.param;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;

@Fork(value = 1, warmups = 1)
@BenchmarkMode(Mode.Throughput)
public class BenchParams {

    private static final Params methods = new Params();

    //@Benchmark
    public int p_nfnf() {
        return methods.nfnf(42,13);
    }

    //@Benchmark
    public int p_fnf() {
        return methods.fnf(42,13);
    }

    //@Benchmark
    public int p_nff() {
        return methods.nff(42,13);
    }

    //@Benchmark
    public int p_ff() {
        return methods.ff(42,13);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }

}
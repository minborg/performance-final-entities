package net.openhft.chronicle.finality;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;

@Fork(value = 1, warmups = 1)
@BenchmarkMode(Mode.Throughput)
public class Bench {

    private static final Methods methods = new Methods();

    @Benchmark
    public int nfnf() {
        return methods.nfnf();
    }

    @Benchmark
    public int fnf() {
        return methods.fnf();
    }

    @Benchmark
    public int nff() {
        return methods.nff();
    }

    @Benchmark
    public int ff() {
        return methods.ff();
    }

    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }

}
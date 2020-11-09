package net.openhft.chronicle.finality.clazz;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

@Fork(value = 1, warmups = 1)
@BenchmarkMode(Mode.Throughput)
public class BenchClass {

    private static final Subtracter nonFinalSubtracter = new NonFinalSubtracter();
    private static final Subtracter finalSubtracter = new FinalSubtracter();

    @Benchmark
    public int nonFinalSubtracter() {
        return nonFinalSubtracter.sub(42, 13);
    }

    @Benchmark
    public int finalSubtracter() {
        return finalSubtracter.sub(42, 13);
    }


}
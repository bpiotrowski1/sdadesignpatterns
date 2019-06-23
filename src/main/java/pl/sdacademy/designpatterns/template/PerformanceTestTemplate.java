package pl.sdacademy.designpatterns.template;

public abstract class PerformanceTestTemplate {
    public abstract int getWarmUpIterationNum();
    public abstract int getIterationNum();
    public abstract void testIteration();

    public void run() {
        for (int i = 0; i < getWarmUpIterationNum(); i++) {
            testIteration();
        }

        final long start = System.currentTimeMillis();
        for (int i = 0; i < getIterationNum(); i++) {
            testIteration();
        }
        final long end = System.currentTimeMillis();

        System.out.println("Average time of an iteration took " + ((double)(end - start)) / getIterationNum() + " ms");
    }
}

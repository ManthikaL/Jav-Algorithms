public class timeTesting {
    private long startTime = -1;
    private long stopTime = -1;
    private boolean running = false;

    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        running = false;
    }

    public long getElapsedTime() {
        if (startTime == -1) {
            return 0;
        }
        if (running) {
            return System.currentTimeMillis() - startTime;
        } else {
            return stopTime - startTime;
        }
    }

    public timeTesting reset() {
        startTime = -1;
        stopTime = -1;
        running = false;
        return this;
    }
}
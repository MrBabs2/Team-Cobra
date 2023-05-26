package p015cm.aptoide.p016pt.dataprovider.util.referrer;

/* renamed from: cm.aptoide.pt.dataprovider.util.referrer.SimpleTimedFuture */
public class SimpleTimedFuture<T> {
    private int DELAY;
    private T value;

    public T get() {
        return get(5000);
    }

    public boolean isDone() {
        return this.value != null;
    }

    public void set(T t) {
        this.value = t;
    }

    public T get(int i) {
        int i2 = 0;
        while (!isDone()) {
            try {
                this.DELAY = 100;
                Thread.sleep((long) 100);
                i2++;
                if (this.DELAY * i2 > i) {
                    throw new InterruptedException("TimeOut reached! " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        }
        return this.value;
    }
}

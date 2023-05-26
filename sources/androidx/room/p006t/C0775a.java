package androidx.room.p006t;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: androidx.room.t.a */
/* compiled from: CopyLock */
public class C0775a {

    /* renamed from: e */
    private static final Map<String, Lock> f2850e = new HashMap();

    /* renamed from: a */
    private final File f2851a;

    /* renamed from: b */
    private final Lock f2852b;

    /* renamed from: c */
    private final boolean f2853c;

    /* renamed from: d */
    private FileChannel f2854d;

    public C0775a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f2851a = file2;
        this.f2852b = m3532a(file2.getAbsolutePath());
        this.f2853c = z;
    }

    /* renamed from: a */
    public void mo4455a() {
        this.f2852b.lock();
        if (this.f2853c) {
            try {
                FileChannel channel = new FileOutputStream(this.f2851a).getChannel();
                this.f2854d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: b */
    public void mo4456b() {
        FileChannel fileChannel = this.f2854d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f2852b.unlock();
    }

    /* renamed from: a */
    private static Lock m3532a(String str) {
        Lock lock;
        synchronized (f2850e) {
            lock = f2850e.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f2850e.put(str, lock);
            }
        }
        return lock;
    }
}

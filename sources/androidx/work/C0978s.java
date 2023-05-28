package androidx.work;

import android.content.Context;

/* renamed from: androidx.work.s */
/* compiled from: WorkerFactory */
public abstract class C0978s {
    private static final String TAG = C0834i.m3721a("WorkerFactory");

    /* renamed from: androidx.work.s$a */
    /* compiled from: WorkerFactory */
    static class C0979a extends C0978s {
        C0979a() {
        }

        public ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static C0978s getDefaultWorkerFactory() {
        return new C0979a();
    }

    public abstract ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker createWorkerWithDefaultFallback(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker createWorker = createWorker(context, str, workerParameters);
        if (createWorker != null) {
            return createWorker;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                C0834i a = C0834i.m3720a();
                String str2 = TAG;
                a.mo4727b(str2, "Could not instantiate " + str, e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            C0834i a2 = C0834i.m3720a();
            String str3 = TAG;
            a2.mo4727b(str3, "Class not found: " + str, new Throwable[0]);
            return null;
        }
    }
}

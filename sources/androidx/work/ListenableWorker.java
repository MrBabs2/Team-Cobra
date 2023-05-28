package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p112n.p277e.p298c.p299a.p300a.C10661a;

public abstract class ListenableWorker {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C0815a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C0816a extends C0815a {

            /* renamed from: a */
            private final C0829e f2930a;

            public C0816a() {
                this(C0829e.f2982c);
            }

            /* renamed from: d */
            public C0829e mo4650d() {
                return this.f2930a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0816a.class != obj.getClass()) {
                    return false;
                }
                return this.f2930a.equals(((C0816a) obj).f2930a);
            }

            public int hashCode() {
                return (C0816a.class.getName().hashCode() * 31) + this.f2930a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f2930a + '}';
            }

            public C0816a(C0829e eVar) {
                this.f2930a = eVar;
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C0817b extends C0815a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C0817b.class == obj.getClass();
            }

            public int hashCode() {
                return C0817b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C0818c extends C0815a {

            /* renamed from: a */
            private final C0829e f2931a;

            public C0818c() {
                this(C0829e.f2982c);
            }

            /* renamed from: d */
            public C0829e mo4657d() {
                return this.f2931a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0818c.class != obj.getClass()) {
                    return false;
                }
                return this.f2931a.equals(((C0818c) obj).f2931a);
            }

            public int hashCode() {
                return (C0818c.class.getName().hashCode() * 31) + this.f2931a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f2931a + '}';
            }

            public C0818c(C0829e eVar) {
                this.f2931a = eVar;
            }
        }

        C0815a() {
        }

        /* renamed from: a */
        public static C0815a m3648a(C0829e eVar) {
            return new C0818c(eVar);
        }

        /* renamed from: b */
        public static C0815a m3649b() {
            return new C0817b();
        }

        /* renamed from: c */
        public static C0815a m3650c() {
            return new C0818c();
        }

        /* renamed from: a */
        public static C0815a m3647a() {
            return new C0816a();
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.mo4663a();
    }

    public final UUID getId() {
        return this.mWorkerParams.mo4664b();
    }

    public final C0829e getInputData() {
        return this.mWorkerParams.mo4665c();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.mo4666d();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.mo4667e();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.mo4668f();
    }

    public C0956a getTaskExecutor() {
        return this.mWorkerParams.mo4669g();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.mo4670h();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.mo4671i();
    }

    public C0978s getWorkerFactory() {
        return this.mWorkerParams.mo4672j();
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract C10661a<C0815a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}

package com.flurry.sdk;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p112n.p113d.p114a.C10565d;

/* renamed from: com.flurry.sdk.s3 */
public final class C7018s3 extends C7008r6 {

    /* renamed from: e */
    private static final AtomicInteger f13157e = new AtomicInteger(0);

    /* renamed from: com.flurry.sdk.s3$a */
    public enum C7019a {
        RECOVERABLE_ERROR(1),
        CAUGHT_EXCEPTION(2),
        UNRECOVERABLE_CRASH(3);
        

        /* renamed from: f */
        public int f13162f;

        private C7019a(int i) {
            this.f13162f = i;
        }
    }

    /* renamed from: com.flurry.sdk.s3$b */
    public enum C7020b {
        NO_LOG(0),
        ANDROID_LOG_ATTACHED(2),
        NATIVE_CRASH_ATTACHED(3);
        

        /* renamed from: f */
        public int f13167f;

        private C7020b(int i) {
            this.f13167f = i;
        }
    }

    private C7018s3(C7031t6 t6Var) {
        super(t6Var);
    }

    /* renamed from: h */
    public static AtomicInteger m14896h() {
        return f13157e;
    }

    /* renamed from: a */
    public final C7023s6 mo23538a() {
        return C7023s6.ANALYTICS_ERROR;
    }

    /* renamed from: a */
    public static C10565d m14895a(C6746b bVar) {
        int i;
        int i2;
        C6746b bVar2 = bVar;
        if (bVar2 == null) {
            C6792d1.m14487d("StreamingErrorFrame", "Error is null, do not send the frame.");
            return C10565d.kFlurryEventFailed;
        }
        boolean equals = C6978p7.UNCAUGHT_EXCEPTION_ID.f13116f.equals(bVar2.f12552a);
        List<C6932m7> list = equals ? bVar2.f12559h : null;
        int incrementAndGet = f13157e.incrementAndGet();
        String str = bVar2.f12552a;
        long j = bVar2.f12553b;
        String str2 = bVar2.f12554c;
        String str3 = bVar2.f12555d;
        String a = m14894a(bVar2.f12556e);
        String str4 = bVar2.f12552a;
        if (bVar2.f12556e != null) {
            if (C6978p7.UNCAUGHT_EXCEPTION_ID.f13116f.equals(str4)) {
                i = C7019a.UNRECOVERABLE_CRASH.f13162f;
            } else {
                i = C7019a.CAUGHT_EXCEPTION.f13162f;
            }
        } else if (C6978p7.NATIVE_CRASH.f13116f.equals(str4)) {
            i = C7019a.UNRECOVERABLE_CRASH.f13162f;
        } else {
            i = C7019a.RECOVERABLE_ERROR.f13162f;
        }
        int i3 = i;
        if (bVar2.f12556e == null) {
            i2 = C7020b.NO_LOG.f13167f;
        } else {
            i2 = C7020b.ANDROID_LOG_ATTACHED.f13167f;
        }
        C7018s3 s3Var = new C7018s3(new C7028t3(incrementAndGet, str, j, str2, str3, a, i3, i2, bVar2.f12557f, bVar2.f12558g, C6945n7.m14745b(), list, "", ""));
        if (equals) {
            C6925m2.m14707a().f12986a.f13215a.mo23748b(s3Var);
        } else {
            C6925m2.m14707a().mo23649a(s3Var);
        }
        return C10565d.kFlurryEventRecorded;
    }

    /* renamed from: a */
    public static C7018s3 m14893a(C7028t3 t3Var) {
        return new C7018s3(t3Var);
    }

    /* renamed from: a */
    private static String m14894a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append(append);
            sb.append(C6938n2.f13020a);
        }
        if (th.getCause() != null) {
            sb.append(C6938n2.f13020a);
            sb.append("Caused by: ");
            for (StackTraceElement append2 : th.getCause().getStackTrace()) {
                sb.append(append2);
                sb.append(C6938n2.f13020a);
            }
        }
        return sb.toString();
    }
}

package com.airbnb.epoxy;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.airbnb.epoxy.m */
/* compiled from: EpoxyAsyncUtil */
public final class C5605m {

    /* renamed from: a */
    public static final Handler f9885a = m10649a(Looper.getMainLooper(), false);

    /* renamed from: b */
    public static final Handler f9886b = m10649a(Looper.getMainLooper(), true);

    /* renamed from: c */
    private static Handler f9887c;

    /* renamed from: a */
    public static Handler m10648a() {
        if (f9887c == null) {
            f9887c = m10649a(m10650a("epoxy"), true);
        }
        return f9887c;
    }

    /* renamed from: a */
    public static Handler m10649a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, true});
            } catch (Throwable unused) {
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public static Looper m10650a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }
}

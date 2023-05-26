package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zam;
import java.util.concurrent.ExecutorService;

public final class zabh {

    /* renamed from: a */
    private static final ExecutorService f13931a = zam.m25827a().mo29979a(2, new NumberedThreadFactory("GAC_Executor"), 9);

    /* renamed from: a */
    public static ExecutorService m15754a() {
        return f13931a;
    }
}

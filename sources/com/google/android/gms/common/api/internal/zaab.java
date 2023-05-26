package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class zaab {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f13862a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<TaskCompletionSource<?>, Boolean> f13863b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25143a(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.f13862a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo24964a((PendingResult.StatusListener) new C7168b(this, basePendingResult));
    }

    /* renamed from: b */
    public final void mo25146b() {
        m15614a(false, GoogleApiManager.f13718s);
    }

    /* renamed from: c */
    public final void mo25147c() {
        m15614a(true, zacp.f13957d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <TResult> void mo25144a(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.f13863b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.mo30710a().mo30704a(new C7170c(this, taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo25145a() {
        return !this.f13862a.isEmpty() || !this.f13863b.isEmpty();
    }

    /* renamed from: a */
    private final void m15614a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f13862a) {
            hashMap = new HashMap(this.f13862a);
        }
        synchronized (this.f13863b) {
            hashMap2 = new HashMap(this.f13863b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo25014b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).mo30713b((Exception) new ApiException(status));
            }
        }
    }
}

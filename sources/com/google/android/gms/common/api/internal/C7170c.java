package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.c */
final class C7170c implements OnCompleteListener<TResult> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f13781a;

    /* renamed from: b */
    private final /* synthetic */ zaab f13782b;

    C7170c(zaab zaab, TaskCompletionSource taskCompletionSource) {
        this.f13782b = zaab;
        this.f13781a = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo6796a(Task<TResult> task) {
        this.f13782b.f13863b.remove(this.f13781a);
    }
}

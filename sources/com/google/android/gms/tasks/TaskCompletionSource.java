package com.google.android.gms.tasks;

public class TaskCompletionSource<TResult> {

    /* renamed from: a */
    private final C8406g<TResult> f23704a = new C8406g<>();

    /* renamed from: a */
    public void mo30712a(TResult tresult) {
        this.f23704a.mo30722a(tresult);
    }

    /* renamed from: b */
    public boolean mo30714b(TResult tresult) {
        return this.f23704a.mo30724b(tresult);
    }

    /* renamed from: a */
    public void mo30711a(Exception exc) {
        this.f23704a.mo30721a(exc);
    }

    /* renamed from: b */
    public boolean mo30713b(Exception exc) {
        return this.f23704a.mo30723b(exc);
    }

    /* renamed from: a */
    public Task<TResult> mo30710a() {
        return this.f23704a;
    }
}

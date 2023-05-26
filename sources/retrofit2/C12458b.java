package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* renamed from: retrofit2.b */
/* compiled from: lambda */
public final /* synthetic */ class C12458b implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.C124421 f32209f;

    /* renamed from: g */
    private final /* synthetic */ Callback f32210g;

    /* renamed from: h */
    private final /* synthetic */ Throwable f32211h;

    public /* synthetic */ C12458b(DefaultCallAdapterFactory.ExecutorCallbackCall.C124421 r1, Callback callback, Throwable th) {
        this.f32209f = r1;
        this.f32210g = callback;
        this.f32211h = th;
    }

    public final void run() {
        this.f32209f.mo40503a(this.f32210g, this.f32211h);
    }
}

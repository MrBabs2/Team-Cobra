package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* renamed from: retrofit2.a */
/* compiled from: lambda */
public final /* synthetic */ class C12452a implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.C124421 f32206f;

    /* renamed from: g */
    private final /* synthetic */ Callback f32207g;

    /* renamed from: h */
    private final /* synthetic */ Response f32208h;

    public /* synthetic */ C12452a(DefaultCallAdapterFactory.ExecutorCallbackCall.C124421 r1, Callback callback, Response response) {
        this.f32206f = r1;
        this.f32207g = callback;
        this.f32208h = response;
    }

    public final void run() {
        this.f32206f.mo40504a(this.f32207g, this.f32208h);
    }
}

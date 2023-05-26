package p015cm.aptoide.p016pt.networking;

import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.networking.o */
/* compiled from: lambda */
public final /* synthetic */ class C3445o implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ MultipartBodyInterceptor f6431f;

    /* renamed from: g */
    private final /* synthetic */ HashMapNotNull f6432g;

    public /* synthetic */ C3445o(MultipartBodyInterceptor multipartBodyInterceptor, HashMapNotNull hashMapNotNull) {
        this.f6431f = multipartBodyInterceptor;
        this.f6432g = hashMapNotNull;
    }

    public final Object call(Object obj) {
        return this.f6431f.mo13062a(this.f6432g, (Authentication) obj);
    }
}

package p015cm.aptoide.p016pt.networking;

import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.networking.p */
/* compiled from: lambda */
public final /* synthetic */ class C3446p implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ MultipartBodyInterceptor f6433f;

    /* renamed from: g */
    private final /* synthetic */ Authentication f6434g;

    /* renamed from: h */
    private final /* synthetic */ HashMapNotNull f6435h;

    public /* synthetic */ C3446p(MultipartBodyInterceptor multipartBodyInterceptor, Authentication authentication, HashMapNotNull hashMapNotNull) {
        this.f6433f = multipartBodyInterceptor;
        this.f6434g = authentication;
        this.f6435h = hashMapNotNull;
    }

    public final Object call(Object obj) {
        return this.f6433f.mo13063a(this.f6434g, this.f6435h, (String) obj);
    }
}

package p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.Aptwords;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v2.aptwords.b */
/* compiled from: lambda */
public final /* synthetic */ class C2178b implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ HashMapNotNull f4867f;

    /* renamed from: g */
    private final /* synthetic */ Aptwords.Interfaces f4868g;

    /* renamed from: h */
    private final /* synthetic */ boolean f4869h;

    public /* synthetic */ C2178b(HashMapNotNull hashMapNotNull, Aptwords.Interfaces interfaces, boolean z) {
        this.f4867f = hashMapNotNull;
        this.f4868g = interfaces;
        this.f4869h = z;
    }

    public final Object call(Object obj) {
        return this.f4867f.put("aptvercode", String.valueOf((Integer) obj));
    }
}

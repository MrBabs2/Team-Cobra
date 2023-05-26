package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.b1 */
/* compiled from: lambda */
public final /* synthetic */ class C2192b1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ GetStoreWidgets.WSWidget f4885f;

    public /* synthetic */ C2192b1(GetStoreWidgets.WSWidget wSWidget) {
        this.f4885f = wSWidget;
    }

    public final Object call(Object obj) {
        GetStoreWidgets.WSWidget wSWidget = this.f4885f;
        WSWidgetsUtils.m5302b(wSWidget, (GetAdsResponse) obj);
        return wSWidget;
    }
}

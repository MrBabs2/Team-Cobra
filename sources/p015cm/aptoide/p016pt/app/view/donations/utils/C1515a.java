package p015cm.aptoide.p016pt.app.view.donations.utils;

import android.content.Context;
import p120q.p326a.p328c0.C10849c;

/* renamed from: cm.aptoide.pt.app.view.donations.utils.a */
/* compiled from: lambda */
public final /* synthetic */ class C1515a implements C10849c {

    /* renamed from: a */
    private final /* synthetic */ Context f4032a;

    /* renamed from: b */
    private final /* synthetic */ int f4033b;

    /* renamed from: c */
    private final /* synthetic */ String f4034c;

    /* renamed from: d */
    private final /* synthetic */ String f4035d;

    /* renamed from: e */
    private final /* synthetic */ String f4036e;

    /* renamed from: f */
    private final /* synthetic */ String f4037f;

    /* renamed from: g */
    private final /* synthetic */ String f4038g;

    /* renamed from: h */
    private final /* synthetic */ String f4039h;

    public /* synthetic */ C1515a(Context context, int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f4032a = context;
        this.f4033b = i;
        this.f4034c = str;
        this.f4035d = str2;
        this.f4036e = str3;
        this.f4037f = str4;
        this.f4038g = str5;
        this.f4039h = str6;
    }

    /* renamed from: a */
    public final Object mo7653a(Object obj, Object obj2) {
        return GenericPaymentIntentBuilder.buildPaymentIntent(this.f4032a, this.f4033b, this.f4034c, this.f4035d, (String) obj, (String) obj2, this.f4036e, this.f4037f, this.f4038g, this.f4039h);
    }
}

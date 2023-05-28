package p015cm.aptoide.p016pt.util;

import android.content.Context;
import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p123rx.p126m.C5378b;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.util.e */
/* compiled from: lambda */
public final /* synthetic */ class C4443e implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ int f7614f;

    /* renamed from: g */
    private final /* synthetic */ boolean f7615g;

    /* renamed from: h */
    private final /* synthetic */ AdsRepository f7616h;

    /* renamed from: i */
    private final /* synthetic */ OkHttpClient f7617i;

    /* renamed from: j */
    private final /* synthetic */ Converter.Factory f7618j;

    /* renamed from: k */
    private final /* synthetic */ QManager f7619k;

    /* renamed from: l */
    private final /* synthetic */ Context f7620l;

    /* renamed from: m */
    private final /* synthetic */ SharedPreferences f7621m;

    /* renamed from: n */
    private final /* synthetic */ RoomStoredMinimalAdPersistence f7622n;

    public /* synthetic */ C4443e(int i, boolean z, AdsRepository adsRepository, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager, Context context, SharedPreferences sharedPreferences, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        this.f7614f = i;
        this.f7615g = z;
        this.f7616h = adsRepository;
        this.f7617i = okHttpClient;
        this.f7618j = factory;
        this.f7619k = qManager;
        this.f7620l = context;
        this.f7621m = sharedPreferences;
        this.f7622n = roomStoredMinimalAdPersistence;
    }

    public final void call(Object obj) {
        ReferrerUtils.extractReferrer(new SearchAdResult((MinimalAd) obj), this.f7614f - 1, this.f7615g, this.f7616h, this.f7617i, this.f7618j, this.f7619k, this.f7620l, this.f7621m, new MinimalAdMapper(), this.f7622n);
    }
}

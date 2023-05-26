package p015cm.aptoide.p016pt.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.util.ReferrerUtils;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.util.f */
/* compiled from: lambda */
public final /* synthetic */ class C4444f implements Callable {

    /* renamed from: f */
    private final /* synthetic */ boolean f7623f;

    /* renamed from: g */
    private final /* synthetic */ SearchAdResult f7624g;

    /* renamed from: h */
    private final /* synthetic */ OkHttpClient f7625h;

    /* renamed from: i */
    private final /* synthetic */ Converter.Factory f7626i;

    /* renamed from: j */
    private final /* synthetic */ QManager f7627j;

    /* renamed from: k */
    private final /* synthetic */ SharedPreferences f7628k;

    /* renamed from: l */
    private final /* synthetic */ int f7629l;

    /* renamed from: m */
    private final /* synthetic */ String f7630m;

    /* renamed from: n */
    private final /* synthetic */ long f7631n;

    /* renamed from: o */
    private final /* synthetic */ AdsRepository f7632o;

    /* renamed from: p */
    private final /* synthetic */ boolean f7633p;

    /* renamed from: q */
    private final /* synthetic */ Context f7634q;

    /* renamed from: r */
    private final /* synthetic */ RoomStoredMinimalAdPersistence f7635r;

    public /* synthetic */ C4444f(boolean z, SearchAdResult searchAdResult, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager, SharedPreferences sharedPreferences, int i, String str, long j, AdsRepository adsRepository, boolean z2, Context context, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        this.f7623f = z;
        this.f7624g = searchAdResult;
        this.f7625h = okHttpClient;
        this.f7626i = factory;
        this.f7627j = qManager;
        this.f7628k = sharedPreferences;
        this.f7629l = i;
        this.f7630m = str;
        this.f7631n = j;
        this.f7632o = adsRepository;
        this.f7633p = z2;
        this.f7634q = context;
        this.f7635r = roomStoredMinimalAdPersistence;
    }

    public final Object call() {
        return ReferrerUtils.C44351.m7448a(this.f7623f, this.f7624g, this.f7625h, this.f7626i, this.f7627j, this.f7628k, this.f7629l, this.f7630m, this.f7631n, this.f7632o, this.f7633p, this.f7634q, this.f7635r);
    }
}

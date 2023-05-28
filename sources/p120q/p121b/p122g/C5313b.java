package p120q.p121b.p122g;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p036io.sentry.dsn.C9055a;
import p120q.p121b.C5307a;
import p120q.p121b.C5310b;
import p120q.p121b.C5311c;
import p120q.p121b.p122g.C11504a;
import p120q.p121b.p122g.p351d.p352a.C11508a;
import p120q.p121b.p353h.C11509a;
import p120q.p121b.p353h.C11510b;
import p120q.p121b.p354i.C11515d;
import p120q.p121b.p357j.C11533b;
import p120q.p121b.p357j.C11534c;
import p120q.p121b.p359l.C11544c;
import p120q.p121b.p359l.p360f.C11553c;
import p120q.p121b.p359l.p361g.C11559b;
import p120q.p121b.p359l.p361g.C11560c;
import p120q.p121b.p359l.p361g.C11561d;
import p120q.p121b.p359l.p361g.C11565h;
import p120q.p121b.p367q.C11591b;

/* renamed from: q.b.g.b */
/* compiled from: AndroidSentryClientFactory */
public class C5313b extends C5307a {

    /* renamed from: k */
    public static final String f9546k = "q.b.g.b";

    /* renamed from: l */
    private static volatile C11504a f9547l;

    /* renamed from: j */
    private Context f9548j;

    /* renamed from: q.b.g.b$a */
    /* compiled from: AndroidSentryClientFactory */
    class C5314a implements C11504a.C11506b {
        C5314a(C5313b bVar) {
        }

        /* renamed from: a */
        public void mo18525a(C11507c cVar) {
            String str = C5313b.f9546k;
            Log.d(str, "ANR triggered='" + cVar.getMessage() + "'");
            C11544c cVar2 = new C11544c();
            cVar2.mo37697a("thread_state", cVar.mo37622a().toString());
            cVar2.mo37701a((C11565h) new C11559b((Throwable) new C11561d(new C11560c("anr", false), cVar)));
            C5310b.m10092a(cVar2);
        }
    }

    public C5313b(Application application) {
        this(application, C11515d.m37672a());
    }

    /* renamed from: b */
    private boolean m10113b(String str) {
        return this.f9548j.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: a */
    public C5311c mo18479a(C9055a aVar) {
        if (!m10113b("android.permission.INTERNET")) {
            Log.e(f9546k, "android.permission.INTERNET is required to connect to the Sentry server, please add it to your AndroidManifest.xml");
        }
        String str = f9546k;
        Log.d(str, "Sentry init with ctx='" + this.f9548j.toString() + "'");
        String c = aVar.mo33432c();
        if (c.equalsIgnoreCase("noop")) {
            Log.w(f9546k, "*** Couldn't find a suitable DSN, Sentry operations will do nothing! See documentation: https://docs.sentry.io/clients/java/modules/android/ ***");
        } else if (!c.equalsIgnoreCase("http") && !c.equalsIgnoreCase(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)) {
            String a = this.f9545a.mo37634a("async", aVar);
            if (a == null || !a.equalsIgnoreCase(AdultContentAnalytics.UNLOCK)) {
                throw new IllegalArgumentException("Only 'http' or 'https' connections are supported in Sentry Android, but received: " + c);
            }
            throw new IllegalArgumentException("Sentry Android cannot use synchronous connections, remove 'async=false' from your options.");
        }
        C5311c a2 = super.mo18479a(aVar);
        a2.mo18514a((C11553c) new C11508a(this.f9548j));
        boolean equalsIgnoreCase = "true".equalsIgnoreCase(this.f9545a.mo37634a("anr.enable", aVar));
        String str2 = f9546k;
        Log.d(str2, "ANR is='" + String.valueOf(equalsIgnoreCase) + "'");
        if (equalsIgnoreCase && f9547l == null) {
            String a3 = this.f9545a.mo37634a("anr.timeoutIntervalMs", aVar);
            int parseInt = a3 != null ? Integer.parseInt(a3) : 5000;
            String str3 = f9546k;
            Log.d(str3, "ANR timeoutIntervalMs is='" + String.valueOf(parseInt) + "'");
            f9547l = new C11504a(parseInt, new C5314a(this));
            f9547l.start();
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C11509a mo18492l(C9055a aVar) {
        File file;
        String a = this.f9545a.mo37634a("buffer.dir", aVar);
        if (a != null) {
            file = new File(a);
        } else {
            file = new File(this.f9548j.getCacheDir().getAbsolutePath(), "sentry-buffered-events");
        }
        String str = f9546k;
        Log.d(str, "Using buffer dir: " + file.getAbsolutePath());
        return new C11510b(file, mo18495o(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C11533b mo18500t(C9055a aVar) {
        return new C11534c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Collection<String> mo18505y(C9055a aVar) {
        Collection<String> y = super.mo18505y(aVar);
        if (!y.isEmpty()) {
            return y;
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = this.f9548j.getPackageManager().getPackageInfo(this.f9548j.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f9546k, "Error getting package information.", e);
        }
        if (packageInfo == null || C11591b.m37917a(packageInfo.packageName)) {
            return y;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(packageInfo.packageName);
        return arrayList;
    }

    public C5313b(Application application, C11515d dVar) {
        super(dVar);
        Log.d(f9546k, "Construction of Android Sentry from Android Application.");
        this.f9548j = application.getApplicationContext();
    }
}

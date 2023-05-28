package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.flurry.sdk.C6778d;
import com.flurry.sdk.C6868i2;
import com.flurry.sdk.C7051v3;
import com.flurry.sdk.C7102z6;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p112n.p113d.p114a.C10564c;
import p112n.p113d.p114a.C10565d;
import p112n.p113d.p114a.C10566e;
import p112n.p113d.p114a.C5298f;

/* renamed from: com.flurry.sdk.a */
public final class C6724a extends C6916l2 {

    /* renamed from: o */
    public static AtomicBoolean f12515o = new AtomicBoolean(false);

    /* renamed from: p */
    private static C6724a f12516p = null;

    /* renamed from: n */
    public List<C10566e> f12517n;

    /* renamed from: com.flurry.sdk.a$a */
    public class C6725a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ long f12518h;

        /* renamed from: i */
        final /* synthetic */ C10564c f12519i;

        public C6725a(C6724a aVar, long j, C10564c cVar) {
            this.f12518h = j;
            this.f12519i = cVar;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6812e7.m14513a().f12706k.f12644r = this.f12518h;
            C6812e7.m14513a().f12706k.mo23573a(this.f12519i);
        }
    }

    /* renamed from: com.flurry.sdk.a$b */
    public class C6726b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ Context f12520h;

        /* renamed from: i */
        final /* synthetic */ List f12521i;

        public C6726b(C6724a aVar, Context context, List list) {
            this.f12520h = context;
            this.f12521i = list;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6925m2 a = C6925m2.m14707a();
            a.f12988c.mo23570a();
            a.f12986a.f13215a.mo23745a();
            C7102z6 z6Var = a.f12987b;
            File[] listFiles = new File(C6988q2.m14842b()).listFiles();
            if (listFiles != null) {
                for (int i = 0; i < listFiles.length; i++) {
                    if (listFiles[i].isFile()) {
                        C6792d1.m14476a(3, "StreamingFileUtil", "File " + listFiles[i].getName());
                    } else if (listFiles[i].isDirectory()) {
                        C6792d1.m14476a(3, "StreamingFileUtil", "Directory " + listFiles[i].getName());
                    }
                }
            }
            System.out.println();
            C6792d1.m14476a(2, "VNodeFileProcessor", "Number of files already pending: in startWatching " + listFiles.length);
            z6Var.mo23749a((List<File>) Arrays.asList(listFiles));
            z6Var.mo23563c(new C7102z6.C7103a(z6Var));
            C6847h2.m14568a();
            C6830g1.m14540a(this.f12520h);
            C6847h2.m14570a((List<C10566e>) this.f12521i);
            C6847h2.m14569a(this.f12520h);
        }
    }

    /* renamed from: com.flurry.sdk.a$c */
    public class C6727c extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ String f12522h;

        /* renamed from: i */
        final /* synthetic */ String f12523i;

        public C6727c(C6724a aVar, String str, String str2) {
            this.f12522h = str;
            this.f12523i = str2;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6958o6.m14774a(this.f12522h, this.f12523i);
        }
    }

    /* renamed from: com.flurry.sdk.a$d */
    public class C6728d extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ int f12524h;

        /* renamed from: i */
        final /* synthetic */ Context f12525i;

        public C6728d(C6724a aVar, int i, Context context) {
            this.f12524h = i;
            this.f12525i = context;
        }

        /* renamed from: a */
        public final void mo23531a() {
            if (this.f12524h != C5298f.f9495a) {
                C6951o1.m14763a().mo23668a(this.f12525i, (Cursor) null);
            }
            int i = this.f12524h;
            int i2 = C5298f.f9496b;
            if ((i & i2) == i2) {
                C6935n1 b = C6935n1.m14727b();
                b.f13015f = true;
                if (b.f13016g) {
                    b.mo23657a();
                }
            }
            int i3 = this.f12524h;
            int i4 = C5298f.f9497c;
            if ((i3 & i4) == i4) {
                C6985q1.m14834b().f13127d = true;
            }
        }
    }

    /* renamed from: com.flurry.sdk.a$e */
    public class C6729e extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f12526h;

        public C6729e(C6724a aVar, boolean z) {
            this.f12526h = z;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6812e7.m14513a().f12711p.mo23642a(this.f12526h);
        }
    }

    /* renamed from: com.flurry.sdk.a$f */
    class C6730f extends C6816f2 {
        C6730f(C6724a aVar) {
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6975p5.m14822h();
            C6812e7.m14513a().f12706k.mo23572a(C6814f0.FOREGROUND, true);
        }
    }

    /* renamed from: com.flurry.sdk.a$g */
    public class C6731g extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f12527h;

        /* renamed from: i */
        final /* synthetic */ boolean f12528i;

        public C6731g(C6724a aVar, boolean z, boolean z2) {
            this.f12527h = z;
            this.f12528i = z2;
        }

        /* renamed from: a */
        public final void mo23531a() {
            int identifier;
            C6778d dVar = C6812e7.m14513a().f12703h;
            String a = C6896k0.m14646c().mo23630a();
            boolean z = this.f12527h;
            boolean z2 = this.f12528i;
            dVar.f12618o = a;
            dVar.f12619p = z;
            dVar.f12620q = z2;
            dVar.mo23563c(new C6778d.C6782c());
            String property = System.getProperty("os.arch");
            String str = "";
            if (TextUtils.isEmpty(property)) {
                property = str;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("device.model", Build.MODEL);
            hashMap.put("build.brand", Build.BRAND);
            hashMap.put("build.id", Build.ID);
            hashMap.put("version.release", Build.VERSION.RELEASE);
            hashMap.put("build.device", Build.DEVICE);
            hashMap.put("build.product", Build.PRODUCT);
            C6914l0.m14692a();
            Context a2 = C6747b0.m14386a();
            if (!(a2 == null || (identifier = a2.getResources().getIdentifier("com.flurry.crash.map_id", "string", a2.getPackageName())) == 0)) {
                str = a2.getResources().getString(identifier);
            }
            hashMap.put("proguard.build.uuid", str);
            hashMap.put("device.arch", property);
            C6925m2.m14707a().mo23649a(new C6943n5(new C6957o5(hashMap)));
            C6796d5.m14493h();
            C6975p5.m14822h();
            Map<String, List<String>> a3 = new C7047v0().mo23724a();
            if (a3.size() > 0) {
                C6925m2.m14707a().mo23649a(new C6837g6(new C6851h6(a3)));
            }
            C6821f5.m14523a(C6812e7.m14513a().f12698c.f13118o);
        }
    }

    /* renamed from: com.flurry.sdk.a$h */
    public class C6732h extends C6816f2 {
        public C6732h(C6724a aVar) {
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6812e7.m14513a().f12706k.mo23574b(C6814f0.FOREGROUND, false);
        }
    }

    /* renamed from: com.flurry.sdk.a$i */
    class C6733i extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ String f12529h;

        /* renamed from: i */
        final /* synthetic */ C7051v3.C7052a f12530i;

        /* renamed from: j */
        final /* synthetic */ Map f12531j;

        /* renamed from: k */
        final /* synthetic */ boolean f12532k;

        /* renamed from: l */
        final /* synthetic */ boolean f12533l;

        /* renamed from: m */
        final /* synthetic */ long f12534m;

        /* renamed from: n */
        final /* synthetic */ long f12535n;

        C6733i(C6724a aVar, String str, C7051v3.C7052a aVar2, Map map, boolean z, boolean z2, long j, long j2) {
            this.f12529h = str;
            this.f12530i = aVar2;
            this.f12531j = map;
            this.f12532k = z;
            this.f12533l = z2;
            this.f12534m = j;
            this.f12535n = j2;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C7041u3.m14930a(this.f12529h, this.f12530i, this.f12531j, this.f12532k, this.f12533l, this.f12534m, this.f12535n);
        }
    }

    /* renamed from: com.flurry.sdk.a$j */
    public class C6734j extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ String f12536h;

        /* renamed from: i */
        final /* synthetic */ long f12537i;

        /* renamed from: j */
        final /* synthetic */ String f12538j;

        /* renamed from: k */
        final /* synthetic */ Throwable f12539k;

        /* renamed from: l */
        final /* synthetic */ Map f12540l;

        public C6734j(C6724a aVar, String str, long j, String str2, Throwable th, Map map) {
            this.f12536h = str;
            this.f12537i = j;
            this.f12538j = str2;
            this.f12539k = th;
            this.f12540l = map;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6812e7.m14513a().f12701f.mo23546a(this.f12536h, this.f12537i, this.f12538j, this.f12539k.getClass().getName(), this.f12539k, C6959o7.m14778a(), this.f12540l);
        }
    }

    public C6724a() {
        super("FlurryAgentImpl", C6868i2.m14604a(C6868i2.C6870b.PUBLIC_API));
        new ArrayList();
    }

    /* renamed from: a */
    public static C6724a m14355a() {
        if (f12516p == null) {
            f12516p = new C6724a();
        }
        return f12516p;
    }

    /* renamed from: d */
    public static boolean m14356d() {
        return f12515o.get();
    }

    /* renamed from: a */
    public final void mo23530a(Context context) {
        if (context instanceof Activity) {
            C6792d1.m14478a("FlurryAgentImpl", "Activity's session is controlled by Flurry SDK");
        } else if (!f12515o.get()) {
            C6792d1.m14487d("FlurryAgentImpl", "Invalid call to onStartSession. Flurry is not initialized");
        } else {
            mo23563c(new C6730f(this));
        }
    }

    /* renamed from: a */
    public final C10565d mo23527a(String str, C7051v3.C7052a aVar, Map<String, String> map) {
        if (!C6766c2.m14421a(16)) {
            return C10565d.kFlurryEventFailed;
        }
        return mo23528a(str, aVar, map, false, false);
    }

    /* renamed from: a */
    public final C10565d mo23529a(String str, Map<String, String> map, boolean z, boolean z2) {
        return mo23528a(str, C7051v3.C7052a.CUSTOM, map, z, z2);
    }

    /* renamed from: a */
    public final C10565d mo23528a(String str, C7051v3.C7052a aVar, Map<String, String> map, boolean z, boolean z2) {
        C10565d dVar;
        Map<String, String> map2 = map;
        if (!f12515o.get()) {
            C6792d1.m14487d("FlurryAgentImpl", "Invalid call to logEvent. Flurry is not initialized");
            return null;
        } else if (C6766c2.m14416a(str).length() == 0) {
            return C10565d.kFlurryEventFailed;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashMap hashMap = new HashMap();
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            if (hashMap.size() > 10) {
                dVar = C10565d.kFlurryEventParamsCountExceeded;
            } else {
                dVar = C10565d.kFlurryEventRecorded;
            }
            mo23563c(new C6733i(this, str, aVar, hashMap, z, z2, currentTimeMillis, elapsedRealtime));
            return dVar;
        }
    }
}

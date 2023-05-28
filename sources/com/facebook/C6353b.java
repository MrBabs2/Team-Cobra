package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C6368h;
import com.facebook.GraphRequest;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.notification.PullingContentService;
import p050l.p097m.p098a.C5133a;

/* renamed from: com.facebook.b */
/* compiled from: AccessTokenManager */
public final class C6353b {

    /* renamed from: f */
    private static volatile C6353b f11672f;

    /* renamed from: a */
    private final C5133a f11673a;

    /* renamed from: b */
    private final C6351a f11674b;

    /* renamed from: c */
    private AccessToken f11675c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AtomicBoolean f11676d = new AtomicBoolean(false);

    /* renamed from: e */
    private Date f11677e = new Date(0);

    /* renamed from: com.facebook.b$a */
    /* compiled from: AccessTokenManager */
    class C6354a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AccessToken.C6331b f11678f;

        C6354a(AccessToken.C6331b bVar) {
            this.f11678f = bVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6353b.this.m13172b(this.f11678f);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.b$b */
    /* compiled from: AccessTokenManager */
    class C6355b implements GraphRequest.C6344f {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f11680a;

        /* renamed from: b */
        final /* synthetic */ Set f11681b;

        /* renamed from: c */
        final /* synthetic */ Set f11682c;

        /* renamed from: d */
        final /* synthetic */ Set f11683d;

        C6355b(C6353b bVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f11680a = atomicBoolean;
            this.f11681b = set;
            this.f11682c = set2;
            this.f11683d = set3;
        }

        public void onCompleted(C6371i iVar) {
            JSONArray optJSONArray;
            JSONObject b = iVar.mo20919b();
            if (b != null && (optJSONArray = b.optJSONArray("data")) != null) {
                this.f11680a.set(true);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString("status");
                        if (!C6476x.m13533d(optString) && !C6476x.m13533d(optString2)) {
                            String lowerCase = optString2.toLowerCase(Locale.US);
                            if (lowerCase.equals("granted")) {
                                this.f11681b.add(optString);
                            } else if (lowerCase.equals("declined")) {
                                this.f11682c.add(optString);
                            } else if (lowerCase.equals("expired")) {
                                this.f11683d.add(optString);
                            } else {
                                Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.b$c */
    /* compiled from: AccessTokenManager */
    class C6356c implements GraphRequest.C6344f {

        /* renamed from: a */
        final /* synthetic */ C6358e f11684a;

        C6356c(C6353b bVar, C6358e eVar) {
            this.f11684a = eVar;
        }

        public void onCompleted(C6371i iVar) {
            JSONObject b = iVar.mo20919b();
            if (b != null) {
                this.f11684a.f11693a = b.optString("access_token");
                this.f11684a.f11694b = b.optInt("expires_at");
                this.f11684a.f11695c = Long.valueOf(b.optLong("data_access_expiration_time"));
                this.f11684a.f11696d = b.optString("graph_domain", (String) null);
            }
        }
    }

    /* renamed from: com.facebook.b$d */
    /* compiled from: AccessTokenManager */
    class C6357d implements C6368h.C6369a {

        /* renamed from: a */
        final /* synthetic */ AccessToken f11685a;

        /* renamed from: b */
        final /* synthetic */ AccessToken.C6331b f11686b;

        /* renamed from: c */
        final /* synthetic */ AtomicBoolean f11687c;

        /* renamed from: d */
        final /* synthetic */ C6358e f11688d;

        /* renamed from: e */
        final /* synthetic */ Set f11689e;

        /* renamed from: f */
        final /* synthetic */ Set f11690f;

        /* renamed from: g */
        final /* synthetic */ Set f11691g;

        C6357d(AccessToken accessToken, AccessToken.C6331b bVar, AtomicBoolean atomicBoolean, C6358e eVar, Set set, Set set2, Set set3) {
            this.f11685a = accessToken;
            this.f11686b = bVar;
            this.f11687c = atomicBoolean;
            this.f11688d = eVar;
            this.f11689e = set;
            this.f11690f = set2;
            this.f11691g = set3;
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0053=Splitter:B:18:0x0053, B:50:0x0113=Splitter:B:50:0x0113} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo20886a(com.facebook.C6368h r19) {
            /*
                r18 = this;
                r1 = r18
                r2 = 0
                com.facebook.b r0 = com.facebook.C6353b.m13173e()     // Catch:{ all -> 0x012f }
                com.facebook.AccessToken r0 = r0.mo20883c()     // Catch:{ all -> 0x012f }
                if (r0 == 0) goto L_0x0113
                com.facebook.b r0 = com.facebook.C6353b.m13173e()     // Catch:{ all -> 0x012f }
                com.facebook.AccessToken r0 = r0.mo20883c()     // Catch:{ all -> 0x012f }
                java.lang.String r0 = r0.mo20789n()     // Catch:{ all -> 0x012f }
                com.facebook.AccessToken r4 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.lang.String r4 = r4.mo20789n()     // Catch:{ all -> 0x012f }
                if (r0 == r4) goto L_0x0023
                goto L_0x0113
            L_0x0023:
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f11687c     // Catch:{ all -> 0x012f }
                boolean r0 = r0.get()     // Catch:{ all -> 0x012f }
                if (r0 != 0) goto L_0x0053
                com.facebook.b$e r0 = r1.f11688d     // Catch:{ all -> 0x012f }
                java.lang.String r0 = r0.f11693a     // Catch:{ all -> 0x012f }
                if (r0 != 0) goto L_0x0053
                com.facebook.b$e r0 = r1.f11688d     // Catch:{ all -> 0x012f }
                int r0 = r0.f11694b     // Catch:{ all -> 0x012f }
                if (r0 != 0) goto L_0x0053
                com.facebook.AccessToken$b r0 = r1.f11686b     // Catch:{ all -> 0x012f }
                if (r0 == 0) goto L_0x0047
                com.facebook.AccessToken$b r0 = r1.f11686b     // Catch:{ all -> 0x012f }
                com.facebook.FacebookException r4 = new com.facebook.FacebookException     // Catch:{ all -> 0x012f }
                java.lang.String r5 = "Failed to refresh access token"
                r4.<init>((java.lang.String) r5)     // Catch:{ all -> 0x012f }
                r0.mo20797a((com.facebook.FacebookException) r4)     // Catch:{ all -> 0x012f }
            L_0x0047:
                com.facebook.b r0 = com.facebook.C6353b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f11676d
                r0.set(r2)
                com.facebook.AccessToken$b r0 = r1.f11686b
                return
            L_0x0053:
                com.facebook.AccessToken r15 = new com.facebook.AccessToken     // Catch:{ all -> 0x012f }
                com.facebook.b$e r0 = r1.f11688d     // Catch:{ all -> 0x012f }
                java.lang.String r0 = r0.f11693a     // Catch:{ all -> 0x012f }
                if (r0 == 0) goto L_0x0060
                com.facebook.b$e r0 = r1.f11688d     // Catch:{ all -> 0x012f }
                java.lang.String r0 = r0.f11693a     // Catch:{ all -> 0x012f }
                goto L_0x0066
            L_0x0060:
                com.facebook.AccessToken r0 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.lang.String r0 = r0.mo20788k()     // Catch:{ all -> 0x012f }
            L_0x0066:
                r5 = r0
                com.facebook.AccessToken r0 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.lang.String r6 = r0.mo20776a()     // Catch:{ all -> 0x012f }
                com.facebook.AccessToken r0 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.lang.String r7 = r0.mo20789n()     // Catch:{ all -> 0x012f }
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f11687c     // Catch:{ all -> 0x012f }
                boolean r0 = r0.get()     // Catch:{ all -> 0x012f }
                if (r0 == 0) goto L_0x007e
                java.util.Set r0 = r1.f11689e     // Catch:{ all -> 0x012f }
                goto L_0x0084
            L_0x007e:
                com.facebook.AccessToken r0 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.util.Set r0 = r0.mo20785h()     // Catch:{ all -> 0x012f }
            L_0x0084:
                r8 = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f11687c     // Catch:{ all -> 0x012f }
                boolean r0 = r0.get()     // Catch:{ all -> 0x012f }
                if (r0 == 0) goto L_0x0090
                java.util.Set r0 = r1.f11690f     // Catch:{ all -> 0x012f }
                goto L_0x0096
            L_0x0090:
                com.facebook.AccessToken r0 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.util.Set r0 = r0.mo20778c()     // Catch:{ all -> 0x012f }
            L_0x0096:
                r9 = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f11687c     // Catch:{ all -> 0x012f }
                boolean r0 = r0.get()     // Catch:{ all -> 0x012f }
                if (r0 == 0) goto L_0x00a2
                java.util.Set r0 = r1.f11691g     // Catch:{ all -> 0x012f }
                goto L_0x00a8
            L_0x00a2:
                com.facebook.AccessToken r0 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.util.Set r0 = r0.mo20779d()     // Catch:{ all -> 0x012f }
            L_0x00a8:
                r10 = r0
                com.facebook.AccessToken r0 = r1.f11685a     // Catch:{ all -> 0x012f }
                com.facebook.c r11 = r0.mo20787j()     // Catch:{ all -> 0x012f }
                com.facebook.b$e r0 = r1.f11688d     // Catch:{ all -> 0x012f }
                int r0 = r0.f11694b     // Catch:{ all -> 0x012f }
                r12 = 1000(0x3e8, double:4.94E-321)
                if (r0 == 0) goto L_0x00c4
                java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x012f }
                com.facebook.b$e r4 = r1.f11688d     // Catch:{ all -> 0x012f }
                int r4 = r4.f11694b     // Catch:{ all -> 0x012f }
                long r3 = (long) r4     // Catch:{ all -> 0x012f }
                long r3 = r3 * r12
                r0.<init>(r3)     // Catch:{ all -> 0x012f }
                goto L_0x00ca
            L_0x00c4:
                com.facebook.AccessToken r0 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.util.Date r0 = r0.mo20781e()     // Catch:{ all -> 0x012f }
            L_0x00ca:
                java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x012f }
                r3.<init>()     // Catch:{ all -> 0x012f }
                com.facebook.b$e r4 = r1.f11688d     // Catch:{ all -> 0x012f }
                java.lang.Long r4 = r4.f11695c     // Catch:{ all -> 0x012f }
                if (r4 == 0) goto L_0x00e5
                java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x012f }
                com.facebook.b$e r14 = r1.f11688d     // Catch:{ all -> 0x012f }
                java.lang.Long r14 = r14.f11695c     // Catch:{ all -> 0x012f }
                long r16 = r14.longValue()     // Catch:{ all -> 0x012f }
                long r12 = r12 * r16
                r4.<init>(r12)     // Catch:{ all -> 0x012f }
                goto L_0x00eb
            L_0x00e5:
                com.facebook.AccessToken r4 = r1.f11685a     // Catch:{ all -> 0x012f }
                java.util.Date r4 = r4.mo20777b()     // Catch:{ all -> 0x012f }
            L_0x00eb:
                r14 = r4
                com.facebook.b$e r4 = r1.f11688d     // Catch:{ all -> 0x012f }
                java.lang.String r13 = r4.f11696d     // Catch:{ all -> 0x012f }
                r4 = r15
                r12 = r0
                r0 = r13
                r13 = r3
                r3 = r15
                r15 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x012f }
                com.facebook.b r0 = com.facebook.C6353b.m13173e()     // Catch:{ all -> 0x0111 }
                r0.mo20881a((com.facebook.AccessToken) r3)     // Catch:{ all -> 0x0111 }
                com.facebook.b r0 = com.facebook.C6353b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f11676d
                r0.set(r2)
                com.facebook.AccessToken$b r0 = r1.f11686b
                if (r0 == 0) goto L_0x0110
                r0.mo20796a((com.facebook.AccessToken) r3)
            L_0x0110:
                return
            L_0x0111:
                r0 = move-exception
                goto L_0x0131
            L_0x0113:
                com.facebook.AccessToken$b r0 = r1.f11686b     // Catch:{ all -> 0x012f }
                if (r0 == 0) goto L_0x0123
                com.facebook.AccessToken$b r0 = r1.f11686b     // Catch:{ all -> 0x012f }
                com.facebook.FacebookException r3 = new com.facebook.FacebookException     // Catch:{ all -> 0x012f }
                java.lang.String r4 = "No current access token to refresh"
                r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x012f }
                r0.mo20797a((com.facebook.FacebookException) r3)     // Catch:{ all -> 0x012f }
            L_0x0123:
                com.facebook.b r0 = com.facebook.C6353b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f11676d
                r0.set(r2)
                com.facebook.AccessToken$b r0 = r1.f11686b
                return
            L_0x012f:
                r0 = move-exception
                r3 = 0
            L_0x0131:
                com.facebook.b r4 = com.facebook.C6353b.this
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f11676d
                r4.set(r2)
                com.facebook.AccessToken$b r2 = r1.f11686b
                if (r2 == 0) goto L_0x0143
                if (r3 == 0) goto L_0x0143
                r2.mo20796a((com.facebook.AccessToken) r3)
            L_0x0143:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C6353b.C6357d.mo20886a(com.facebook.h):void");
        }
    }

    /* renamed from: com.facebook.b$e */
    /* compiled from: AccessTokenManager */
    private static class C6358e {

        /* renamed from: a */
        public String f11693a;

        /* renamed from: b */
        public int f11694b;

        /* renamed from: c */
        public Long f11695c;

        /* renamed from: d */
        public String f11696d;

        private C6358e() {
        }

        /* synthetic */ C6358e(C6354a aVar) {
            this();
        }
    }

    C6353b(C5133a aVar, C6351a aVar2) {
        C6481y.m13556a((Object) aVar, "localBroadcastManager");
        C6481y.m13556a((Object) aVar2, "accessTokenCache");
        this.f11673a = aVar;
        this.f11674b = aVar2;
    }

    /* renamed from: e */
    static C6353b m13173e() {
        if (f11672f == null) {
            synchronized (C6353b.class) {
                if (f11672f == null) {
                    f11672f = new C6353b(C5133a.m9478a(C4716f.m7696e()), new C6351a());
                }
            }
        }
        return f11672f;
    }

    /* renamed from: f */
    private void m13174f() {
        Context e = C4716f.m7696e();
        AccessToken r = AccessToken.m13036r();
        AlarmManager alarmManager = (AlarmManager) e.getSystemService("alarm");
        if (AccessToken.m13037s() && r.mo20781e() != null && alarmManager != null) {
            Intent intent = new Intent(e, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, r.mo20781e().getTime(), PendingIntent.getBroadcast(e, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    private boolean m13175g() {
        if (this.f11675c == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (!this.f11675c.mo20787j().mo20887a() || valueOf.longValue() - this.f11677e.getTime() <= 3600000 || valueOf.longValue() - this.f11675c.mo20784g().getTime() <= PullingContentService.UPDATES_INTERVAL) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo20882b() {
        if (m13175g()) {
            mo20880a((AccessToken.C6331b) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AccessToken mo20883c() {
        return this.f11675c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo20884d() {
        AccessToken b = this.f11674b.mo20877b();
        if (b == null) {
            return false;
        }
        m13169a(b, false);
        return true;
    }

    /* renamed from: b */
    private static GraphRequest m13171b(AccessToken accessToken, GraphRequest.C6344f fVar) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), C6492j.GET, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20881a(AccessToken accessToken) {
        m13169a(accessToken, true);
    }

    /* renamed from: a */
    private void m13169a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f11675c;
        this.f11675c = accessToken;
        this.f11676d.set(false);
        this.f11677e = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f11674b.mo20876a(accessToken);
            } else {
                this.f11674b.mo20875a();
                C6476x.m13499a(C4716f.m7696e());
            }
        }
        if (!C6476x.m13515a(accessToken2, accessToken)) {
            m13168a(accessToken2, accessToken);
            m13174f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13172b(AccessToken.C6331b bVar) {
        AccessToken.C6331b bVar2 = bVar;
        AccessToken accessToken = this.f11675c;
        if (accessToken == null) {
            if (bVar2 != null) {
                bVar2.mo20797a(new FacebookException("No current access token to refresh"));
            }
        } else if (this.f11676d.compareAndSet(false, true)) {
            this.f11677e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C6358e eVar = new C6358e((C6354a) null);
            C6355b bVar3 = r0;
            HashSet hashSet4 = hashSet2;
            C6355b bVar4 = new C6355b(this, atomicBoolean, hashSet, hashSet2, hashSet3);
            C6368h hVar = new C6368h(m13171b(accessToken, bVar3), m13166a(accessToken, (GraphRequest.C6344f) new C6356c(this, eVar)));
            hVar.mo20898a((C6368h.C6369a) new C6357d(accessToken, bVar, atomicBoolean, eVar, hashSet, hashSet4, hashSet3));
            hVar.mo20904c();
        } else if (bVar2 != null) {
            bVar2.mo20797a(new FacebookException("Refresh already in progress"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20879a() {
        AccessToken accessToken = this.f11675c;
        m13168a(accessToken, accessToken);
    }

    /* renamed from: a */
    private void m13168a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C4716f.m7696e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f11673a.mo17802a(intent);
    }

    /* renamed from: a */
    private static GraphRequest m13166a(AccessToken accessToken, GraphRequest.C6344f fVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        bundle.putString("client_id", accessToken.mo20776a());
        return new GraphRequest(accessToken, "oauth/access_token", bundle, C6492j.GET, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20880a(AccessToken.C6331b bVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            m13172b(bVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C6354a(bVar));
        }
    }
}

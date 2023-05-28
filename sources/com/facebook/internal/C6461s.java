package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C4716f;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.login.C6520b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p015cm.aptoide.p016pt.account.view.LoginActivity;

/* renamed from: com.facebook.internal.s */
/* compiled from: NativeProtocol */
public final class C6461s {

    /* renamed from: a */
    private static final String f11895a = "com.facebook.internal.s";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<C6467f> f11896b = m13441e();

    /* renamed from: c */
    private static final List<C6467f> f11897c = m13440d();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final AtomicBoolean f11898d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final List<Integer> f11899e = Arrays.asList(new Integer[]{20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101});

    /* renamed from: com.facebook.internal.s$a */
    /* compiled from: NativeProtocol */
    static class C6462a implements Runnable {
        C6462a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    for (C6467f a : C6461s.f11896b) {
                        a.m13453a(true);
                    }
                    C6461s.f11898d.set(false);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.s$b */
    /* compiled from: NativeProtocol */
    private static class C6463b extends C6467f {
        private C6463b() {
            super((C6462a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo21016b() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo21017c() {
            return "com.facebook.arstudio.player";
        }

        /* synthetic */ C6463b(C6462a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.s$c */
    /* compiled from: NativeProtocol */
    private static class C6464c extends C6467f {
        private C6464c() {
            super((C6462a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo21016b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo21017c() {
            return "com.facebook.lite";
        }

        /* synthetic */ C6464c(C6462a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.s$d */
    /* compiled from: NativeProtocol */
    private static class C6465d extends C6467f {
        private C6465d() {
            super((C6462a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo21016b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo21017c() {
            return "com.facebook.katana";
        }

        /* synthetic */ C6465d(C6462a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.s$e */
    /* compiled from: NativeProtocol */
    private static class C6466e extends C6467f {
        private C6466e() {
            super((C6462a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo21016b() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo21017c() {
            return "com.facebook.orca";
        }

        /* synthetic */ C6466e(C6462a aVar) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.s$f */
    /* compiled from: NativeProtocol */
    private static abstract class C6467f {

        /* renamed from: a */
        private TreeSet<Integer> f11900a;

        private C6467f() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo21016b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract String mo21017c();

        /* synthetic */ C6467f(C6462a aVar) {
            this();
        }

        /* renamed from: a */
        public TreeSet<Integer> mo21018a() {
            TreeSet<Integer> treeSet = this.f11900a;
            if (treeSet == null || treeSet.isEmpty()) {
                m13453a(false);
            }
            return this.f11900a;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            if (r0.f11900a.isEmpty() == false) goto L_0x0015;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void m13453a(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L_0x000f
                java.util.TreeSet<java.lang.Integer> r1 = r0.f11900a     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x000f
                java.util.TreeSet<java.lang.Integer> r1 = r0.f11900a     // Catch:{ all -> 0x0017 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x0015
            L_0x000f:
                java.util.TreeSet r1 = com.facebook.internal.C6461s.m13439c((com.facebook.internal.C6461s.C6467f) r0)     // Catch:{ all -> 0x0017 }
                r0.f11900a = r1     // Catch:{ all -> 0x0017 }
            L_0x0015:
                monitor-exit(r0)
                return
            L_0x0017:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6461s.C6467f.m13453a(boolean):void");
        }
    }

    /* renamed from: com.facebook.internal.s$h */
    /* compiled from: NativeProtocol */
    private static class C6469h extends C6467f {
        private C6469h() {
            super((C6462a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo21016b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo21017c() {
            return "com.facebook.wakizashi";
        }

        /* synthetic */ C6469h(C6462a aVar) {
            this();
        }
    }

    static {
        m13438c();
    }

    /* renamed from: c */
    private static Map<String, List<C6467f>> m13438c() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6466e((C6462a) null));
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f11896b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f11896b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f11896b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f11896b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f11897c);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", f11896b);
        return hashMap;
    }

    /* renamed from: d */
    private static List<C6467f> m13440d() {
        ArrayList arrayList = new ArrayList(m13441e());
        arrayList.add(0, new C6463b((C6462a) null));
        return arrayList;
    }

    /* renamed from: e */
    private static List<C6467f> m13441e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6465d((C6462a) null));
        arrayList.add(new C6469h((C6462a) null));
        return arrayList;
    }

    /* renamed from: f */
    public static final int m13442f() {
        return f11899e.get(0).intValue();
    }

    /* renamed from: g */
    public static void m13443g() {
        if (f11898d.compareAndSet(false, true)) {
            C4716f.m7704m().execute(new C6462a());
        }
    }

    /* renamed from: com.facebook.internal.s$g */
    /* compiled from: NativeProtocol */
    public static class C6468g {

        /* renamed from: a */
        private int f11901a;

        private C6468g() {
        }

        /* renamed from: a */
        public static C6468g m13457a(C6467f fVar, int i) {
            C6468g gVar = new C6468g();
            gVar.f11901a = i;
            return gVar;
        }

        /* renamed from: b */
        public static C6468g m13458b() {
            C6468g gVar = new C6468g();
            gVar.f11901a = -1;
            return gVar;
        }

        /* renamed from: a */
        public int mo21019a() {
            return this.f11901a;
        }
    }

    /* renamed from: b */
    static Intent m13432b(Context context, Intent intent, C6467f fVar) {
        ResolveInfo resolveService;
        if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null || !C6434i.m13332a(context, resolveService.serviceInfo.packageName)) {
            return null;
        }
        return intent;
    }

    /* renamed from: a */
    static Intent m13421a(Context context, Intent intent, C6467f fVar) {
        ResolveInfo resolveActivity;
        if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null || !C6434i.m13332a(context, resolveActivity.activityInfo.packageName)) {
            return null;
        }
        return intent;
    }

    /* renamed from: b */
    public static boolean m13436b(int i) {
        return f11899e.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: a */
    public static Intent m13422a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C6520b bVar, String str3, String str4) {
        C6464c cVar = new C6464c((C6462a) null);
        Context context2 = context;
        return m13421a(context, m13425a((C6467f) cVar, str, collection, str2, z, z2, bVar, str3, str4, false), (C6467f) cVar);
    }

    /* renamed from: b */
    public static Bundle m13434b(Intent intent) {
        if (!m13436b(m13437c(intent))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: a */
    private static Intent m13425a(C6467f fVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, C6520b bVar, String str3, String str4, boolean z3) {
        String b = fVar.mo21016b();
        if (b == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(fVar.mo21017c(), b).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", C4716f.m7710s());
        if (!C6476x.m13516a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C6476x.m13533d(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request,graph_domain");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", bVar.mo21193a());
        }
        putExtra.putExtra("legacy_override", C4716f.m7706o());
        putExtra.putExtra(LoginActivity.AUTH_TYPE, str4);
        if (z3) {
            putExtra.putExtra("fail_on_logged_out", true);
        }
        return putExtra;
    }

    /* renamed from: b */
    private static Uri m13433b(C6467f fVar) {
        return Uri.parse("content://" + fVar.mo21017c() + ".provider.PlatformProvider/versions");
    }

    /* renamed from: c */
    public static int m13437c(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        android.util.Log.e(f11895a, "Failed to query content resolver.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0052 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.TreeSet<java.lang.Integer> m13439c(com.facebook.internal.C6461s.C6467f r10) {
        /*
            java.lang.String r0 = "Failed to query content resolver."
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            android.content.Context r2 = com.facebook.C4716f.m7696e()
            android.content.ContentResolver r3 = r2.getContentResolver()
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r2 = "version"
            r4 = 0
            r5[r4] = r2
            android.net.Uri r6 = m13433b((com.facebook.internal.C6461s.C6467f) r10)
            r9 = 0
            android.content.Context r7 = com.facebook.C4716f.m7696e()     // Catch:{ all -> 0x0075 }
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r8.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.String r10 = r10.mo21017c()     // Catch:{ all -> 0x0075 }
            r8.append(r10)     // Catch:{ all -> 0x0075 }
            java.lang.String r10 = ".provider.PlatformProvider"
            r8.append(r10)     // Catch:{ all -> 0x0075 }
            java.lang.String r10 = r8.toString()     // Catch:{ all -> 0x0075 }
            android.content.pm.ProviderInfo r10 = r7.resolveContentProvider(r10, r4)     // Catch:{ RuntimeException -> 0x003e }
            goto L_0x0045
        L_0x003e:
            r10 = move-exception
            java.lang.String r4 = f11895a     // Catch:{ all -> 0x0075 }
            android.util.Log.e(r4, r0, r10)     // Catch:{ all -> 0x0075 }
            r10 = r9
        L_0x0045:
            if (r10 == 0) goto L_0x006f
            r10 = 0
            r7 = 0
            r8 = 0
            r4 = r6
            r6 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x0052 }
            r9 = r10
            goto L_0x0057
        L_0x0052:
            java.lang.String r10 = f11895a     // Catch:{ all -> 0x0075 }
            android.util.Log.e(r10, r0)     // Catch:{ all -> 0x0075 }
        L_0x0057:
            if (r9 == 0) goto L_0x006f
        L_0x0059:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r10 == 0) goto L_0x006f
            int r10 = r9.getColumnIndex(r2)     // Catch:{ all -> 0x0075 }
            int r10 = r9.getInt(r10)     // Catch:{ all -> 0x0075 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0075 }
            r1.add(r10)     // Catch:{ all -> 0x0075 }
            goto L_0x0059
        L_0x006f:
            if (r9 == 0) goto L_0x0074
            r9.close()
        L_0x0074:
            return r1
        L_0x0075:
            r10 = move-exception
            if (r9 == 0) goto L_0x007b
            r9.close()
        L_0x007b:
            goto L_0x007d
        L_0x007c:
            throw r10
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6461s.m13439c(com.facebook.internal.s$f):java.util.TreeSet");
    }

    /* renamed from: a */
    public static Intent m13423a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C6520b bVar, String str3, String str4, boolean z3) {
        for (C6467f next : f11896b) {
            Context context2 = context;
            Intent a = m13421a(context, m13425a(next, str, collection, str2, z, z2, bVar, str3, str4, z3), next);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Intent m13424a(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID a = m13430a(intent);
        if (a == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m13437c(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", a.toString());
        if (facebookException != null) {
            bundle2.putBundle("error", m13426a(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: a */
    public static Intent m13420a(Context context) {
        for (C6467f next : f11896b) {
            Intent b = m13432b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(next.mo21017c()).addCategory("android.intent.category.DEFAULT"), next);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static UUID m13430a(Intent intent) {
        String str;
        if (intent == null) {
            return null;
        }
        if (m13436b(m13437c(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str == null) {
            return null;
        }
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static FacebookException m13427a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new FacebookException(string2);
        }
        return new FacebookOperationCanceledException(string2);
    }

    /* renamed from: a */
    public static Bundle m13426a(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: a */
    public static int m13418a(int i) {
        return m13428a(f11896b, new int[]{i}).mo21019a();
    }

    /* renamed from: a */
    private static C6468g m13428a(List<C6467f> list, int[] iArr) {
        m13443g();
        if (list == null) {
            return C6468g.m13458b();
        }
        for (C6467f next : list) {
            int a = m13419a(next.mo21018a(), m13442f(), iArr);
            if (a != -1) {
                return C6468g.m13457a(next, a);
            }
        }
        return C6468g.m13458b();
    }

    /* renamed from: a */
    public static int m13419a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        int i2 = -1;
        while (descendingIterator.hasNext()) {
            int intValue = descendingIterator.next().intValue();
            i2 = Math.max(i2, intValue);
            while (length >= 0 && iArr[length] > intValue) {
                length--;
            }
            if (length < 0) {
                return -1;
            }
            if (iArr[length] == intValue) {
                if (length % 2 == 0) {
                    return Math.min(i2, i);
                }
                return -1;
            }
        }
        return -1;
    }
}

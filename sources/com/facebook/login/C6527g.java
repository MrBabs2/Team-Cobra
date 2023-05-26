package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6365d;
import com.facebook.C6366e;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.C6422d;
import com.facebook.internal.C6426f;
import com.facebook.internal.C6481y;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import okhttp3.internal.cache.DiskLruCache;
import p050l.p063c.p064b.C4850b;

/* renamed from: com.facebook.login.g */
/* compiled from: LoginManager */
public class C6527g {

    /* renamed from: e */
    private static final Set<String> f12099e = m13807c();

    /* renamed from: f */
    private static volatile C6527g f12100f;

    /* renamed from: a */
    private C6522d f12101a = C6522d.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    private C6520b f12102b = C6520b.FRIENDS;

    /* renamed from: c */
    private final SharedPreferences f12103c;

    /* renamed from: d */
    private String f12104d = "rerequest";

    /* renamed from: com.facebook.login.g$a */
    /* compiled from: LoginManager */
    class C6528a implements C6422d.C6423a {

        /* renamed from: a */
        final /* synthetic */ C6366e f12105a;

        C6528a(C6366e eVar) {
            this.f12105a = eVar;
        }

        /* renamed from: a */
        public boolean mo20972a(int i, Intent intent) {
            return C6527g.this.mo21217a(i, intent, this.f12105a);
        }
    }

    /* renamed from: com.facebook.login.g$b */
    /* compiled from: LoginManager */
    static class C6529b extends HashSet<String> {
        C6529b() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    /* renamed from: com.facebook.login.g$c */
    /* compiled from: LoginManager */
    class C6530c implements C6422d.C6423a {
        C6530c() {
        }

        /* renamed from: a */
        public boolean mo20972a(int i, Intent intent) {
            return C6527g.this.mo21216a(i, intent);
        }
    }

    /* renamed from: com.facebook.login.g$d */
    /* compiled from: LoginManager */
    private static class C6531d implements C6534i {

        /* renamed from: a */
        private final Activity f12108a;

        C6531d(Activity activity) {
            C6481y.m13556a((Object) activity, "activity");
            this.f12108a = activity;
        }

        /* renamed from: a */
        public Activity mo21219a() {
            return this.f12108a;
        }

        public void startActivityForResult(Intent intent, int i) {
            this.f12108a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.g$e */
    /* compiled from: LoginManager */
    private static class C6532e {

        /* renamed from: a */
        private static C6526f f12109a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static synchronized C6526f m13820b(Context context) {
            synchronized (C6532e.class) {
                if (context == null) {
                    context = C4716f.m7696e();
                }
                if (context == null) {
                    return null;
                }
                if (f12109a == null) {
                    f12109a = new C6526f(context, C4716f.m7697f());
                }
                C6526f fVar = f12109a;
                return fVar;
            }
        }
    }

    C6527g() {
        C6481y.m13563c();
        this.f12103c = C4716f.m7696e().getSharedPreferences("com.facebook.loginManager", 0);
        if (C4716f.f8009p && C6426f.m13316a() != null) {
            C4850b.m8136a(C4716f.m7696e(), "com.android.chrome", new C6519a());
            C4850b.m8135a(C4716f.m7696e(), C4716f.m7696e().getPackageName());
        }
    }

    /* renamed from: b */
    public static C6527g m13804b() {
        if (f12100f == null) {
            synchronized (C6527g.class) {
                if (f12100f == null) {
                    f12100f = new C6527g();
                }
            }
        }
        return f12100f;
    }

    /* renamed from: c */
    private static Set<String> m13807c() {
        return Collections.unmodifiableSet(new C6529b());
    }

    /* renamed from: a */
    public void mo21215a(C6365d dVar, C6366e<C6533h> eVar) {
        if (dVar instanceof C6422d) {
            ((C6422d) dVar).mo20971a(C6422d.C6424b.Login.mo20973a(), new C6528a(eVar));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21216a(int i, Intent intent) {
        return mo21217a(i, intent, (C6366e<C6533h>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21217a(int i, Intent intent, C6366e<C6533h> eVar) {
        boolean z;
        Map<String, String> map;
        LoginClient.Result.C6512b bVar;
        LoginClient.Request request;
        AccessToken accessToken;
        boolean z2;
        LoginClient.Request request2;
        Map<String, String> map2;
        int i2 = i;
        Intent intent2 = intent;
        LoginClient.Result.C6512b bVar2 = LoginClient.Result.C6512b.ERROR;
        FacebookException facebookException = null;
        boolean z3 = false;
        if (intent2 != null) {
            LoginClient.Result result = (LoginClient.Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request3 = result.f12050j;
                LoginClient.Result.C6512b bVar3 = result.f12046f;
                if (i2 == -1) {
                    if (bVar3 == LoginClient.Result.C6512b.SUCCESS) {
                        accessToken = result.f12047g;
                    } else {
                        facebookException = new FacebookAuthorizationException(result.f12048h);
                        accessToken = null;
                    }
                } else if (i2 == 0) {
                    accessToken = null;
                    z3 = true;
                } else {
                    accessToken = null;
                }
                map2 = result.f12051k;
                boolean z4 = z3;
                request2 = request3;
                bVar2 = bVar3;
                z2 = z4;
            } else {
                accessToken = null;
                map2 = null;
                request2 = null;
                z2 = false;
            }
            map = map2;
            bVar = bVar2;
            request = request2;
            z = z2;
        } else if (i2 == 0) {
            bVar = LoginClient.Result.C6512b.CANCEL;
            accessToken = null;
            request = null;
            map = null;
            z = true;
        } else {
            bVar = bVar2;
            accessToken = null;
            request = null;
            map = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        m13798a((Context) null, bVar, map, facebookException, true, request);
        m13799a(accessToken, request, facebookException, z, eVar);
        return true;
    }

    /* renamed from: b */
    public void mo21218b(Activity activity, Collection<String> collection) {
        m13805b(collection);
        mo21214a(activity, collection);
    }

    /* renamed from: b */
    private void m13805b(Collection<String> collection) {
        if (collection != null) {
            for (String next : collection) {
                if (m13803a(next)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{next}));
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m13806b(C6534i iVar, LoginClient.Request request) {
        Intent a = mo21211a(request);
        if (!m13802a(a)) {
            return false;
        }
        try {
            iVar.startActivityForResult(a, LoginClient.m13684r());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo21213a() {
        AccessToken.m13034b((AccessToken) null);
        Profile.m13150a((Profile) null);
        m13801a(false);
    }

    /* renamed from: a */
    public void mo21214a(Activity activity, Collection<String> collection) {
        m13800a((C6534i) new C6531d(activity), mo21212a(collection));
    }

    /* renamed from: a */
    static boolean m13803a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f12099e.contains(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LoginClient.Request mo21212a(Collection<String> collection) {
        HashSet hashSet;
        C6522d dVar = this.f12101a;
        if (collection == null) {
            hashSet = new HashSet();
        }
        LoginClient.Request request = new LoginClient.Request(dVar, Collections.unmodifiableSet(hashSet), this.f12102b, this.f12104d, C4716f.m7697f(), UUID.randomUUID().toString());
        request.mo21151a(AccessToken.m13037s());
        return request;
    }

    /* renamed from: a */
    private void m13800a(C6534i iVar, LoginClient.Request request) throws FacebookException {
        m13797a((Context) iVar.mo21219a(), request);
        C6422d.m13310b(C6422d.C6424b.Login.mo20973a(), new C6530c());
        if (!m13806b(iVar, request)) {
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m13798a(iVar.mo21219a(), LoginClient.Result.C6512b.ERROR, (Map<String, String>) null, facebookException, false, request);
            throw facebookException;
        }
    }

    /* renamed from: a */
    private void m13797a(Context context, LoginClient.Request request) {
        C6526f a = C6532e.m13820b(context);
        if (a != null && request != null) {
            a.mo21204a(request);
        }
    }

    /* renamed from: a */
    private void m13798a(Context context, LoginClient.Result.C6512b bVar, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        C6526f a = C6532e.m13820b(context);
        if (a != null) {
            if (request == null) {
                a.mo21210c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("try_login_activity", z ? DiskLruCache.VERSION_1 : "0");
            a.mo21208a(request.mo21152b(), hashMap, bVar, map, exc);
        }
    }

    /* renamed from: a */
    private boolean m13802a(Intent intent) {
        return C4716f.m7696e().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo21211a(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(C4716f.m7696e(), FacebookActivity.class);
        intent.setAction(request.mo21158g().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: a */
    static C6533h m13796a(LoginClient.Request request, AccessToken accessToken) {
        Set<String> h = request.mo21159h();
        HashSet hashSet = new HashSet(accessToken.mo20785h());
        if (request.mo21161k()) {
            hashSet.retainAll(h);
        }
        HashSet hashSet2 = new HashSet(h);
        hashSet2.removeAll(hashSet);
        return new C6533h(accessToken, hashSet, hashSet2);
    }

    /* renamed from: a */
    private void m13799a(AccessToken accessToken, LoginClient.Request request, FacebookException facebookException, boolean z, C6366e<C6533h> eVar) {
        if (accessToken != null) {
            AccessToken.m13034b(accessToken);
            Profile.m13152c();
        }
        if (eVar != null) {
            C6533h a = accessToken != null ? m13796a(request, accessToken) : null;
            if (z || (a != null && a.mo21222b().size() == 0)) {
                eVar.onCancel();
            } else if (facebookException != null) {
                eVar.onError(facebookException);
            } else if (accessToken != null) {
                m13801a(true);
                eVar.onSuccess(a);
            }
        }
    }

    /* renamed from: a */
    private void m13801a(boolean z) {
        SharedPreferences.Editor edit = this.f12103c.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }
}

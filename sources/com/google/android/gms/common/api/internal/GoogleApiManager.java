package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;
import p050l.p066e.C4868a;
import p050l.p066e.C4870b;

@KeepForSdk
public class GoogleApiManager implements Handler.Callback {

    /* renamed from: s */
    public static final Status f13718s = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final Status f13719t = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final Object f13720u = new Object();

    /* renamed from: v */
    private static GoogleApiManager f13721v;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f13722f = 5000;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f13723g = LocalNotificationSyncManager.TWO_MINUTES;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f13724h = 10000;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Context f13725i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final GoogleApiAvailability f13726j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final GoogleApiAvailabilityCache f13727k;

    /* renamed from: l */
    private final AtomicInteger f13728l = new AtomicInteger(1);

    /* renamed from: m */
    private final AtomicInteger f13729m = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Map<zai<?>, zaa<?>> f13730n = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public zaae f13731o = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Set<zai<?>> f13732p = new C4870b();

    /* renamed from: q */
    private final Set<zai<?>> f13733q = new C4870b();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f13734r;

    /* renamed from: com.google.android.gms.common.api.internal.GoogleApiManager$b */
    private class C7164b implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Api.Client f13737a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final zai<?> f13738b;

        /* renamed from: c */
        private IAccountAccessor f13739c = null;

        /* renamed from: d */
        private Set<Scope> f13740d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f13741e = false;

        public C7164b(Api.Client client, zai<?> zai) {
            this.f13737a = client;
            this.f13738b = zai;
        }

        /* renamed from: a */
        public final void mo25038a(ConnectionResult connectionResult) {
            GoogleApiManager.this.f13734r.post(new C7175e0(this, connectionResult));
        }

        /* renamed from: b */
        public final void mo25040b(ConnectionResult connectionResult) {
            ((zaa) GoogleApiManager.this.f13730n.get(this.f13738b)).mo25047b(connectionResult);
        }

        /* renamed from: a */
        public final void mo25039a(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo25040b(new ConnectionResult(4));
                return;
            }
            this.f13739c = iAccountAccessor;
            this.f13740d = set;
            m15447a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m15447a() {
            IAccountAccessor iAccountAccessor;
            if (this.f13741e && (iAccountAccessor = this.f13739c) != null) {
                this.f13737a.getRemoteService(iAccountAccessor, this.f13740d);
            }
        }
    }

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f13725i = context;
        this.f13734r = new zap(looper, this);
        this.f13726j = googleApiAvailability;
        this.f13727k = new GoogleApiAvailabilityCache(googleApiAvailability);
        Handler handler = this.f13734r;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static GoogleApiManager m15418a(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f13720u) {
            if (f13721v == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f13721v = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.m15256a());
            }
            googleApiManager = f13721v;
        }
        return googleApiManager;
    }

    @KeepForSdk
    /* renamed from: d */
    public static void m15423d() {
        synchronized (f13720u) {
            if (f13721v != null) {
                GoogleApiManager googleApiManager = f13721v;
                googleApiManager.f13729m.incrementAndGet();
                googleApiManager.f13734r.sendMessageAtFrontOfQueue(googleApiManager.f13734r.obtainMessage(10));
            }
        }
    }

    /* renamed from: e */
    public static GoogleApiManager m15424e() {
        GoogleApiManager googleApiManager;
        synchronized (f13720u) {
            Preconditions.m16038a(f13721v, (Object) "Must guarantee manager is non-null before using getInstance");
            googleApiManager = f13721v;
        }
        return googleApiManager;
    }

    /* renamed from: b */
    public final int mo25030b() {
        return this.f13728l.getAndIncrement();
    }

    /* renamed from: c */
    public final void mo25033c() {
        Handler handler = this.f13734r;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        long j = LocalNotificationSyncManager.FIVE_MINUTES;
        zaa zaa2 = null;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f13724h = j;
                this.f13734r.removeMessages(12);
                for (zai<?> obtainMessage : this.f13730n.keySet()) {
                    Handler handler = this.f13734r;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f13724h);
                }
                break;
            case 2:
                zak zak = (zak) message.obj;
                Iterator<zai<?>> it = zak.mo25192b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        zai next = it.next();
                        zaa zaa3 = this.f13730n.get(next);
                        if (zaa3 == null) {
                            zak.mo25191a(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zaa3.mo25048c()) {
                            zak.mo25191a(next, ConnectionResult.f13608j, zaa3.mo25051f().getEndpointPackageName());
                        } else if (zaa3.mo25056k() != null) {
                            zak.mo25191a(next, zaa3.mo25056k(), (String) null);
                        } else {
                            zaa3.mo25045a(zak);
                            zaa3.mo25041a();
                        }
                    }
                }
            case 3:
                for (zaa next2 : this.f13730n.values()) {
                    next2.mo25055j();
                    next2.mo25041a();
                }
                break;
            case 4:
            case 8:
            case 13:
                zabv zabv = (zabv) message.obj;
                zaa zaa4 = this.f13730n.get(zabv.f13938c.mo24931g());
                if (zaa4 == null) {
                    m15420b(zabv.f13938c);
                    zaa4 = this.f13730n.get(zabv.f13938c.mo24931g());
                }
                if (zaa4.mo25049d() && this.f13729m.get() != zabv.f13937b) {
                    zabv.f13936a.mo25110a(f13718s);
                    zaa4.mo25053h();
                    break;
                } else {
                    zaa4.mo25044a(zabv.f13936a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zaa<?>> it2 = this.f13730n.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zaa next3 = it2.next();
                        if (next3.mo25046b() == i2) {
                            zaa2 = next3;
                        }
                    }
                }
                if (zaa2 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String b = this.f13726j.mo24867b(connectionResult.mo24840d());
                    String o = connectionResult.mo24843o();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 69 + String.valueOf(o).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(b);
                    sb2.append(": ");
                    sb2.append(o);
                    zaa2.mo25043a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (PlatformVersion.m16285a() && (this.f13725i.getApplicationContext() instanceof Application)) {
                    BackgroundDetector.m15382a((Application) this.f13725i.getApplicationContext());
                    BackgroundDetector.m15383b().mo24992a((BackgroundDetector.BackgroundStateChangeListener) new C7214y(this));
                    if (!BackgroundDetector.m15383b().mo24994a(true)) {
                        this.f13724h = LocalNotificationSyncManager.FIVE_MINUTES;
                        break;
                    }
                }
                break;
            case 7:
                m15420b((GoogleApi<?>) (GoogleApi) message.obj);
                break;
            case 9:
                if (this.f13730n.containsKey(message.obj)) {
                    this.f13730n.get(message.obj).mo25050e();
                    break;
                }
                break;
            case 10:
                for (zai<?> remove : this.f13733q) {
                    this.f13730n.remove(remove).mo25053h();
                }
                this.f13733q.clear();
                break;
            case 11:
                if (this.f13730n.containsKey(message.obj)) {
                    this.f13730n.get(message.obj).mo25052g();
                    break;
                }
                break;
            case 12:
                if (this.f13730n.containsKey(message.obj)) {
                    this.f13730n.get(message.obj).mo25057l();
                    break;
                }
                break;
            case 14:
                C7172d dVar = (C7172d) message.obj;
                zai<?> b2 = dVar.mo25098b();
                if (this.f13730n.containsKey(b2)) {
                    dVar.mo25097a().mo30712a(Boolean.valueOf(this.f13730n.get(b2).m15459a(false)));
                    break;
                } else {
                    dVar.mo25097a().mo30712a(false);
                    break;
                }
            case 15:
                C7163a aVar = (C7163a) message.obj;
                if (this.f13730n.containsKey(aVar.f13735a)) {
                    this.f13730n.get(aVar.f13735a).m15455a(aVar);
                    break;
                }
                break;
            case 16:
                C7163a aVar2 = (C7163a) message.obj;
                if (this.f13730n.containsKey(aVar2.f13735a)) {
                    this.f13730n.get(aVar2.f13735a).m15460b(aVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m15420b(GoogleApi<?> googleApi) {
        zai<?> g = googleApi.mo24931g();
        zaa zaa2 = this.f13730n.get(g);
        if (zaa2 == null) {
            zaa2 = new zaa(googleApi);
            this.f13730n.put(g, zaa2);
        }
        if (zaa2.mo25049d()) {
            this.f13733q.add(g);
        }
        zaa2.mo25041a();
    }

    /* renamed from: com.google.android.gms.common.api.internal.GoogleApiManager$a */
    private static class C7163a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final zai<?> f13735a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f13736b;

        private C7163a(zai<?> zai, Feature feature) {
            this.f13735a = zai;
            this.f13736b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C7163a)) {
                C7163a aVar = (C7163a) obj;
                if (!Objects.m16031a(this.f13735a, aVar.f13735a) || !Objects.m16031a(this.f13736b, aVar.f13736b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.m16029a(this.f13735a, this.f13736b);
        }

        public final String toString() {
            Objects.ToStringHelper a = Objects.m16030a((Object) this);
            a.mo25372a(RoomNotification.KEY, this.f13735a);
            a.mo25372a(DeepLinkIntentReceiver.DeepLinksTargets.FEATURE, this.f13736b);
            return a.toString();
        }

        /* synthetic */ C7163a(zai zai, Feature feature, C7214y yVar) {
            this(zai, feature);
        }
    }

    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zar {

        /* renamed from: f */
        private final Queue<zab> f13743f = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Api.Client f13744g;

        /* renamed from: h */
        private final Api.AnyClient f13745h;

        /* renamed from: i */
        private final zai<O> f13746i;

        /* renamed from: j */
        private final zaab f13747j;

        /* renamed from: k */
        private final Set<zak> f13748k = new HashSet();

        /* renamed from: l */
        private final Map<ListenerHolder.ListenerKey<?>, zabw> f13749l = new HashMap();

        /* renamed from: m */
        private final int f13750m;

        /* renamed from: n */
        private final zace f13751n;

        /* renamed from: o */
        private boolean f13752o;

        /* renamed from: p */
        private final List<C7163a> f13753p = new ArrayList();

        /* renamed from: q */
        private ConnectionResult f13754q = null;

        public zaa(GoogleApi<O> googleApi) {
            Api.Client a = googleApi.mo24921a(GoogleApiManager.this.f13734r.getLooper(), (zaa<O>) this);
            this.f13744g = a;
            if (a instanceof SimpleClientAdapter) {
                this.f13745h = ((SimpleClientAdapter) a).mo25391d();
            } else {
                this.f13745h = a;
            }
            this.f13746i = googleApi.mo24931g();
            this.f13747j = new zaab();
            this.f13750m = googleApi.mo24929e();
            if (this.f13744g.requiresSignIn()) {
                this.f13751n = googleApi.mo24924a(GoogleApiManager.this.f13725i, GoogleApiManager.this.f13734r);
            } else {
                this.f13751n = null;
            }
        }

        /* renamed from: c */
        private final boolean m15466c(ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.f13720u) {
                if (GoogleApiManager.this.f13731o == null || !GoogleApiManager.this.f13732p.contains(this.f13746i)) {
                    return false;
                }
                GoogleApiManager.this.f13731o.mo25193b(connectionResult, this.f13750m);
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m15468n() {
            mo25055j();
            m15467d(ConnectionResult.f13608j);
            m15471q();
            Iterator<zabw> it = this.f13749l.values().iterator();
            while (it.hasNext()) {
                zabw next = it.next();
                if (m15454a(next.f13939a.mo25087c()) != null) {
                    it.remove();
                } else {
                    try {
                        next.f13939a.mo25085a(this.f13745h, new TaskCompletionSource());
                    } catch (DeadObjectException unused) {
                        mo24960a(1);
                        this.f13744g.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m15470p();
            m15472r();
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m15469o() {
            mo25055j();
            this.f13752o = true;
            this.f13747j.mo25147c();
            GoogleApiManager.this.f13734r.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f13734r, 9, this.f13746i), GoogleApiManager.this.f13722f);
            GoogleApiManager.this.f13734r.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f13734r, 11, this.f13746i), GoogleApiManager.this.f13723g);
            GoogleApiManager.this.f13727k.mo25363a();
        }

        /* renamed from: p */
        private final void m15470p() {
            ArrayList arrayList = new ArrayList(this.f13743f);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zab zab = (zab) obj;
                if (!this.f13744g.isConnected()) {
                    return;
                }
                if (m15463b(zab)) {
                    this.f13743f.remove(zab);
                }
            }
        }

        /* renamed from: q */
        private final void m15471q() {
            if (this.f13752o) {
                GoogleApiManager.this.f13734r.removeMessages(11, this.f13746i);
                GoogleApiManager.this.f13734r.removeMessages(9, this.f13746i);
                this.f13752o = false;
            }
        }

        /* renamed from: r */
        private final void m15472r() {
            GoogleApiManager.this.f13734r.removeMessages(12, this.f13746i);
            GoogleApiManager.this.f13734r.sendMessageDelayed(GoogleApiManager.this.f13734r.obtainMessage(12, this.f13746i), GoogleApiManager.this.f13724h);
        }

        /* renamed from: a */
        public final void mo24960a(int i) {
            if (Looper.myLooper() == GoogleApiManager.this.f13734r.getLooper()) {
                m15469o();
            } else {
                GoogleApiManager.this.f13734r.post(new C7167a0(this));
            }
        }

        /* renamed from: b */
        public final void mo25047b(ConnectionResult connectionResult) {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            this.f13744g.disconnect();
            mo24962a(connectionResult);
        }

        /* renamed from: d */
        public final void mo24961d(Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.f13734r.getLooper()) {
                m15468n();
            } else {
                GoogleApiManager.this.f13734r.post(new C7216z(this));
            }
        }

        /* renamed from: e */
        public final void mo25050e() {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            if (this.f13752o) {
                mo25041a();
            }
        }

        /* renamed from: f */
        public final Api.Client mo25051f() {
            return this.f13744g;
        }

        /* renamed from: g */
        public final void mo25052g() {
            Status status;
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            if (this.f13752o) {
                m15471q();
                if (GoogleApiManager.this.f13726j.mo24869c(GoogleApiManager.this.f13725i) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                mo25043a(status);
                this.f13744g.disconnect();
            }
        }

        /* renamed from: h */
        public final void mo25053h() {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            mo25043a(GoogleApiManager.f13718s);
            this.f13747j.mo25146b();
            for (ListenerHolder.ListenerKey zah : (ListenerHolder.ListenerKey[]) this.f13749l.keySet().toArray(new ListenerHolder.ListenerKey[this.f13749l.size()])) {
                mo25044a((zab) new zah(zah, new TaskCompletionSource()));
            }
            m15467d(new ConnectionResult(4));
            if (this.f13744g.isConnected()) {
                this.f13744g.onUserSignOut(new C7171c0(this));
            }
        }

        /* renamed from: i */
        public final Map<ListenerHolder.ListenerKey<?>, zabw> mo25054i() {
            return this.f13749l;
        }

        /* renamed from: j */
        public final void mo25055j() {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            this.f13754q = null;
        }

        /* renamed from: k */
        public final ConnectionResult mo25056k() {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            return this.f13754q;
        }

        /* renamed from: l */
        public final boolean mo25057l() {
            return m15459a(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public final zad mo25058m() {
            zace zace = this.f13751n;
            if (zace == null) {
                return null;
            }
            return zace.mo25178Z();
        }

        /* renamed from: b */
        private final boolean m15463b(zab zab) {
            if (!(zab instanceof zac)) {
                m15465c(zab);
                return true;
            }
            zac zac = (zac) zab;
            Feature a = m15454a(zac.mo25176b(this));
            if (a == null) {
                m15465c(zab);
                return true;
            } else if (zac.mo25177c(this)) {
                C7163a aVar = new C7163a(this.f13746i, a, (C7214y) null);
                int indexOf = this.f13753p.indexOf(aVar);
                if (indexOf >= 0) {
                    C7163a aVar2 = this.f13753p.get(indexOf);
                    GoogleApiManager.this.f13734r.removeMessages(15, aVar2);
                    GoogleApiManager.this.f13734r.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f13734r, 15, aVar2), GoogleApiManager.this.f13722f);
                    return false;
                }
                this.f13753p.add(aVar);
                GoogleApiManager.this.f13734r.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f13734r, 15, aVar), GoogleApiManager.this.f13722f);
                GoogleApiManager.this.f13734r.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f13734r, 16, aVar), GoogleApiManager.this.f13723g);
                ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
                if (m15466c(connectionResult)) {
                    return false;
                }
                GoogleApiManager.this.mo25032b(connectionResult, this.f13750m);
                return false;
            } else {
                zac.mo25112a((RuntimeException) new UnsupportedApiCallException(a));
                return false;
            }
        }

        /* renamed from: d */
        private final void m15467d(ConnectionResult connectionResult) {
            for (zak next : this.f13748k) {
                String str = null;
                if (Objects.m16031a(connectionResult, ConnectionResult.f13608j)) {
                    str = this.f13744g.getEndpointPackageName();
                }
                next.mo25191a(this.f13746i, connectionResult, str);
            }
            this.f13748k.clear();
        }

        /* renamed from: a */
        public final void mo25042a(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == GoogleApiManager.this.f13734r.getLooper()) {
                mo24962a(connectionResult);
            } else {
                GoogleApiManager.this.f13734r.post(new C7169b0(this, connectionResult));
            }
        }

        /* renamed from: c */
        private final void m15465c(zab zab) {
            zab.mo25166a(this.f13747j, mo25049d());
            try {
                zab.mo25111a((zaa<?>) this);
            } catch (DeadObjectException unused) {
                mo24960a(1);
                this.f13744g.disconnect();
            }
        }

        /* renamed from: a */
        public final void mo24962a(ConnectionResult connectionResult) {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            zace zace = this.f13751n;
            if (zace != null) {
                zace.mo25180h0();
            }
            mo25055j();
            GoogleApiManager.this.f13727k.mo25363a();
            m15467d(connectionResult);
            if (connectionResult.mo24840d() == 4) {
                mo25043a(GoogleApiManager.f13719t);
            } else if (this.f13743f.isEmpty()) {
                this.f13754q = connectionResult;
            } else if (!m15466c(connectionResult) && !GoogleApiManager.this.mo25032b(connectionResult, this.f13750m)) {
                if (connectionResult.mo24840d() == 18) {
                    this.f13752o = true;
                }
                if (this.f13752o) {
                    GoogleApiManager.this.f13734r.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f13734r, 9, this.f13746i), GoogleApiManager.this.f13722f);
                    return;
                }
                String a = this.f13746i.mo25185a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                sb.append("API: ");
                sb.append(a);
                sb.append(" is not available on this device.");
                mo25043a(new Status(17, sb.toString()));
            }
        }

        /* renamed from: d */
        public final boolean mo25049d() {
            return this.f13744g.requiresSignIn();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo25048c() {
            return this.f13744g.isConnected();
        }

        /* renamed from: a */
        public final void mo25044a(zab zab) {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            if (!this.f13744g.isConnected()) {
                this.f13743f.add(zab);
                ConnectionResult connectionResult = this.f13754q;
                if (connectionResult == null || !connectionResult.mo24845q()) {
                    mo25041a();
                } else {
                    mo24962a(this.f13754q);
                }
            } else if (m15463b(zab)) {
                m15472r();
            } else {
                this.f13743f.add(zab);
            }
        }

        /* renamed from: b */
        public final int mo25046b() {
            return this.f13750m;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m15460b(C7163a aVar) {
            Feature[] b;
            if (this.f13753p.remove(aVar)) {
                GoogleApiManager.this.f13734r.removeMessages(15, aVar);
                GoogleApiManager.this.f13734r.removeMessages(16, aVar);
                Feature b2 = aVar.f13736b;
                ArrayList arrayList = new ArrayList(this.f13743f.size());
                for (zab zab : this.f13743f) {
                    if ((zab instanceof zac) && (b = ((zac) zab).mo25176b(this)) != null && ArrayUtils.m16247a((T[]) b, b2)) {
                        arrayList.add(zab);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zab zab2 = (zab) obj;
                    this.f13743f.remove(zab2);
                    zab2.mo25112a((RuntimeException) new UnsupportedApiCallException(b2));
                }
            }
        }

        /* renamed from: a */
        public final void mo25043a(Status status) {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            for (zab a : this.f13743f) {
                a.mo25110a(status);
            }
            this.f13743f.clear();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m15459a(boolean z) {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            if (!this.f13744g.isConnected() || this.f13749l.size() != 0) {
                return false;
            }
            if (this.f13747j.mo25145a()) {
                if (z) {
                    m15472r();
                }
                return false;
            }
            this.f13744g.disconnect();
            return true;
        }

        /* renamed from: a */
        public final void mo25041a() {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            if (!this.f13744g.isConnected() && !this.f13744g.isConnecting()) {
                int a = GoogleApiManager.this.f13727k.mo25362a(GoogleApiManager.this.f13725i, this.f13744g);
                if (a != 0) {
                    mo24962a(new ConnectionResult(a, (PendingIntent) null));
                    return;
                }
                C7164b bVar = new C7164b(this.f13744g, this.f13746i);
                if (this.f13744g.requiresSignIn()) {
                    this.f13751n.mo25179a((zach) bVar);
                }
                this.f13744g.connect(bVar);
            }
        }

        /* renamed from: a */
        public final void mo25045a(zak zak) {
            Preconditions.m16040a(GoogleApiManager.this.f13734r);
            this.f13748k.add(zak);
        }

        /* renamed from: a */
        private final Feature m15454a(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.f13744g.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                C4868a aVar = new C4868a(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    aVar.put(feature.mo24852d(), Long.valueOf(feature.mo24855o()));
                }
                for (Feature feature2 : featureArr) {
                    if (!aVar.containsKey(feature2.mo24852d()) || ((Long) aVar.get(feature2.mo24852d())).longValue() < feature2.mo24855o()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m15455a(C7163a aVar) {
            if (!this.f13753p.contains(aVar) || this.f13752o) {
                return;
            }
            if (!this.f13744g.isConnected()) {
                mo25041a();
            } else {
                m15470p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25031b(zaae zaae) {
        synchronized (f13720u) {
            if (this.f13731o == zaae) {
                this.f13731o = null;
                this.f13732p.clear();
            }
        }
    }

    /* renamed from: a */
    public final void mo25027a(GoogleApi<?> googleApi) {
        Handler handler = this.f13734r;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    /* renamed from: a */
    public final void mo25029a(zaae zaae) {
        synchronized (f13720u) {
            if (this.f13731o != zaae) {
                this.f13731o = zaae;
                this.f13732p.clear();
            }
            this.f13732p.addAll(zaae.mo25150h());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo25032b(ConnectionResult connectionResult, int i) {
        return this.f13726j.mo24866a(this.f13725i, connectionResult, i);
    }

    /* renamed from: a */
    public final Task<Map<zai<?>, String>> mo25024a(Iterable<? extends GoogleApi<?>> iterable) {
        zak zak = new zak(iterable);
        Handler handler = this.f13734r;
        handler.sendMessage(handler.obtainMessage(2, zak));
        return zak.mo25190a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25025a() {
        this.f13729m.incrementAndGet();
        Handler handler = this.f13734r;
        handler.sendMessage(handler.obtainMessage(10));
    }

    /* renamed from: a */
    public final <O extends Api.ApiOptions> void mo25028a(GoogleApi<O> googleApi, int i, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zae = new zae(i, apiMethodImpl);
        Handler handler = this.f13734r;
        handler.sendMessage(handler.obtainMessage(4, new zabv(zae, this.f13729m.get(), googleApi)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo25023a(zai<?> zai, int i) {
        zad m;
        zaa zaa2 = this.f13730n.get(zai);
        if (zaa2 == null || (m = zaa2.mo25058m()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f13725i, i, m.getSignInIntent(), 134217728);
    }

    /* renamed from: a */
    public final void mo25026a(ConnectionResult connectionResult, int i) {
        if (!mo25032b(connectionResult, i)) {
            Handler handler = this.f13734r;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}

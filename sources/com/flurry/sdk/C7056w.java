package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Looper;
import android.telephony.CellSignalStrength;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.flurry.sdk.C7045v;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/* renamed from: com.flurry.sdk.w */
public class C7056w extends C6798d7<C7045v> {

    /* renamed from: E */
    protected static long f13287E = 3600000;

    /* renamed from: A */
    private BroadcastReceiver f13288A;

    /* renamed from: B */
    private ConnectivityManager.NetworkCallback f13289B;

    /* renamed from: C */
    private PhoneStateListener f13290C;

    /* renamed from: D */
    protected C6823f7<C6877i7> f13291D = new C7057a();

    /* renamed from: o */
    private boolean f13292o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f13293p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f13294q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C7045v.C7046a f13295r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f13296s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f13297t = null;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public String f13298u = null;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f13299v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public String f13300w = null;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f13301x = null;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f13302y = -1;

    /* renamed from: z */
    private C6852h7 f13303z;

    /* renamed from: com.flurry.sdk.w$a */
    class C7057a implements C6823f7<C6877i7> {
        C7057a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            if (((C6877i7) obj).f12863b == C6838g7.FOREGROUND) {
                C7056w.this.mo23733j();
            }
        }
    }

    /* renamed from: com.flurry.sdk.w$b */
    class C7058b extends ConnectivityManager.NetworkCallback {
        C7058b() {
        }

        public final void onAvailable(Network network) {
            C7056w.this.mo23563c(new C7061e((SignalStrength) null));
        }

        public final void onLost(Network network) {
            C7056w.this.mo23563c(new C7061e((SignalStrength) null));
        }
    }

    /* renamed from: com.flurry.sdk.w$c */
    class C7059c extends BroadcastReceiver {
        C7059c() {
        }

        public final void onReceive(Context context, Intent intent) {
            C7056w.this.mo23563c(new C7061e((SignalStrength) null));
        }
    }

    /* renamed from: com.flurry.sdk.w$d */
    class C7060d extends PhoneStateListener {

        /* renamed from: a */
        private long f13307a;

        C7060d() {
        }

        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f13307a > C7056w.f13287E) {
                this.f13307a = currentTimeMillis;
                C7056w.this.mo23563c(new C7061e(signalStrength));
            }
        }
    }

    /* renamed from: com.flurry.sdk.w$e */
    class C7061e extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ SignalStrength f13309h;

        C7061e(SignalStrength signalStrength) {
            this.f13309h = signalStrength;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C7056w.this.mo23726a(this.f13309h);
            C7056w.this.mo23733j();
        }
    }

    /* renamed from: com.flurry.sdk.w$f */
    class C7062f extends C6816f2 {
        C7062f() {
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C7056w.m14982k().registerNetworkCallback(new NetworkRequest.Builder().build(), C7056w.this.mo23728e());
        }
    }

    /* renamed from: com.flurry.sdk.w$g */
    class C7063g extends C6816f2 {
        C7063g() {
        }

        /* renamed from: a */
        public final void mo23531a() {
            C7056w wVar = C7056w.this;
            boolean unused = wVar.f13293p = wVar.m14972b();
            C7056w wVar2 = C7056w.this;
            C7045v.C7046a unused2 = wVar2.f13295r = wVar2.mo23730g();
            C7056w wVar3 = C7056w.this;
            wVar3.mo23583a(new C7045v(wVar3.f13295r, C7056w.this.f13293p, C7056w.this.f13296s, C7056w.this.f13297t, C7056w.this.f13298u, C7056w.this.f13299v, C7056w.this.f13300w, C7056w.this.f13301x, C7056w.this.f13302y));
        }
    }

    /* renamed from: com.flurry.sdk.w$h */
    class C7064h extends C6816f2 {
        C7064h() {
        }

        /* renamed from: a */
        public final void mo23531a() {
            boolean a = C7056w.this.m14972b();
            C7045v.C7046a g = C7056w.this.mo23730g();
            if (C7056w.this.f13293p != a || C7056w.this.f13295r != g || C7056w.this.f13294q) {
                boolean unused = C7056w.this.f13293p = a;
                C7045v.C7046a unused2 = C7056w.this.f13295r = g;
                boolean unused3 = C7056w.this.f13294q = false;
                C7056w wVar = C7056w.this;
                wVar.mo23583a(new C7045v(wVar.mo23730g(), C7056w.this.f13293p, C7056w.this.f13296s, C7056w.this.f13297t, C7056w.this.f13298u, C7056w.this.f13299v, C7056w.this.f13300w, C7056w.this.f13301x, C7056w.this.f13302y));
            }
        }
    }

    public C7056w(C6852h7 h7Var) {
        super("NetworkProvider");
        if (C6954o2.m14770a("android.permission.ACCESS_NETWORK_STATE")) {
            m14973c();
            this.f13303z = h7Var;
            h7Var.mo23582a(this.f13291D);
            return;
        }
        this.f13293p = true;
        this.f13295r = C7045v.C7046a.NONE_OR_UNKNOWN;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    private synchronized void m14973c() {
        if (!this.f13292o) {
            this.f13293p = m14972b();
            this.f13295r = mo23730g();
            if (Build.VERSION.SDK_INT >= 29) {
                mo23563c(new C7062f());
            } else {
                C6747b0.m14386a().registerReceiver(mo23729f(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
            m14984l().listen(mo23731h(), 256);
            this.f13292o = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static ConnectivityManager m14982k() {
        return (ConnectivityManager) C6747b0.m14386a().getSystemService("connectivity");
    }

    /* renamed from: l */
    private static TelephonyManager m14984l() {
        return (TelephonyManager) C6747b0.m14386a().getSystemService("phone");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public ConnectivityManager.NetworkCallback mo23728e() {
        if (this.f13289B == null) {
            this.f13289B = new C7058b();
        }
        return this.f13289B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public BroadcastReceiver mo23729f() {
        if (this.f13288A == null) {
            this.f13288A = new C7059c();
        }
        return this.f13288A;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: g */
    public C7045v.C7046a mo23730g() {
        if (!C6954o2.m14770a("android.permission.ACCESS_NETWORK_STATE")) {
            return C7045v.C7046a.NONE_OR_UNKNOWN;
        }
        ConnectivityManager k = m14982k();
        if (k == null) {
            return C7045v.C7046a.NONE_OR_UNKNOWN;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return mo23725a(k);
            }
            return mo23727b(k);
        } catch (Throwable th) {
            C6792d1.m14476a(5, "NetworkProvider", "Failed to get Network type: " + th.toString());
            return C7045v.C7046a.NONE_OR_UNKNOWN;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public PhoneStateListener mo23731h() {
        if (this.f13290C == null) {
            try {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                    Looper.loop();
                }
                this.f13290C = new C7060d();
            } catch (Throwable th) {
                C6792d1.m14476a(5, "NetworkProvider", "Failed to initialize PhoneStateListener: " + th.toString());
            }
        }
        return this.f13290C;
    }

    /* renamed from: i */
    public boolean mo23732i() {
        return this.f13293p;
    }

    /* renamed from: j */
    public void mo23733j() {
        mo23563c(new C7064h());
    }

    /* renamed from: b */
    private int m14969b(SignalStrength signalStrength) {
        if (signalStrength == null) {
            return this.f13302y;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                for (CellSignalStrength dbm : signalStrength.getCellSignalStrengths()) {
                    int dbm2 = dbm.getDbm();
                    if (dbm2 != Integer.MAX_VALUE) {
                        return dbm2;
                    }
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        char c = 0;
        try {
            return ((Integer) signalStrength.getClass().getMethod("getDbm", new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            if (signalStrength.isGsm()) {
                int a = m14962a(signalStrength, "getLteDbm", "rsrp", 9);
                if (a != Integer.MAX_VALUE) {
                    return a;
                }
                int a2 = m14962a(signalStrength, "getTdScdmaDbm", "mTdscdma", 14);
                if (a2 <= -25 && a2 != Integer.MAX_VALUE) {
                    if (a2 >= -49) {
                        c = 4;
                    } else if (a2 >= -73) {
                        c = 3;
                    } else if (a2 >= -97) {
                        c = 2;
                    } else if (a2 >= -110) {
                        c = 1;
                    }
                }
                if (c != 0) {
                    return a2;
                }
                int a3 = m14962a(signalStrength, "getWcdmaDbm", "mWcdma", 17);
                if (a3 != Integer.MAX_VALUE) {
                    return a3;
                }
                int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                if ((gsmSignalStrength == 99 ? -1 : gsmSignalStrength) != -1) {
                    return (gsmSignalStrength * 2) - 113;
                }
                return -1;
            }
            int cdmaDbm = signalStrength.getCdmaDbm();
            int evdoDbm = signalStrength.getEvdoDbm();
            return (evdoDbm != -120 && (cdmaDbm == -120 || cdmaDbm >= evdoDbm)) ? evdoDbm : cdmaDbm;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public void mo23726a(SignalStrength signalStrength) {
        TelephonyManager l = m14984l();
        String networkOperatorName = l.getNetworkOperatorName();
        String networkOperator = l.getNetworkOperator();
        String simOperator = l.getSimOperator();
        String simOperatorName = l.getSimOperatorName();
        String str = "";
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                CharSequence simCarrierIdName = l.getSimCarrierIdName();
                if (simCarrierIdName != null) {
                    str = simCarrierIdName.toString();
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int i = 0;
        try {
            if (Build.VERSION.SDK_INT < 24) {
                i = l.getNetworkType();
            } else if (C6954o2.m14770a("android.permission.READ_PHONE_STATE")) {
                i = l.getDataNetworkType();
            } else if (Build.VERSION.SDK_INT < 29) {
                i = l.getNetworkType();
            }
        } catch (SecurityException unused2) {
        }
        String num = Integer.toString(i);
        int b = m14969b(signalStrength);
        if (!TextUtils.equals(this.f13296s, networkOperatorName) || !TextUtils.equals(this.f13297t, networkOperator) || !TextUtils.equals(this.f13298u, simOperator) || !TextUtils.equals(this.f13299v, str) || !TextUtils.equals(this.f13300w, simOperatorName) || !TextUtils.equals(this.f13301x, num) || this.f13302y != b) {
            C6792d1.m14476a(3, "NetworkProvider", "Cellular Name: " + networkOperatorName + ", Operator: " + networkOperator + ", Sim Operator: " + simOperator + ", Sim Id: " + str + ", Sim Name: " + simOperatorName + ", Band: " + num + ", Signal Strength: " + b);
            this.f13294q = true;
            this.f13296s = networkOperatorName;
            this.f13297t = networkOperator;
            this.f13298u = simOperator;
            this.f13299v = str;
            this.f13300w = simOperatorName;
            this.f13301x = num;
            this.f13302y = b;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public C7045v.C7046a mo23727b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return C7045v.C7046a.NONE_OR_UNKNOWN;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type == 1) {
                return C7045v.C7046a.WIFI;
            }
            if (!(type == 2 || type == 3 || type == 4 || type == 5)) {
                if (type != 8) {
                    return C7045v.C7046a.NETWORK_AVAILABLE;
                }
                return C7045v.C7046a.NONE_OR_UNKNOWN;
            }
        }
        return C7045v.C7046a.CELL;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public boolean m14972b() {
        if (!C6954o2.m14770a("android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        ConnectivityManager k = m14982k();
        if (k == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT < 23) {
                NetworkInfo activeNetworkInfo = k.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } else if (mo23725a(k) != C7045v.C7046a.NONE_OR_UNKNOWN) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable th) {
            C6792d1.m14476a(5, "NetworkProvider", "Failed to get Network status: " + th.toString());
            return false;
        }
    }

    /* renamed from: a */
    private static int m14962a(SignalStrength signalStrength, String str, String str2, int i) {
        int i2;
        int i3 = Integer.MAX_VALUE;
        try {
            i2 = ((Integer) signalStrength.getClass().getMethod(str, new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            i2 = Integer.MAX_VALUE;
        }
        if (i2 == Integer.MAX_VALUE) {
            String signalStrength2 = signalStrength.toString();
            int indexOf = signalStrength2.indexOf(str2 + "=");
            if (indexOf != -1) {
                Scanner scanner = new Scanner(signalStrength2.substring(indexOf + str2.length() + 1));
                if (scanner.hasNextInt() && (i2 = scanner.nextInt()) == 99) {
                    i2 = Integer.MAX_VALUE;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        String[] split = signalStrength.toString().split(" ");
        if (split.length <= i) {
            return i2;
        }
        try {
            int parseInt = Integer.parseInt(split[i]);
            if (parseInt != 99) {
                i3 = parseInt;
            }
            return i3;
        } catch (NumberFormatException unused2) {
            return i2;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public C7045v.C7046a mo23725a(ConnectivityManager connectivityManager) {
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return C7045v.C7046a.NONE_OR_UNKNOWN;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return C7045v.C7046a.NONE_OR_UNKNOWN;
        }
        if (networkCapabilities.hasTransport(1)) {
            return C7045v.C7046a.WIFI;
        }
        if (networkCapabilities.hasTransport(0)) {
            return C7045v.C7046a.CELL;
        }
        return C7045v.C7046a.NETWORK_AVAILABLE;
    }

    /* renamed from: a */
    public void mo23582a(C6823f7<C7045v> f7Var) {
        super.mo23582a(f7Var);
        mo23563c(new C7063g());
    }
}

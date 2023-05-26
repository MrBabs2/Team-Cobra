package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import p050l.p075h.C4946b;

/* renamed from: androidx.core.app.i */
/* compiled from: NotificationCompat */
public class C0373i {

    /* renamed from: androidx.core.app.i$a */
    /* compiled from: NotificationCompat */
    public static class C0374a {

        /* renamed from: a */
        final Bundle f1671a;

        /* renamed from: b */
        private IconCompat f1672b;

        /* renamed from: c */
        private final C0387m[] f1673c;

        /* renamed from: d */
        private final C0387m[] f1674d;

        /* renamed from: e */
        private boolean f1675e;

        /* renamed from: f */
        boolean f1676f;

        /* renamed from: g */
        private final int f1677g;

        /* renamed from: h */
        private final boolean f1678h;
        @Deprecated

        /* renamed from: i */
        public int f1679i;

        /* renamed from: j */
        public CharSequence f1680j;

        /* renamed from: k */
        public PendingIntent f1681k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0374a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m1998a((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent mo2224a() {
            return this.f1681k;
        }

        /* renamed from: b */
        public boolean mo2225b() {
            return this.f1675e;
        }

        /* renamed from: c */
        public C0387m[] mo2226c() {
            return this.f1674d;
        }

        /* renamed from: d */
        public Bundle mo2227d() {
            return this.f1671a;
        }

        /* renamed from: e */
        public IconCompat mo2228e() {
            int i;
            if (this.f1672b == null && (i = this.f1679i) != 0) {
                this.f1672b = IconCompat.m1998a((Resources) null, "", i);
            }
            return this.f1672b;
        }

        /* renamed from: f */
        public C0387m[] mo2229f() {
            return this.f1673c;
        }

        /* renamed from: g */
        public int mo2230g() {
            return this.f1677g;
        }

        /* renamed from: h */
        public boolean mo2231h() {
            return this.f1676f;
        }

        /* renamed from: i */
        public CharSequence mo2232i() {
            return this.f1680j;
        }

        /* renamed from: j */
        public boolean mo2233j() {
            return this.f1678h;
        }

        public C0374a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C0387m[]) null, (C0387m[]) null, true, 0, true, false);
        }

        C0374a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0387m[] mVarArr, C0387m[] mVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f1676f = true;
            this.f1672b = iconCompat;
            if (iconCompat != null && iconCompat.mo2323c() == 2) {
                this.f1679i = iconCompat.mo2319a();
            }
            this.f1680j = C0377d.m1824d(charSequence);
            this.f1681k = pendingIntent;
            this.f1671a = bundle == null ? new Bundle() : bundle;
            this.f1673c = mVarArr;
            this.f1674d = mVarArr2;
            this.f1675e = z;
            this.f1677g = i;
            this.f1676f = z2;
            this.f1678h = z3;
        }
    }

    /* renamed from: androidx.core.app.i$b */
    /* compiled from: NotificationCompat */
    public static class C0375b extends C0378e {

        /* renamed from: e */
        private CharSequence f1682e;

        /* renamed from: a */
        public C0375b mo2234a(CharSequence charSequence) {
            this.f1682e = C0377d.m1824d(charSequence);
            return this;
        }

        /* renamed from: a */
        public void mo2235a(C0372h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.mo2223a()).setBigContentTitle(this.f1728b).bigText(this.f1682e);
                if (this.f1730d) {
                    bigText.setSummaryText(this.f1729c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.i$c */
    /* compiled from: NotificationCompat */
    public static final class C0376c {
        /* renamed from: a */
        public static Notification.BubbleMetadata m1820a(C0376c cVar) {
            if (cVar == null) {
                return null;
            }
            new Notification.BubbleMetadata.Builder();
            cVar.mo2236a();
            throw null;
        }

        /* renamed from: a */
        public boolean mo2236a() {
            throw null;
        }
    }

    /* renamed from: androidx.core.app.i$d */
    /* compiled from: NotificationCompat */
    public static class C0377d {

        /* renamed from: A */
        String f1683A;

        /* renamed from: B */
        Bundle f1684B;

        /* renamed from: C */
        int f1685C;

        /* renamed from: D */
        int f1686D;

        /* renamed from: E */
        Notification f1687E;

        /* renamed from: F */
        RemoteViews f1688F;

        /* renamed from: G */
        RemoteViews f1689G;

        /* renamed from: H */
        RemoteViews f1690H;

        /* renamed from: I */
        String f1691I;

        /* renamed from: J */
        int f1692J;

        /* renamed from: K */
        String f1693K;

        /* renamed from: L */
        long f1694L;

        /* renamed from: M */
        int f1695M;

        /* renamed from: N */
        boolean f1696N;

        /* renamed from: O */
        C0376c f1697O;

        /* renamed from: P */
        Notification f1698P;

        /* renamed from: Q */
        boolean f1699Q;
        @Deprecated

        /* renamed from: R */
        public ArrayList<String> f1700R;

        /* renamed from: a */
        public Context f1701a;

        /* renamed from: b */
        public ArrayList<C0374a> f1702b;

        /* renamed from: c */
        ArrayList<C0374a> f1703c;

        /* renamed from: d */
        CharSequence f1704d;

        /* renamed from: e */
        CharSequence f1705e;

        /* renamed from: f */
        PendingIntent f1706f;

        /* renamed from: g */
        PendingIntent f1707g;

        /* renamed from: h */
        RemoteViews f1708h;

        /* renamed from: i */
        Bitmap f1709i;

        /* renamed from: j */
        CharSequence f1710j;

        /* renamed from: k */
        int f1711k;

        /* renamed from: l */
        int f1712l;

        /* renamed from: m */
        boolean f1713m;

        /* renamed from: n */
        boolean f1714n;

        /* renamed from: o */
        C0378e f1715o;

        /* renamed from: p */
        CharSequence f1716p;

        /* renamed from: q */
        CharSequence[] f1717q;

        /* renamed from: r */
        int f1718r;

        /* renamed from: s */
        int f1719s;

        /* renamed from: t */
        boolean f1720t;

        /* renamed from: u */
        String f1721u;

        /* renamed from: v */
        boolean f1722v;

        /* renamed from: w */
        String f1723w;

        /* renamed from: x */
        boolean f1724x;

        /* renamed from: y */
        boolean f1725y;

        /* renamed from: z */
        boolean f1726z;

        public C0377d(Context context, String str) {
            this.f1702b = new ArrayList<>();
            this.f1703c = new ArrayList<>();
            this.f1713m = true;
            this.f1724x = false;
            this.f1685C = 0;
            this.f1686D = 0;
            this.f1692J = 0;
            this.f1695M = 0;
            Notification notification = new Notification();
            this.f1698P = notification;
            this.f1701a = context;
            this.f1691I = str;
            notification.when = System.currentTimeMillis();
            this.f1698P.audioStreamType = -1;
            this.f1712l = 0;
            this.f1700R = new ArrayList<>();
            this.f1696N = true;
        }

        /* renamed from: a */
        public C0377d mo2241a(long j) {
            this.f1698P.when = j;
            return this;
        }

        /* renamed from: b */
        public C0377d mo2252b(CharSequence charSequence) {
            this.f1704d = m1824d(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0377d mo2254c(int i) {
            this.f1698P.icon = i;
            return this;
        }

        /* renamed from: d */
        public C0377d mo2257d(boolean z) {
            m1822a(8, z);
            return this;
        }

        /* renamed from: d */
        protected static CharSequence m1824d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        public C0377d mo2246a(CharSequence charSequence) {
            this.f1705e = m1824d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0377d mo2251b(PendingIntent pendingIntent) {
            this.f1698P.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C0377d mo2255c(CharSequence charSequence) {
            this.f1698P.tickerText = m1824d(charSequence);
            return this;
        }

        /* renamed from: b */
        private Bitmap m1823b(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1701a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C4946b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C4946b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double min = Math.min(d2, d3 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        /* renamed from: a */
        public C0377d mo2239a(int i, int i2, boolean z) {
            this.f1718r = i;
            this.f1719s = i2;
            this.f1720t = z;
            return this;
        }

        /* renamed from: c */
        public C0377d mo2256c(boolean z) {
            m1822a(2, z);
            return this;
        }

        /* renamed from: a */
        public C0377d mo2242a(PendingIntent pendingIntent) {
            this.f1706f = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C0377d mo2243a(Bitmap bitmap) {
            this.f1709i = m1823b(bitmap);
            return this;
        }

        /* renamed from: a */
        public C0377d mo2248a(boolean z) {
            m1822a(16, z);
            return this;
        }

        /* renamed from: a */
        private void m1822a(int i, boolean z) {
            if (z) {
                Notification notification = this.f1698P;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f1698P;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        /* renamed from: a */
        public C0377d mo2240a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1702b.add(new C0374a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0377d mo2244a(C0374a aVar) {
            this.f1702b.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0377d mo2245a(C0378e eVar) {
            if (this.f1715o != eVar) {
                this.f1715o = eVar;
                if (eVar != null) {
                    eVar.mo2259a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0377d mo2238a(int i) {
            this.f1685C = i;
            return this;
        }

        /* renamed from: b */
        public C0377d mo2253b(boolean z) {
            this.f1724x = z;
            return this;
        }

        /* renamed from: a */
        public C0377d mo2247a(String str) {
            this.f1691I = str;
            return this;
        }

        /* renamed from: b */
        public C0377d mo2250b(int i) {
            this.f1712l = i;
            return this;
        }

        @Deprecated
        public C0377d(Context context) {
            this(context, (String) null);
        }

        /* renamed from: a */
        public Notification mo2237a() {
            return new C0379j(this).mo2263b();
        }

        /* renamed from: b */
        public Bundle mo2249b() {
            if (this.f1684B == null) {
                this.f1684B = new Bundle();
            }
            return this.f1684B;
        }
    }

    /* renamed from: androidx.core.app.i$e */
    /* compiled from: NotificationCompat */
    public static abstract class C0378e {

        /* renamed from: a */
        protected C0377d f1727a;

        /* renamed from: b */
        CharSequence f1728b;

        /* renamed from: c */
        CharSequence f1729c;

        /* renamed from: d */
        boolean f1730d = false;

        /* renamed from: a */
        public void mo2258a(Bundle bundle) {
        }

        /* renamed from: a */
        public abstract void mo2235a(C0372h hVar);

        /* renamed from: a */
        public void mo2259a(C0377d dVar) {
            if (this.f1727a != dVar) {
                this.f1727a = dVar;
                if (dVar != null) {
                    dVar.mo2245a(this);
                }
            }
        }

        /* renamed from: b */
        public RemoteViews mo2260b(C0372h hVar) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo2261c(C0372h hVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo2262d(C0372h hVar) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m1807a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0380k.m1858a(notification);
        }
        return null;
    }
}

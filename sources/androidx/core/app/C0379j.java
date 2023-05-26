package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0373i;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.j */
/* compiled from: NotificationCompatBuilder */
class C0379j implements C0372h {

    /* renamed from: a */
    private final Notification.Builder f1731a;

    /* renamed from: b */
    private final C0373i.C0377d f1732b;

    /* renamed from: c */
    private RemoteViews f1733c;

    /* renamed from: d */
    private RemoteViews f1734d;

    /* renamed from: e */
    private final List<Bundle> f1735e = new ArrayList();

    /* renamed from: f */
    private final Bundle f1736f = new Bundle();

    /* renamed from: g */
    private int f1737g;

    /* renamed from: h */
    private RemoteViews f1738h;

    C0379j(C0373i.C0377d dVar) {
        ArrayList<String> arrayList;
        this.f1732b = dVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1731a = new Notification.Builder(dVar.f1701a, dVar.f1691I);
        } else {
            this.f1731a = new Notification.Builder(dVar.f1701a);
        }
        Notification notification = dVar.f1698P;
        this.f1731a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f1708h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1704d).setContentText(dVar.f1705e).setContentInfo(dVar.f1710j).setContentIntent(dVar.f1706f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f1707g, (notification.flags & 128) != 0).setLargeIcon(dVar.f1709i).setNumber(dVar.f1711k).setProgress(dVar.f1718r, dVar.f1719s, dVar.f1720t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f1731a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1731a.setSubText(dVar.f1716p).setUsesChronometer(dVar.f1714n).setPriority(dVar.f1712l);
            Iterator<C0373i.C0374a> it = dVar.f1702b.iterator();
            while (it.hasNext()) {
                m1853a(it.next());
            }
            Bundle bundle = dVar.f1684B;
            if (bundle != null) {
                this.f1736f.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.f1724x) {
                    this.f1736f.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.f1721u;
                if (str != null) {
                    this.f1736f.putString("android.support.groupKey", str);
                    if (dVar.f1722v) {
                        this.f1736f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f1736f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = dVar.f1723w;
                if (str2 != null) {
                    this.f1736f.putString("android.support.sortKey", str2);
                }
            }
            this.f1733c = dVar.f1688F;
            this.f1734d = dVar.f1689G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1731a.setShowWhen(dVar.f1713m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = dVar.f1700R) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.f1736f;
                ArrayList<String> arrayList2 = dVar.f1700R;
                bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f1731a.setLocalOnly(dVar.f1724x).setGroup(dVar.f1721u).setGroupSummary(dVar.f1722v).setSortKey(dVar.f1723w);
            this.f1737g = dVar.f1695M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1731a.setCategory(dVar.f1683A).setColor(dVar.f1685C).setVisibility(dVar.f1686D).setPublicVersion(dVar.f1687E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.f1700R.iterator();
            while (it2.hasNext()) {
                this.f1731a.addPerson(it2.next());
            }
            this.f1738h = dVar.f1690H;
            if (dVar.f1703c.size() > 0) {
                Bundle bundle3 = dVar.mo2249b().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle();
                for (int i = 0; i < dVar.f1703c.size(); i++) {
                    bundle4.putBundle(Integer.toString(i), C0380k.m1859a(dVar.f1703c.get(i)));
                }
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.mo2249b().putBundle("android.car.EXTENSIONS", bundle3);
                this.f1736f.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1731a.setExtras(dVar.f1684B).setRemoteInputHistory(dVar.f1717q);
            RemoteViews remoteViews = dVar.f1688F;
            if (remoteViews != null) {
                this.f1731a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f1689G;
            if (remoteViews2 != null) {
                this.f1731a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f1690H;
            if (remoteViews3 != null) {
                this.f1731a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1731a.setBadgeIconType(dVar.f1692J).setShortcutId(dVar.f1693K).setTimeoutAfter(dVar.f1694L).setGroupAlertBehavior(dVar.f1695M);
            if (dVar.f1726z) {
                this.f1731a.setColorized(dVar.f1725y);
            }
            if (!TextUtils.isEmpty(dVar.f1691I)) {
                this.f1731a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1731a.setAllowSystemGeneratedContextualActions(dVar.f1696N);
            this.f1731a.setBubbleMetadata(C0373i.C0376c.m1820a(dVar.f1697O));
        }
        if (dVar.f1699Q) {
            if (this.f1732b.f1722v) {
                this.f1737g = 2;
            } else {
                this.f1737g = 1;
            }
            this.f1731a.setVibrate((long[]) null);
            this.f1731a.setSound((Uri) null);
            int i2 = notification.defaults & -2;
            notification.defaults = i2;
            int i3 = i2 & -3;
            notification.defaults = i3;
            this.f1731a.setDefaults(i3);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f1732b.f1721u)) {
                    this.f1731a.setGroup("silent");
                }
                this.f1731a.setGroupAlertBehavior(this.f1737g);
            }
        }
    }

    /* renamed from: a */
    public Notification.Builder mo2223a() {
        return this.f1731a;
    }

    /* renamed from: b */
    public Notification mo2263b() {
        Bundle a;
        RemoteViews d;
        RemoteViews b;
        C0373i.C0378e eVar = this.f1732b.f1715o;
        if (eVar != null) {
            eVar.mo2235a((C0372h) this);
        }
        RemoteViews c = eVar != null ? eVar.mo2261c(this) : null;
        Notification c2 = mo2264c();
        if (c != null) {
            c2.contentView = c;
        } else {
            RemoteViews remoteViews = this.f1732b.f1688F;
            if (remoteViews != null) {
                c2.contentView = remoteViews;
            }
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (b = eVar.mo2260b(this)) == null)) {
            c2.bigContentView = b;
        }
        if (!(Build.VERSION.SDK_INT < 21 || eVar == null || (d = this.f1732b.f1715o.mo2262d(this)) == null)) {
            c2.headsUpContentView = d;
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (a = C0373i.m1807a(c2)) == null)) {
            eVar.mo2258a(a);
        }
        return c2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo2264c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1731a.build();
        }
        if (i >= 24) {
            Notification build = this.f1731a.build();
            if (this.f1737g != 0) {
                if (!(build.getGroup() == null || (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f1737g != 2)) {
                    m1852a(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f1737g == 1) {
                    m1852a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f1731a.setExtras(this.f1736f);
            Notification build2 = this.f1731a.build();
            RemoteViews remoteViews = this.f1733c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1734d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1738h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1737g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f1737g != 2)) {
                    m1852a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f1737g == 1) {
                    m1852a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f1731a.setExtras(this.f1736f);
            Notification build3 = this.f1731a.build();
            RemoteViews remoteViews4 = this.f1733c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1734d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1737g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f1737g != 2)) {
                    m1852a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f1737g == 1) {
                    m1852a(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0380k.m1861a(this.f1735e);
            if (a != null) {
                this.f1736f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f1731a.setExtras(this.f1736f);
            Notification build4 = this.f1731a.build();
            RemoteViews remoteViews6 = this.f1733c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1734d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f1731a.getNotification();
        } else {
            Notification build5 = this.f1731a.build();
            Bundle a2 = C0373i.m1807a(build5);
            Bundle bundle = new Bundle(this.f1736f);
            for (String str : this.f1736f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0380k.m1861a(this.f1735e);
            if (a3 != null) {
                C0373i.m1807a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f1733c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f1734d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    /* renamed from: a */
    private void m1853a(C0373i.C0374a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat e = aVar.mo2228e();
            if (Build.VERSION.SDK_INT >= 23) {
                builder = new Notification.Action.Builder(e != null ? e.mo2326f() : null, aVar.mo2232i(), aVar.mo2224a());
            } else {
                builder = new Notification.Action.Builder(e != null ? e.mo2319a() : 0, aVar.mo2232i(), aVar.mo2224a());
            }
            if (aVar.mo2229f() != null) {
                for (RemoteInput addRemoteInput : C0387m.m1882a(aVar.mo2229f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.mo2227d() != null) {
                bundle = new Bundle(aVar.mo2227d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2225b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo2225b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo2230g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.mo2230g());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.mo2233j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo2231h());
            builder.addExtras(bundle);
            this.f1731a.addAction(builder.build());
        } else if (i >= 16) {
            this.f1735e.add(C0380k.m1857a(this.f1731a, aVar));
        }
    }

    /* renamed from: a */
    private void m1852a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }
}

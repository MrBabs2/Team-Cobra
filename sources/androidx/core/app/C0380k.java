package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0373i;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

/* renamed from: androidx.core.app.k */
/* compiled from: NotificationCompatJellybean */
class C0380k {

    /* renamed from: a */
    private static final Object f1739a = new Object();

    /* renamed from: b */
    private static Field f1740b;

    /* renamed from: c */
    private static boolean f1741c;

    /* renamed from: a */
    public static SparseArray<Bundle> m1861a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m1858a(Notification notification) {
        synchronized (f1739a) {
            if (f1741c) {
                return null;
            }
            try {
                if (f1740b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1741c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1740b = declaredField;
                }
                Bundle bundle = (Bundle) f1740b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1740b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f1741c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f1741c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m1857a(Notification.Builder builder, C0373i.C0374a aVar) {
        IconCompat e = aVar.mo2228e();
        builder.addAction(e != null ? e.mo2319a() : 0, aVar.mo2232i(), aVar.mo2224a());
        Bundle bundle = new Bundle(aVar.mo2227d());
        if (aVar.mo2229f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1862a(aVar.mo2229f()));
        }
        if (aVar.mo2226c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1862a(aVar.mo2226c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2225b());
        return bundle;
    }

    /* renamed from: a */
    static Bundle m1859a(C0373i.C0374a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat e = aVar.mo2228e();
        bundle2.putInt(RoomInstalled.ICON, e != null ? e.mo2319a() : 0);
        bundle2.putCharSequence("title", aVar.mo2232i());
        bundle2.putParcelable("actionIntent", aVar.mo2224a());
        if (aVar.mo2227d() != null) {
            bundle = new Bundle(aVar.mo2227d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2225b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m1862a(aVar.mo2229f()));
        bundle2.putBoolean("showsUserInterface", aVar.mo2231h());
        bundle2.putInt("semanticAction", aVar.mo2230g());
        return bundle2;
    }

    /* renamed from: a */
    private static Bundle m1860a(C0387m mVar) {
        new Bundle();
        mVar.mo2273a();
        throw null;
    }

    /* renamed from: a */
    private static Bundle[] m1862a(C0387m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[mVarArr.length];
        if (mVarArr.length <= 0) {
            return bundleArr;
        }
        m1860a(mVarArr[0]);
        throw null;
    }
}

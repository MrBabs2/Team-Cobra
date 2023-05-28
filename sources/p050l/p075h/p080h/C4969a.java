package p050l.p075h.p080h;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: l.h.h.a */
/* compiled from: ConnectivityManagerCompat */
public final class C4969a {
    /* renamed from: a */
    public static boolean m8802a(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 7 || type == 9) {
            return false;
        }
        return true;
    }
}

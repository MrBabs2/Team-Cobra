package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.eo */
final /* synthetic */ class C7440eo implements Callable {

    /* renamed from: f */
    private final zzcsv f15162f;

    C7440eo(zzcsv zzcsv) {
        this.f15162f = zzcsv;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        zzk.zzlg();
        zzuu i = zzk.zzlk().mo27743i().mo27786i();
        Bundle bundle = null;
        if (!(i == null || i == null || (zzk.zzlk().mo27743i().mo27784g() && zzk.zzlk().mo27743i().mo27781d()))) {
            if (i.mo29821d()) {
                i.mo29816a();
            }
            zzuo c = i.mo29820c();
            if (c != null) {
                str2 = c.mo29796c();
                str = c.mo29797d();
                str3 = c.mo29798e();
                if (str2 != null) {
                    zzk.zzlk().mo27743i().mo27778c(str2);
                }
                if (str3 != null) {
                    zzk.zzlk().mo27743i().mo27780d(str3);
                }
            } else {
                str2 = zzk.zzlk().mo27743i().mo27765a();
                str3 = zzk.zzlk().mo27743i().mo27791n();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (str3 != null && !zzk.zzlk().mo27743i().mo27781d()) {
                bundle2.putString("v_fp_vertical", str3);
            }
            if (str2 != null && !zzk.zzlk().mo27743i().mo27784g()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new zzcsu(bundle);
    }
}

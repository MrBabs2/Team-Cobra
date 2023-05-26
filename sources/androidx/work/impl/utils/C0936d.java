package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.C0834i;

/* renamed from: androidx.work.impl.utils.d */
/* compiled from: PackageManagerHelper */
public class C0936d {

    /* renamed from: a */
    private static final String f3255a = C0834i.m3721a("PackageManagerHelper");

    /* renamed from: a */
    public static void m4074a(Context context, Class<?> cls, boolean z) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C0834i a = C0834i.m3720a();
            String str3 = f3255a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            a.mo4726a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            C0834i a2 = C0834i.m3720a();
            String str4 = f3255a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            a2.mo4726a(str4, String.format("%s could not be %s", objArr2), e);
        }
    }
}

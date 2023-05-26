package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.g */
/* compiled from: numbers.kt */
public final class C12161g {
    /* renamed from: a */
    public static final C12160f m40167a(String str) {
        C10202j.m34178b(str, DonationsAnalytics.VALUE);
        if (C12130v.m40056c(str, "0x", false, 2, (Object) null) || C12130v.m40056c(str, "0X", false, 2, (Object) null)) {
            String substring = str.substring(2);
            C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new C12160f(substring, 16);
        } else if (!C12130v.m40056c(str, "0b", false, 2, (Object) null) && !C12130v.m40056c(str, "0B", false, 2, (Object) null)) {
            return new C12160f(str, 10);
        } else {
            String substring2 = str.substring(2);
            C10202j.m34174a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            return new C12160f(substring2, 2);
        }
    }
}

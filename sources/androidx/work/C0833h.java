package androidx.work;

import java.util.List;

/* renamed from: androidx.work.h */
/* compiled from: InputMerger */
public abstract class C0833h {

    /* renamed from: a */
    private static final String f2992a = C0834i.m3721a("InputMerger");

    /* renamed from: a */
    public static C0833h m3718a(String str) {
        try {
            return (C0833h) Class.forName(str).newInstance();
        } catch (Exception e) {
            C0834i a = C0834i.m3720a();
            String str2 = f2992a;
            a.mo4727b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    public abstract C0829e mo4624a(List<C0829e> list);
}

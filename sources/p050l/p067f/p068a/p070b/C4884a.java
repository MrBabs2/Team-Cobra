package p050l.p067f.p068a.p070b;

import android.view.View;

/* renamed from: l.f.a.b.a */
/* compiled from: Debug */
public class C4884a {
    /* renamed from: a */
    public static String m8255a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}

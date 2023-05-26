package p050l.p108s;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l.s.s */
/* compiled from: TransitionValues */
public class C5264s {

    /* renamed from: a */
    public final Map<String, Object> f9367a = new HashMap();

    /* renamed from: b */
    public View f9368b;

    /* renamed from: c */
    final ArrayList<C5247m> f9369c = new ArrayList<>();

    @Deprecated
    public C5264s() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5264s)) {
            return false;
        }
        C5264s sVar = (C5264s) obj;
        return this.f9368b == sVar.f9368b && this.f9367a.equals(sVar.f9367a);
    }

    public int hashCode() {
        return (this.f9368b.hashCode() * 31) + this.f9367a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f9368b + "\n") + "    values:";
        for (String next : this.f9367a.keySet()) {
            str = str + "    " + next + ": " + this.f9367a.get(next) + "\n";
        }
        return str;
    }

    public C5264s(View view) {
        this.f9368b = view;
    }
}

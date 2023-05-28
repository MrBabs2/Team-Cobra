package p050l.p075h.p084l.p085e0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l.h.l.e0.d */
/* compiled from: AccessibilityNodeProviderCompat */
public class C5038d {

    /* renamed from: a */
    private final Object f8914a;

    /* renamed from: l.h.l.e0.d$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C5039a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C5038d f8915a;

        C5039a(C5038d dVar) {
            this.f8915a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C5034c a = this.f8915a.mo17581a(i);
            if (a == null) {
                return null;
            }
            return a.mo17567w();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C5034c> a = this.f8915a.mo17580a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a.get(i2).mo17567w());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f8915a.mo17582a(i, i2, bundle);
        }
    }

    /* renamed from: l.h.l.e0.d$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C5040b extends C5039a {
        C5040b(C5038d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C5034c b = this.f8915a.mo17583b(i);
            if (b == null) {
                return null;
            }
            return b.mo17567w();
        }
    }

    public C5038d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            this.f8914a = new C5040b(this);
        } else if (i >= 16) {
            this.f8914a = new C5039a(this);
        } else {
            this.f8914a = null;
        }
    }

    /* renamed from: a */
    public Object mo17579a() {
        return this.f8914a;
    }

    /* renamed from: a */
    public List<C5034c> mo17580a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public C5034c mo17581a(int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo17582a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C5034c mo17583b(int i) {
        return null;
    }

    public C5038d(Object obj) {
        this.f8914a = obj;
    }
}

package p050l.p075h.p084l;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p050l.p075h.C4947c;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p075h.p084l.p085e0.C5038d;

/* renamed from: l.h.l.a */
/* compiled from: AccessibilityDelegateCompat */
public class C5010a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f8869c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f8870a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f8871b;

    /* renamed from: l.h.l.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C5011a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C5010a f8872a;

        C5011a(C5010a aVar) {
            this.f8872a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f8872a.mo4268a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C5038d a = this.f8872a.mo4266a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo17579a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f8872a.mo2447b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C5034c a = C5034c.m8990a(accessibilityNodeInfo);
            a.mo17550j(C5071v.m9143H(view));
            a.mo17548i(C5071v.m9138C(view));
            a.mo17538f(C5071v.m9190f(view));
            this.f8872a.mo2445a(view, a);
            a.mo17511a(accessibilityNodeInfo.getText(), view);
            List<C5034c.C5035a> b = C5010a.m8910b(view);
            for (int i = 0; i < b.size(); i++) {
                a.mo17513a(b.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f8872a.mo4271c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f8872a.mo4269a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f8872a.mo2446a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f8872a.mo4267a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f8872a.mo4273d(view, accessibilityEvent);
        }
    }

    public C5010a() {
        this(f8869c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate mo17458a() {
        return this.f8871b;
    }

    /* renamed from: b */
    public void mo2447b(View view, AccessibilityEvent accessibilityEvent) {
        this.f8870a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo4271c(View view, AccessibilityEvent accessibilityEvent) {
        this.f8870a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo4273d(View view, AccessibilityEvent accessibilityEvent) {
        this.f8870a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C5010a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f8870a = accessibilityDelegate;
        this.f8871b = new C5011a(this);
    }

    /* renamed from: b */
    static List<C5034c.C5035a> m8910b(View view) {
        List<C5034c.C5035a> list = (List) view.getTag(C4947c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public void mo4267a(View view, int i) {
        this.f8870a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public boolean mo4268a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f8870a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo2445a(View view, C5034c cVar) {
        this.f8870a.onInitializeAccessibilityNodeInfo(view, cVar.mo17567w());
    }

    /* renamed from: a */
    public boolean mo4269a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f8870a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C5038d mo4266a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f8870a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C5038d(accessibilityNodeProvider);
    }

    /* renamed from: a */
    public boolean mo2446a(View view, int i, Bundle bundle) {
        List<C5034c.C5035a> b = m8910b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C5034c.C5035a aVar = b.get(i2);
            if (aVar.mo17568a() == i) {
                z = aVar.mo17570a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f8870a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C4947c.accessibility_action_clickable_span) ? z : m8908a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: a */
    private boolean m8908a(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C4947c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m8909a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    private boolean m8909a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] i = C5034c.m9000i(view.createAccessibilityNodeInfo().getText());
            int i2 = 0;
            while (i != null && i2 < i.length) {
                if (clickableSpan.equals(i[i2])) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }
}

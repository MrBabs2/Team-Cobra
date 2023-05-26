package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p075h.p084l.p085e0.C5038d;

/* renamed from: androidx.recyclerview.widget.o */
/* compiled from: RecyclerViewAccessibilityDelegate */
public class C0714o extends C5010a {

    /* renamed from: d */
    final RecyclerView f2705d;

    /* renamed from: e */
    private final C0715a f2706e;

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C0715a extends C5010a {

        /* renamed from: d */
        final C0714o f2707d;

        /* renamed from: e */
        private Map<View, C5010a> f2708e = new WeakHashMap();

        public C0715a(C0714o oVar) {
            this.f2707d = oVar;
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            if (this.f2707d.mo4265c() || this.f2707d.f2705d.getLayoutManager() == null) {
                super.mo2445a(view, cVar);
                return;
            }
            this.f2707d.f2705d.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, cVar);
            C5010a aVar = this.f2708e.get(view);
            if (aVar != null) {
                aVar.mo2445a(view, cVar);
            } else {
                super.mo2445a(view, cVar);
            }
        }

        /* renamed from: b */
        public void mo2447b(View view, AccessibilityEvent accessibilityEvent) {
            C5010a aVar = this.f2708e.get(view);
            if (aVar != null) {
                aVar.mo2447b(view, accessibilityEvent);
            } else {
                super.mo2447b(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5010a mo4270c(View view) {
            return this.f2708e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4272d(View view) {
            C5010a b = C5071v.m9175b(view);
            if (b != null && b != this) {
                this.f2708e.put(view, b);
            }
        }

        /* renamed from: c */
        public void mo4271c(View view, AccessibilityEvent accessibilityEvent) {
            C5010a aVar = this.f2708e.get(view);
            if (aVar != null) {
                aVar.mo4271c(view, accessibilityEvent);
            } else {
                super.mo4271c(view, accessibilityEvent);
            }
        }

        /* renamed from: d */
        public void mo4273d(View view, AccessibilityEvent accessibilityEvent) {
            C5010a aVar = this.f2708e.get(view);
            if (aVar != null) {
                aVar.mo4273d(view, accessibilityEvent);
            } else {
                super.mo4273d(view, accessibilityEvent);
            }
        }

        /* renamed from: a */
        public boolean mo2446a(View view, int i, Bundle bundle) {
            if (this.f2707d.mo4265c() || this.f2707d.f2705d.getLayoutManager() == null) {
                return super.mo2446a(view, i, bundle);
            }
            C5010a aVar = this.f2708e.get(view);
            if (aVar != null) {
                if (aVar.mo2446a(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2446a(view, i, bundle)) {
                return true;
            }
            return this.f2707d.f2705d.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        /* renamed from: a */
        public void mo4267a(View view, int i) {
            C5010a aVar = this.f2708e.get(view);
            if (aVar != null) {
                aVar.mo4267a(view, i);
            } else {
                super.mo4267a(view, i);
            }
        }

        /* renamed from: a */
        public boolean mo4268a(View view, AccessibilityEvent accessibilityEvent) {
            C5010a aVar = this.f2708e.get(view);
            if (aVar != null) {
                return aVar.mo4268a(view, accessibilityEvent);
            }
            return super.mo4268a(view, accessibilityEvent);
        }

        /* renamed from: a */
        public boolean mo4269a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C5010a aVar = this.f2708e.get(viewGroup);
            if (aVar != null) {
                return aVar.mo4269a(viewGroup, view, accessibilityEvent);
            }
            return super.mo4269a(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: a */
        public C5038d mo4266a(View view) {
            C5010a aVar = this.f2708e.get(view);
            if (aVar != null) {
                return aVar.mo4266a(view);
            }
            return super.mo4266a(view);
        }
    }

    public C0714o(RecyclerView recyclerView) {
        this.f2705d = recyclerView;
        C5010a b = mo3382b();
        if (b == null || !(b instanceof C0715a)) {
            this.f2706e = new C0715a(this);
        } else {
            this.f2706e = (C0715a) b;
        }
    }

    /* renamed from: a */
    public boolean mo2446a(View view, int i, Bundle bundle) {
        if (super.mo2446a(view, i, bundle)) {
            return true;
        }
        if (mo4265c() || this.f2705d.getLayoutManager() == null) {
            return false;
        }
        return this.f2705d.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    /* renamed from: b */
    public void mo2447b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2447b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo4265c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4265c() {
        return this.f2705d.hasPendingAdapterUpdates();
    }

    /* renamed from: a */
    public void mo2445a(View view, C5034c cVar) {
        super.mo2445a(view, cVar);
        if (!mo4265c() && this.f2705d.getLayoutManager() != null) {
            this.f2705d.getLayoutManager().onInitializeAccessibilityNodeInfo(cVar);
        }
    }

    /* renamed from: b */
    public C5010a mo3382b() {
        return this.f2706e;
    }
}

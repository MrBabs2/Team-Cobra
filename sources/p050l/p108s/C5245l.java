package p050l.p108s;

import android.view.ViewGroup;

/* renamed from: l.s.l */
/* compiled from: Scene */
public class C5245l {

    /* renamed from: a */
    private ViewGroup f9304a;

    /* renamed from: b */
    private Runnable f9305b;

    /* renamed from: a */
    public void mo18068a() {
        Runnable runnable;
        if (m9799a(this.f9304a) == this && (runnable = this.f9305b) != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    static void m9800a(ViewGroup viewGroup, C5245l lVar) {
        viewGroup.setTag(C5238j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public static C5245l m9799a(ViewGroup viewGroup) {
        return (C5245l) viewGroup.getTag(C5238j.transition_current_scene);
    }
}

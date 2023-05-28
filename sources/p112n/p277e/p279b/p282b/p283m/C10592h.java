package p112n.p277e.p279b.p282b.p283m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p050l.p066e.C4881g;

/* renamed from: n.e.b.b.m.h */
/* compiled from: MotionSpec */
public class C10592h {

    /* renamed from: a */
    private final C4881g<String, C10593i> f28469a = new C4881g<>();

    /* renamed from: b */
    private final C4881g<String, PropertyValuesHolder[]> f28470b = new C4881g<>();

    /* renamed from: a */
    public C10593i mo36136a(String str) {
        if (mo36139b(str)) {
            return this.f28469a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public boolean mo36139b(String str) {
        return this.f28469a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10592h)) {
            return false;
        }
        return this.f28469a.equals(((C10592h) obj).f28469a);
    }

    public int hashCode() {
        return this.f28469a.hashCode();
    }

    public String toString() {
        return 10 + C10592h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f28469a + "}\n";
    }

    /* renamed from: a */
    public void mo36137a(String str, C10593i iVar) {
        this.f28469a.put(str, iVar);
    }

    /* renamed from: a */
    public void mo36138a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f28470b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: a */
    public long mo36135a() {
        int size = this.f28469a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C10593i d = this.f28469a.mo17028d(i);
            j = Math.max(j, d.mo36143a() + d.mo36145b());
        }
        return j;
    }

    /* renamed from: a */
    public static C10592h m35879a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m35878a(context, resourceId);
    }

    /* renamed from: a */
    public static C10592h m35878a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m35880a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m35880a((List<Animator>) arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: a */
    private static C10592h m35880a(List<Animator> list) {
        C10592h hVar = new C10592h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m35881a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m35881a(C10592h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo36138a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo36137a(objectAnimator.getPropertyName(), C10593i.m35887a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }
}

package p050l.p108s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p050l.p108s.C5200a;
import p050l.p108s.C5247m;

/* renamed from: l.s.j0 */
/* compiled from: Visibility */
public abstract class C5239j0 extends C5247m {

    /* renamed from: P */
    private static final String[] f9284P = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: O */
    private int f9285O = 3;

    /* renamed from: l.s.j0$a */
    /* compiled from: Visibility */
    class C5240a extends C5255n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f9286a;

        /* renamed from: b */
        final /* synthetic */ View f9287b;

        /* renamed from: c */
        final /* synthetic */ View f9288c;

        C5240a(ViewGroup viewGroup, View view, View view2) {
            this.f9286a = viewGroup;
            this.f9287b = view;
            this.f9288c = view2;
        }

        /* renamed from: b */
        public void mo18025b(C5247m mVar) {
            C5269x.m9919a(this.f9286a).mo18127b(this.f9287b);
        }

        /* renamed from: c */
        public void mo18026c(C5247m mVar) {
            this.f9288c.setTag(C5238j.save_overlay_view, (Object) null);
            C5269x.m9919a(this.f9286a).mo18127b(this.f9287b);
            mVar.mo18086b((C5247m.C5253f) this);
        }

        /* renamed from: e */
        public void mo18028e(C5247m mVar) {
            if (this.f9287b.getParent() == null) {
                C5269x.m9919a(this.f9286a).mo18126a(this.f9287b);
            } else {
                C5239j0.this.cancel();
            }
        }
    }

    /* renamed from: l.s.j0$c */
    /* compiled from: Visibility */
    private static class C5242c {

        /* renamed from: a */
        boolean f9296a;

        /* renamed from: b */
        boolean f9297b;

        /* renamed from: c */
        int f9298c;

        /* renamed from: d */
        int f9299d;

        /* renamed from: e */
        ViewGroup f9300e;

        /* renamed from: f */
        ViewGroup f9301f;

        C5242c() {
        }
    }

    /* renamed from: b */
    private C5242c m9776b(C5264s sVar, C5264s sVar2) {
        C5242c cVar = new C5242c();
        cVar.f9296a = false;
        cVar.f9297b = false;
        if (sVar == null || !sVar.f9367a.containsKey("android:visibility:visibility")) {
            cVar.f9298c = -1;
            cVar.f9300e = null;
        } else {
            cVar.f9298c = ((Integer) sVar.f9367a.get("android:visibility:visibility")).intValue();
            cVar.f9300e = (ViewGroup) sVar.f9367a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f9367a.containsKey("android:visibility:visibility")) {
            cVar.f9299d = -1;
            cVar.f9301f = null;
        } else {
            cVar.f9299d = ((Integer) sVar2.f9367a.get("android:visibility:visibility")).intValue();
            cVar.f9301f = (ViewGroup) sVar2.f9367a.get("android:visibility:parent");
        }
        if (sVar == null || sVar2 == null) {
            if (sVar == null && cVar.f9299d == 0) {
                cVar.f9297b = true;
                cVar.f9296a = true;
            } else if (sVar2 == null && cVar.f9298c == 0) {
                cVar.f9297b = false;
                cVar.f9296a = true;
            }
        } else if (cVar.f9298c == cVar.f9299d && cVar.f9300e == cVar.f9301f) {
            return cVar;
        } else {
            int i = cVar.f9298c;
            int i2 = cVar.f9299d;
            if (i != i2) {
                if (i == 0) {
                    cVar.f9297b = false;
                    cVar.f9296a = true;
                } else if (i2 == 0) {
                    cVar.f9297b = true;
                    cVar.f9296a = true;
                }
            } else if (cVar.f9301f == null) {
                cVar.f9297b = false;
                cVar.f9296a = true;
            } else if (cVar.f9300e == null) {
                cVar.f9297b = true;
                cVar.f9296a = true;
            }
        }
        return cVar;
    }

    /* renamed from: d */
    private void m9777d(C5264s sVar) {
        sVar.f9367a.put("android:visibility:visibility", Integer.valueOf(sVar.f9368b.getVisibility()));
        sVar.f9367a.put("android:visibility:parent", sVar.f9368b.getParent());
        int[] iArr = new int[2];
        sVar.f9368b.getLocationOnScreen(iArr);
        sVar.f9367a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public abstract Animator mo18039a(ViewGroup viewGroup, View view, C5264s sVar, C5264s sVar2);

    /* renamed from: a */
    public void mo18057a(int i) {
        if ((i & -4) == 0) {
            this.f9285O = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: b */
    public abstract Animator mo18040b(ViewGroup viewGroup, View view, C5264s sVar, C5264s sVar2);

    /* renamed from: c */
    public void mo17996c(C5264s sVar) {
        m9777d(sVar);
    }

    /* renamed from: q */
    public String[] mo17997q() {
        return f9284P;
    }

    /* renamed from: a */
    public void mo17995a(C5264s sVar) {
        m9777d(sVar);
    }

    /* renamed from: a */
    public Animator mo17994a(ViewGroup viewGroup, C5264s sVar, C5264s sVar2) {
        C5242c b = m9776b(sVar, sVar2);
        if (!b.f9296a) {
            return null;
        }
        if (b.f9300e == null && b.f9301f == null) {
            return null;
        }
        if (b.f9297b) {
            return mo18056a(viewGroup, sVar, b.f9298c, sVar2, b.f9299d);
        }
        return mo18059b(viewGroup, sVar, b.f9298c, sVar2, b.f9299d);
    }

    /* renamed from: l.s.j0$b */
    /* compiled from: Visibility */
    private static class C5241b extends AnimatorListenerAdapter implements C5247m.C5253f, C5200a.C5201a {

        /* renamed from: a */
        private final View f9290a;

        /* renamed from: b */
        private final int f9291b;

        /* renamed from: c */
        private final ViewGroup f9292c;

        /* renamed from: d */
        private final boolean f9293d;

        /* renamed from: e */
        private boolean f9294e;

        /* renamed from: f */
        boolean f9295f = false;

        C5241b(View view, int i, boolean z) {
            this.f9290a = view;
            this.f9291b = i;
            this.f9292c = (ViewGroup) view.getParent();
            this.f9293d = z;
            m9792a(true);
        }

        /* renamed from: a */
        private void m9791a() {
            if (!this.f9295f) {
                C5217c0.m9707a(this.f9290a, this.f9291b);
                ViewGroup viewGroup = this.f9292c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m9792a(false);
        }

        /* renamed from: a */
        public void mo18047a(C5247m mVar) {
        }

        /* renamed from: b */
        public void mo18025b(C5247m mVar) {
            m9792a(false);
        }

        /* renamed from: c */
        public void mo18026c(C5247m mVar) {
            m9791a();
            mVar.mo18086b((C5247m.C5253f) this);
        }

        /* renamed from: d */
        public void mo18027d(C5247m mVar) {
        }

        /* renamed from: e */
        public void mo18028e(C5247m mVar) {
            m9792a(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f9295f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m9791a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f9295f) {
                C5217c0.m9707a(this.f9290a, this.f9291b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f9295f) {
                C5217c0.m9707a(this.f9290a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private void m9792a(boolean z) {
            ViewGroup viewGroup;
            if (this.f9293d && this.f9294e != z && (viewGroup = this.f9292c) != null) {
                this.f9294e = z;
                C5269x.m9921b(viewGroup, z);
            }
        }
    }

    /* renamed from: a */
    public Animator mo18056a(ViewGroup viewGroup, C5264s sVar, int i, C5264s sVar2, int i2) {
        if ((this.f9285O & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f9368b.getParent();
            if (m9776b(mo18076a(view, false), mo18087b(view, false)).f9296a) {
                return null;
            }
        }
        return mo18039a(viewGroup, sVar2.f9368b, sVar, sVar2);
    }

    /* renamed from: a */
    public boolean mo18058a(C5264s sVar, C5264s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f9367a.containsKey("android:visibility:visibility") != sVar.f9367a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C5242c b = m9776b(sVar, sVar2);
        if (!b.f9296a) {
            return false;
        }
        if (b.f9298c == 0 || b.f9299d == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10.f9310A != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo18059b(android.view.ViewGroup r11, p050l.p108s.C5264s r12, int r13, p050l.p108s.C5264s r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.f9285O
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.f9368b
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.f9368b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = p050l.p108s.C5238j.save_overlay_view
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = 1
            goto L_0x0089
        L_0x0023:
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x003b
        L_0x0032:
            r3 = r2
            r6 = 0
            r2 = r1
            goto L_0x003e
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r3 = r1
            r6 = 0
            goto L_0x003e
        L_0x003b:
            r2 = r1
            r3 = r2
            r6 = 1
        L_0x003e:
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0081
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            l.s.s r7 = r10.mo18087b((android.view.View) r6, (boolean) r5)
            l.s.s r8 = r10.mo18076a((android.view.View) r6, (boolean) r5)
            l.s.j0$c r7 = r10.m9776b(r7, r8)
            boolean r7 = r7.f9296a
            if (r7 != 0) goto L_0x006a
            android.view.View r2 = p050l.p108s.C5263r.m9909a(r11, r13, r6)
            goto L_0x0085
        L_0x006a:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0085
            r6 = -1
            if (r7 == r6) goto L_0x0085
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0085
            boolean r6 = r10.f9310A
            if (r6 == 0) goto L_0x0085
        L_0x0081:
            r2 = r3
            r6 = 0
            r3 = r13
            goto L_0x0089
        L_0x0085:
            r6 = 0
            r9 = r3
            r3 = r2
            r2 = r9
        L_0x0089:
            if (r3 == 0) goto L_0x00db
            if (r6 != 0) goto L_0x00bd
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.f9367a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            l.s.w r15 = p050l.p108s.C5269x.m9919a(r11)
            r15.mo18126a(r3)
        L_0x00bd:
            android.animation.Animator r12 = r10.mo18040b(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00da
            if (r12 != 0) goto L_0x00cd
            l.s.w r11 = p050l.p108s.C5269x.m9919a(r11)
            r11.mo18127b(r3)
            goto L_0x00da
        L_0x00cd:
            int r14 = p050l.p108s.C5238j.save_overlay_view
            r13.setTag(r14, r3)
            l.s.j0$a r14 = new l.s.j0$a
            r14.<init>(r11, r3, r13)
            r10.mo18075a((p050l.p108s.C5247m.C5253f) r14)
        L_0x00da:
            return r12
        L_0x00db:
            if (r2 == 0) goto L_0x00fd
            int r13 = r2.getVisibility()
            p050l.p108s.C5217c0.m9707a((android.view.View) r2, (int) r4)
            android.animation.Animator r11 = r10.mo18040b(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x00f9
            l.s.j0$b r12 = new l.s.j0$b
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            p050l.p108s.C5200a.m9673a(r11, r12)
            r10.mo18075a((p050l.p108s.C5247m.C5253f) r12)
            goto L_0x00fc
        L_0x00f9:
            p050l.p108s.C5217c0.m9707a((android.view.View) r2, (int) r13)
        L_0x00fc:
            return r11
        L_0x00fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p108s.C5239j0.mo18059b(android.view.ViewGroup, l.s.s, int, l.s.s, int):android.animation.Animator");
    }
}

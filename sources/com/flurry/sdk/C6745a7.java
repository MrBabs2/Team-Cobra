package com.flurry.sdk;

import android.os.FileObserver;

/* renamed from: com.flurry.sdk.a7 */
public final class C6745a7 extends FileObserver {

    /* renamed from: a */
    private C7094y6 f12550a;

    /* renamed from: b */
    private String f12551b;

    public C6745a7(String str, C7094y6 y6Var) {
        super(str);
        this.f12551b = str;
        this.f12550a = y6Var;
    }

    public final void onEvent(int i, String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            if ((i & 8) != 0) {
                sb.append(this.f12551b + "/" + str + " is written and closed\n");
                StringBuilder sb2 = new StringBuilder("Observer triggered ");
                sb2.append(sb.toString());
                C6792d1.m14476a(3, "VNodeObserver", sb2.toString());
                this.f12550a.mo23740a(str);
            }
        }
    }
}

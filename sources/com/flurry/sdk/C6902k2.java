package com.flurry.sdk;

import com.flurry.sdk.C6826g0;
import com.flurry.sdk.C6868i2;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.flurry.sdk.k2 */
public final class C6902k2 extends C6916l2 implements C7055v6 {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public PriorityQueue<String> f12932n;

    /* renamed from: com.flurry.sdk.k2$a */
    class C6903a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ List f12933h;

        C6903a(List list) {
            this.f12933h = list;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6902k2.this.f12932n.addAll(this.f12933h);
            C6902k2.this.m14662c();
        }
    }

    public C6902k2() {
        super("FrameLogTestHandler", C6868i2.m14604a(C6868i2.C6870b.CORE));
        this.f12932n = null;
        this.f12932n = new PriorityQueue<>(4, new C7017s2());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m14662c() {
        C6792d1.m14483b("FrameLogTestHandler", " Starting processNextFile " + this.f12932n.size());
        if (this.f12932n.peek() == null) {
            C6792d1.m14483b("FrameLogTestHandler", "No file present to process.");
            return;
        }
        String poll = this.f12932n.poll();
        if (C6988q2.m14843b(poll)) {
            File file = new File(poll);
            File a = C6749b2.m14389a();
            boolean a2 = C7084x6.m15027a(file, new File(a.toString() + File.separator + "fCompletedInApp", String.format(Locale.US, "completedInApp-%d", new Object[]{Long.valueOf(System.currentTimeMillis())})));
            if (a2) {
                a2 = file.delete();
            }
            m14660a(poll, a2);
        }
    }

    /* renamed from: a */
    public final void mo23570a() {
    }

    /* renamed from: a */
    public final void mo23624a(List<String> list) {
        if (list.size() == 0) {
            C6792d1.m14483b("FrameLogTestHandler", "File List is null or empty");
            return;
        }
        C6792d1.m14483b("FrameLogTestHandler", "Number of files being added:" + list.toString());
        mo23563c(new C6903a(list));
    }

    /* renamed from: b */
    public final C6826g0.C6829c mo23625b() {
        C6826g0.C6829c cVar = new C6826g0.C6829c();
        cVar.mo23593a(this.f12932n.size());
        return cVar;
    }

    /* renamed from: a */
    private synchronized void m14660a(String str, boolean z) {
        C6792d1.m14483b("FrameLogTestHandler", "File move to test folder for file: " + str + " fileMoved:" + z);
        boolean a = C6988q2.m14841a(str);
        C6792d1.m14476a(2, "FrameLogTestHandler", "Deleting file " + str + " deleted " + a);
        m14662c();
    }
}

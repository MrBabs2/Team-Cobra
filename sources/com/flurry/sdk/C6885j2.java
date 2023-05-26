package com.flurry.sdk;

import com.flurry.sdk.C6826g0;
import com.flurry.sdk.C6868i2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.flurry.sdk.j2 */
public final class C6885j2 extends C6916l2 implements C7055v6 {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public PriorityQueue<String> f12875n;

    /* renamed from: o */
    private C6962p0 f12876o;

    /* renamed from: p */
    private C6962p0 f12877p;

    /* renamed from: com.flurry.sdk.j2$a */
    class C6886a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ List f12878h;

        C6886a(List list) {
            this.f12878h = list;
        }

        /* renamed from: a */
        public final void mo23531a() throws Exception {
            C6885j2.this.f12875n.addAll(this.f12878h);
            C6885j2.this.m14632c();
        }
    }

    /* renamed from: com.flurry.sdk.j2$b */
    class C6887b implements C6950o0 {
        C6887b(C6885j2 j2Var) {
        }

        /* renamed from: a */
        public final void mo23626a() {
            C6925m2.m14707a().mo23649a(new C6811e6(new C6822f6(true)));
        }

        /* renamed from: b */
        public final void mo23627b() {
            C6925m2.m14707a().mo23649a(new C6811e6(new C6822f6(false)));
        }
    }

    public C6885j2() {
        super("FrameLogDataSender", C6868i2.m14604a(C6868i2.C6870b.CORE));
        this.f12875n = null;
        this.f12875n = new PriorityQueue<>(4, new C7017s2());
        this.f12876o = new C7035u0();
        this.f12877p = new C7025t0();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m14632c() {
        C6792d1.m14485c("FrameLogDataSender", " Starting processNextFile " + this.f12875n.size());
        if (this.f12875n.peek() == null) {
            C6792d1.m14485c("FrameLogDataSender", "No file present to process.");
            return;
        }
        String poll = this.f12875n.poll();
        if (C6988q2.m14843b(poll)) {
            C6792d1.m14485c("FrameLogDataSender", "Starting to upload file: ".concat(String.valueOf(poll)));
            byte[] bArr = new byte[0];
            try {
                bArr = m14630a(new File(poll));
            } catch (IOException e) {
                C6792d1.m14476a(6, "FrameLogDataSender", "Error in getting bytes form the file: " + e.getMessage());
            }
            String a = C6896k0.m14646c().mo23630a();
            StringBuilder sb = new StringBuilder();
            C6934n0.m14722b();
            sb.append(328);
            this.f12876o.mo23680a(bArr, a, sb.toString());
            this.f12876o.mo23679a((C6950o0) new C6887b(this));
            m14628a(poll);
            C6792d1.m14485c("FrameLogDataSender", "File appended for upload: ".concat(String.valueOf(poll)));
            return;
        }
        C6792d1.m14476a(6, "FrameLogDataSender", "Something wrong with the file. File does not exist.");
    }

    /* renamed from: a */
    public final void mo23570a() {
        this.f12876o.mo23570a();
        this.f12877p.mo23570a();
    }

    /* renamed from: b */
    public final C6826g0.C6829c mo23625b() {
        C6962p0 p0Var = this.f12876o;
        C6826g0.C6829c cVar = new C6826g0.C6829c();
        for (String d : p0Var.f13076r.mo23703a()) {
            cVar.mo23593a(p0Var.f13076r.mo23709d(d).size());
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo23624a(List<String> list) {
        if (list.size() == 0) {
            C6792d1.m14476a(6, "FrameLogDataSender", "File List is null or empty");
            return;
        }
        C6792d1.m14485c("FrameLogDataSender", "Number of files being added:" + list.toString());
        mo23563c(new C6886a(list));
    }

    /* renamed from: a */
    private static byte[] m14630a(File file) throws IOException {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr, 0, length);
            if (read < length) {
                int i = length - read;
                while (i > 0) {
                    int read2 = fileInputStream.read(bArr2, 0, i);
                    System.arraycopy(bArr2, 0, bArr, length - i, read2);
                    i -= read2;
                }
            }
        } catch (IOException e) {
            C6792d1.m14476a(6, "FrameLogDataSender", "Error reading file. ".concat(String.valueOf(e)));
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
        fileInputStream.close();
        return bArr;
    }

    /* renamed from: a */
    private synchronized void m14628a(String str) {
        C6792d1.m14485c("FrameLogDataSender", "File upload status: ".concat(String.valueOf(str)));
        boolean a = C6988q2.m14841a(str);
        C6792d1.m14476a(2, "FrameLogDataSender", "Deleting file " + str + " deleted " + a);
        m14632c();
    }
}

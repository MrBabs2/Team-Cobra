package p413s;

import kotlin.jvm.internal.C10202j;

/* renamed from: s.s */
/* compiled from: PeekSource.kt */
public final class C12923s implements C12892a0 {

    /* renamed from: f */
    private final C12905f f33180f;

    /* renamed from: g */
    private C12927v f33181g;

    /* renamed from: h */
    private int f33182h;

    /* renamed from: i */
    private boolean f33183i;

    /* renamed from: j */
    private long f33184j;

    /* renamed from: k */
    private final C12910h f33185k;

    public C12923s(C12910h hVar) {
        C10202j.m34178b(hVar, "upstream");
        this.f33185k = hVar;
        C12905f buffer = hVar.getBuffer();
        this.f33180f = buffer;
        C12927v vVar = buffer.f33148f;
        this.f33181g = vVar;
        this.f33182h = vVar != null ? vVar.f33194b : -1;
    }

    public void close() {
        this.f33183i = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0 == r3.f33194b) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long read(p413s.C12905f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C10202j.m34178b(r9, r0)
            boolean r0 = r8.f33183i
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0076
            s.v r0 = r8.f33181g
            r2 = 0
            if (r0 == 0) goto L_0x0024
            s.f r3 = r8.f33180f
            s.v r3 = r3.f33148f
            if (r0 != r3) goto L_0x0023
            int r0 = r8.f33182h
            if (r3 == 0) goto L_0x001f
            int r3 = r3.f33194b
            if (r0 != r3) goto L_0x0023
            goto L_0x0024
        L_0x001f:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r2
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x006a
            s.h r0 = r8.f33185k
            long r3 = r8.f33184j
            long r3 = r3 + r10
            r0.request(r3)
            s.v r0 = r8.f33181g
            if (r0 != 0) goto L_0x0045
            s.f r0 = r8.f33180f
            s.v r0 = r0.f33148f
            if (r0 == 0) goto L_0x0045
            r8.f33181g = r0
            if (r0 == 0) goto L_0x0041
            int r0 = r0.f33194b
            r8.f33182h = r0
            goto L_0x0045
        L_0x0041:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r2
        L_0x0045:
            s.f r0 = r8.f33180f
            long r0 = r0.size()
            long r2 = r8.f33184j
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x005b
            r9 = -1
            return r9
        L_0x005b:
            s.f r2 = r8.f33180f
            long r4 = r8.f33184j
            r3 = r9
            r6 = r10
            r2.mo41145a((p413s.C12905f) r3, (long) r4, (long) r6)
            long r0 = r8.f33184j
            long r0 = r0 + r10
            r8.f33184j = r0
            return r10
        L_0x006a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0076:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p413s.C12923s.read(s.f, long):long");
    }

    public C12894b0 timeout() {
        return this.f33185k.timeout();
    }
}

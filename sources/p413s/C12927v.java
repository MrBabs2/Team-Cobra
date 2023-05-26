package p413s;

import java.util.Arrays;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0000J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo16641d2 = {"Lokio/Segment;", "", "()V", "data", "", "pos", "", "limit", "shared", "", "owner", "([BIIZZ)V", "next", "prev", "compact", "", "pop", "push", "segment", "sharedCopy", "split", "byteCount", "unsharedCopy", "writeTo", "sink", "Companion", "jvm"}, mo16642k = 1, mo16643mv = {1, 1, 11})
/* renamed from: s.v */
/* compiled from: Segment.kt */
public final class C12927v {

    /* renamed from: a */
    public final byte[] f33193a;

    /* renamed from: b */
    public int f33194b;

    /* renamed from: c */
    public int f33195c;

    /* renamed from: d */
    public boolean f33196d;

    /* renamed from: e */
    public boolean f33197e;

    /* renamed from: f */
    public C12927v f33198f;

    /* renamed from: g */
    public C12927v f33199g;

    /* renamed from: s.v$a */
    /* compiled from: Segment.kt */
    public static final class C12928a {
        private C12928a() {
        }

        public /* synthetic */ C12928a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C12928a((DefaultConstructorMarker) null);
    }

    public C12927v() {
        this.f33193a = new byte[8192];
        this.f33197e = true;
        this.f33196d = false;
    }

    /* renamed from: a */
    public final C12927v mo41294a(C12927v vVar) {
        C10202j.m34178b(vVar, "segment");
        vVar.f33199g = this;
        vVar.f33198f = this.f33198f;
        C12927v vVar2 = this.f33198f;
        if (vVar2 != null) {
            vVar2.f33199g = vVar;
            this.f33198f = vVar;
            return vVar;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: b */
    public final C12927v mo41297b() {
        C12927v vVar = this.f33198f;
        if (vVar == this) {
            vVar = null;
        }
        C12927v vVar2 = this.f33199g;
        if (vVar2 != null) {
            vVar2.f33198f = this.f33198f;
            C12927v vVar3 = this.f33198f;
            if (vVar3 != null) {
                vVar3.f33199g = vVar2;
                this.f33198f = null;
                this.f33199g = null;
                return vVar;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: c */
    public final C12927v mo41298c() {
        this.f33196d = true;
        return new C12927v(this.f33193a, this.f33194b, this.f33195c, true, false);
    }

    /* renamed from: d */
    public final C12927v mo41299d() {
        byte[] bArr = this.f33193a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C10202j.m34174a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C12927v(copyOf, this.f33194b, this.f33195c, false, true);
    }

    public C12927v(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C10202j.m34178b(bArr, "data");
        this.f33193a = bArr;
        this.f33194b = i;
        this.f33195c = i2;
        this.f33196d = z;
        this.f33197e = z2;
    }

    /* renamed from: a */
    public final C12927v mo41293a(int i) {
        C12927v vVar;
        if (i > 0 && i <= this.f33195c - this.f33194b) {
            if (i >= 1024) {
                vVar = mo41298c();
            } else {
                C12927v a = C12929w.m41738a();
                C12893b.m41507a(this.f33193a, this.f33194b, a.f33193a, 0, i);
                vVar = a;
            }
            vVar.f33195c = vVar.f33194b + i;
            this.f33194b += i;
            C12927v vVar2 = this.f33199g;
            if (vVar2 != null) {
                vVar2.mo41294a(vVar);
                return vVar;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: a */
    public final void mo41295a() {
        int i = 0;
        if (this.f33199g != this) {
            C12927v vVar = this.f33199g;
            if (vVar == null) {
                C10202j.m34172a();
                throw null;
            } else if (vVar.f33197e) {
                int i2 = this.f33195c - this.f33194b;
                if (vVar != null) {
                    int i3 = 8192 - vVar.f33195c;
                    if (vVar != null) {
                        if (!vVar.f33196d) {
                            if (vVar != null) {
                                i = vVar.f33194b;
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                        if (i2 <= i3 + i) {
                            C12927v vVar2 = this.f33199g;
                            if (vVar2 != null) {
                                mo41296a(vVar2, i2);
                                mo41297b();
                                C12929w.m41739a(this);
                                return;
                            }
                            C10202j.m34172a();
                            throw null;
                        }
                        return;
                    }
                    C10202j.m34172a();
                    throw null;
                }
                C10202j.m34172a();
                throw null;
            }
        } else {
            throw new IllegalStateException("cannot compact".toString());
        }
    }

    /* renamed from: a */
    public final void mo41296a(C12927v vVar, int i) {
        C10202j.m34178b(vVar, "sink");
        if (vVar.f33197e) {
            int i2 = vVar.f33195c;
            if (i2 + i > 8192) {
                if (!vVar.f33196d) {
                    int i3 = vVar.f33194b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = vVar.f33193a;
                        C12893b.m41507a(bArr, i3, bArr, 0, i2 - i3);
                        vVar.f33195c -= vVar.f33194b;
                        vVar.f33194b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            C12893b.m41507a(this.f33193a, this.f33194b, vVar.f33193a, vVar.f33195c, i);
            vVar.f33195c += i;
            this.f33194b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}

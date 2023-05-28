package kotlinx.coroutines;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9057a;
import kotlin.p042a0.C9069g;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo16641d2 = {"Lkotlinx/coroutines/CoroutineName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Key", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.c0 */
/* compiled from: CoroutineName.kt */
public final class C12184c0 extends C9057a {

    /* renamed from: g */
    public static final C12185a f31954g = new C12185a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final String f31955f;

    /* renamed from: kotlinx.coroutines.c0$a */
    /* compiled from: CoroutineName.kt */
    public static final class C12185a implements C9069g.C9074c<C12184c0> {
        private C12185a() {
        }

        public /* synthetic */ C12185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C12184c0) && C10202j.m34176a((Object) this.f31955f, (Object) ((C12184c0) obj).f31955f);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f31955f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: m */
    public final String mo38842m() {
        return this.f31955f;
    }

    public String toString() {
        return "CoroutineName(" + this.f31955f + ')';
    }
}

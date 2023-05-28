package kotlin.p045h0.p046u.p047e.p048k0.p240d.p241w0;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9868a;
import kotlin.p220g0.C9146c;
import kotlin.p262y.C10507e0;

/* renamed from: kotlin.h0.u.e.k0.d.w0.a */
/* compiled from: BuiltInsBinaryVersion.kt */
public final class C9864a extends C9868a {

    /* renamed from: f */
    public static final C9864a f27207f = new C9864a(1, 0, 7);

    /* renamed from: g */
    public static final C9865a f27208g = new C9865a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.k0.d.w0.a$a */
    /* compiled from: BuiltInsBinaryVersion.kt */
    public static final class C9865a {
        private C9865a() {
        }

        /* renamed from: a */
        public final C9864a mo34839a(InputStream inputStream) {
            C10202j.m34178b(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C9146c cVar = new C9146c(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C10531p.m35750a(cVar, 10));
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                ((C10507e0) it).mo33492a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] b = C10539w.m35784b((Collection<Integer>) arrayList);
            return new C9864a(Arrays.copyOf(b, b.length));
        }

        public /* synthetic */ C9865a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9864a(new int[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9864a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C10202j.m34178b(iArr, "numbers");
    }

    /* renamed from: d */
    public boolean mo34838d() {
        return mo34844b(f27207f);
    }
}

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* compiled from: AbstractMessageLite */
public abstract class C10410a implements C10449o {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C10411a<BuilderType extends C10411a> implements C10449o.C10450a {
        /* renamed from: a */
        public abstract BuilderType m35209a(C10420e eVar, C10422f fVar) throws IOException;

        /* renamed from: a */
        protected static UninitializedMessageException m35207a(C10449o oVar) {
            return new UninitializedMessageException(oVar);
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a */
        /* compiled from: AbstractMessageLite */
        static final class C10412a extends FilterInputStream {

            /* renamed from: f */
            private int f28209f;

            C10412a(InputStream inputStream, int i) {
                super(inputStream);
                this.f28209f = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f28209f);
            }

            public int read() throws IOException {
                if (this.f28209f <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f28209f--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f28209f));
                if (skip >= 0) {
                    this.f28209f = (int) (((long) this.f28209f) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f28209f;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f28209f -= read;
                }
                return read;
            }
        }
    }

    /* renamed from: a */
    public void mo35659a(OutputStream outputStream) throws IOException {
        int e = mo34361e();
        CodedOutputStream a = CodedOutputStream.m35116a(outputStream, CodedOutputStream.m35142m(CodedOutputStream.m35144n(e) + e));
        a.mo35650f(e);
        mo34358a(a);
        a.mo35614a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public UninitializedMessageException mo35660d() {
        return new UninitializedMessageException(this);
    }
}

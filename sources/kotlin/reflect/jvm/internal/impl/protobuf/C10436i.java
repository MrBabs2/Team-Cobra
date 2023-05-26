package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i */
/* compiled from: Internal */
public class C10436i {

    /* renamed from: a */
    public static final byte[] f28265a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$a */
    /* compiled from: Internal */
    public interface C10437a {
        /* renamed from: b */
        int mo34424b();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$b */
    /* compiled from: Internal */
    public interface C10438b<T extends C10437a> {
        /* renamed from: a */
        T mo34425a(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f28265a = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static boolean m35376a(byte[] bArr) {
        return C10471v.m35484a(bArr);
    }

    /* renamed from: b */
    public static String m35377b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}

package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import java.util.Arrays;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.h.m.e */
/* compiled from: constantValues.kt */
public final class C10035e extends C10054p<Character> {
    public C10035e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: b */
    private final boolean m33812b(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) mo35244a()).charValue()), m33811a(((Character) mo35244a()).charValue())}, 2));
        C10202j.m34174a((Object) format, "java.lang.String.format(this, *args)");
        return format;
    }

    /* renamed from: a */
    public C11901j0 m33814a(C10393y yVar) {
        C10202j.m34178b(yVar, "module");
        C11901j0 i = yVar.mo35561l().mo33713i();
        C10202j.m34174a((Object) i, "module.builtIns.charType");
        return i;
    }

    /* renamed from: a */
    private final String m33811a(char c) {
        switch (c) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 12:
                return "\\f";
            case 13:
                return "\\r";
            default:
                return m33812b(c) ? String.valueOf(c) : "?";
        }
    }
}

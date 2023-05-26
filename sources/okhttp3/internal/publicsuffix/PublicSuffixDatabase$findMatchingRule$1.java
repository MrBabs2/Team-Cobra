package okhttp3.internal.publicsuffix;

import kotlin.C4789l;
import kotlin.jvm.internal.C10204l;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;

@C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: PublicSuffixDatabase.kt */
final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends C10204l {
    PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase);
    }

    public Object get() {
        return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
    }

    public String getName() {
        return "publicSuffixListBytes";
    }

    public C9156e getOwner() {
        return C10216x.m34186a(PublicSuffixDatabase.class);
    }

    public String getSignature() {
        return "getPublicSuffixListBytes()[B";
    }

    public void set(Object obj) {
        ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
    }
}

package p015cm.aptoide.p016pt.donations;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/donations/Donation;", "", "domain", "", "owner", "appc", "", "(Ljava/lang/String;Ljava/lang/String;F)V", "getAppc", "()F", "getDomain", "()Ljava/lang/String;", "getOwner", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.donations.Donation */
/* compiled from: Donation.kt */
public final class Donation {
    private final float appc;
    private final String domain;
    private final String owner;

    public Donation(String str, String str2, float f) {
        C10202j.m34178b(str, "domain");
        C10202j.m34178b(str2, "owner");
        this.domain = str;
        this.owner = str2;
        this.appc = f;
    }

    public final float getAppc() {
        return this.appc;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getOwner() {
        return this.owner;
    }
}

package p015cm.aptoide.p016pt.download.view.outofspace;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigatorWrapper;", "", "clearedSuccessfully", "", "packageName", "", "(ZLjava/lang/String;)V", "getClearedSuccessfully", "()Z", "getPackageName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceNavigatorWrapper */
/* compiled from: OutOfSpaceNavigatorWrapper.kt */
public final class OutOfSpaceNavigatorWrapper {
    private final boolean clearedSuccessfully;
    private final String packageName;

    public OutOfSpaceNavigatorWrapper(boolean z, String str) {
        C10202j.m34178b(str, "packageName");
        this.clearedSuccessfully = z;
        this.packageName = str;
    }

    public static /* synthetic */ OutOfSpaceNavigatorWrapper copy$default(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = outOfSpaceNavigatorWrapper.clearedSuccessfully;
        }
        if ((i & 2) != 0) {
            str = outOfSpaceNavigatorWrapper.packageName;
        }
        return outOfSpaceNavigatorWrapper.copy(z, str);
    }

    public final boolean component1() {
        return this.clearedSuccessfully;
    }

    public final String component2() {
        return this.packageName;
    }

    public final OutOfSpaceNavigatorWrapper copy(boolean z, String str) {
        C10202j.m34178b(str, "packageName");
        return new OutOfSpaceNavigatorWrapper(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutOfSpaceNavigatorWrapper)) {
            return false;
        }
        OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper = (OutOfSpaceNavigatorWrapper) obj;
        return this.clearedSuccessfully == outOfSpaceNavigatorWrapper.clearedSuccessfully && C10202j.m34176a((Object) this.packageName, (Object) outOfSpaceNavigatorWrapper.packageName);
    }

    public final boolean getClearedSuccessfully() {
        return this.clearedSuccessfully;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        boolean z = this.clearedSuccessfully;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.packageName;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "OutOfSpaceNavigatorWrapper(clearedSuccessfully=" + this.clearedSuccessfully + ", packageName=" + this.packageName + ")";
    }
}

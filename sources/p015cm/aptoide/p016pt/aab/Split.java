package p015cm.aptoide.p016pt.aab;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/aab/Split;", "", "name", "", "type", "path", "filesize", "", "md5sum", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getFilesize", "()J", "getMd5sum", "()Ljava/lang/String;", "getName", "getPath", "getType", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.aab.Split */
/* compiled from: Split.kt */
public final class Split {
    private final long filesize;
    private final String md5sum;
    private final String name;
    private final String path;
    private final String type;

    public Split(String str, String str2, String str3, long j, String str4) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, "type");
        C10202j.m34178b(str3, "path");
        C10202j.m34178b(str4, "md5sum");
        this.name = str;
        this.type = str2;
        this.path = str3;
        this.filesize = j;
        this.md5sum = str4;
    }

    public final long getFilesize() {
        return this.filesize;
    }

    public final String getMd5sum() {
        return this.md5sum;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getType() {
        return this.type;
    }
}

package p015cm.aptoide.p016pt.download;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo16641d2 = {"Lcm/aptoide/pt/download/SplitTypeSubFileTypeMapper;", "", "()V", "mapSplitToSubFileType", "", "splitType", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.SplitTypeSubFileTypeMapper */
/* compiled from: SplitTypeSubFileTypeMapper.kt */
public final class SplitTypeSubFileTypeMapper {
    public final int mapSplitToSubFileType(String str) {
        C10202j.m34178b(str, "splitType");
        int hashCode = str.hashCode();
        if (hashCode != -261224746) {
            if (hashCode == 62583504 && str.equals("ASSET")) {
                return 12;
            }
        } else if (str.equals("FEATURE")) {
            return 11;
        }
        return 15;
    }
}

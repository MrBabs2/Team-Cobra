package p015cm.aptoide.p016pt.download;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.aab.DynamicSplit;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\t\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/pt/download/SplitAnalyticsMapper;", "", "()V", "buildSplitTypesAnalyticsString", "", "hasBase", "", "hasPFD", "hasPAD", "getSplitTypesAsString", "dynamicSplitsList", "", "Lcm/aptoide/pt/aab/DynamicSplit;", "splitsList", "Lcm/aptoide/pt/database/room/RoomFileToDownload;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.SplitAnalyticsMapper */
/* compiled from: SplitAnalyticsMapper.kt */
public class SplitAnalyticsMapper {
    private final String buildSplitTypesAnalyticsString(boolean z, boolean z2, boolean z3) {
        return !z ? AdultContentAnalytics.UNLOCK : (!z || z3 || z2) ? (!z || !z3 || z2) ? (!z || z3 || !z2) ? (!z || !z3 || !z2) ? AdultContentAnalytics.UNLOCK : "PAD+PFD" : "PFD" : "PAD" : "base";
    }

    public final String getSplitTypesAsString(List<? extends RoomFileToDownload> list) {
        C10202j.m34178b(list, "splitsList");
        boolean z = !list.isEmpty();
        boolean z2 = false;
        boolean z3 = false;
        for (RoomFileToDownload roomFileToDownload : list) {
            if (roomFileToDownload.getSubFileType() == 11) {
                z2 = true;
            } else if (roomFileToDownload.getSubFileType() == 12) {
                z3 = true;
            }
        }
        return buildSplitTypesAnalyticsString(z, z2, z3);
    }

    public final String getSplitTypesAsString(boolean z, List<DynamicSplit> list) {
        C10202j.m34178b(list, "dynamicSplitsList");
        boolean z2 = false;
        boolean z3 = false;
        for (DynamicSplit next : list) {
            if (C10202j.m34176a((Object) next.getType(), (Object) "FEATURE")) {
                z2 = true;
            }
            if (C10202j.m34176a((Object) next.getType(), (Object) "ASSET")) {
                z3 = true;
            }
        }
        return buildSplitTypesAnalyticsString(z, z2, z3);
    }
}

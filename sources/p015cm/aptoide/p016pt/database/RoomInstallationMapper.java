package p015cm.aptoide.p016pt.database;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.database.room.RoomInstallation;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/pt/database/RoomInstallationMapper;", "", "()V", "map", "Lcm/aptoide/pt/database/room/RoomInstallation;", "installed", "Lcm/aptoide/pt/database/room/RoomInstalled;", "", "installedList", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.database.RoomInstallationMapper */
/* compiled from: RoomInstallationMapper.kt */
public final class RoomInstallationMapper {
    public final List<RoomInstallation> map(List<? extends RoomInstalled> list) {
        C10202j.m34178b(list, "installedList");
        ArrayList arrayList = new ArrayList();
        for (RoomInstalled map : list) {
            arrayList.add(map(map));
        }
        return arrayList;
    }

    public final RoomInstallation map(RoomInstalled roomInstalled) {
        C10202j.m34178b(roomInstalled, "installed");
        return new RoomInstallation(roomInstalled.getPackageName(), roomInstalled.getName(), roomInstalled.getIcon(), roomInstalled.getVersionCode(), roomInstalled.getVersionName());
    }
}

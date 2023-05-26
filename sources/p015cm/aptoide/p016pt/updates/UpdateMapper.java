package p015cm.aptoide.p016pt.updates;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.database.room.RoomSplit;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Aab;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.File;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ \u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0002J \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bH\u0002¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/updates/UpdateMapper;", "", "()V", "mapAppUpdate", "Lcm/aptoide/pt/database/room/RoomUpdate;", "app", "Lcm/aptoide/pt/dataprovider/model/v7/listapp/App;", "mapAppUpdateList", "", "appList", "mapRequiredSplits", "", "requiredSplits", "mapSplits", "Lcm/aptoide/pt/database/room/RoomSplit;", "splits", "Lcm/aptoide/pt/dataprovider/model/v7/Split;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.updates.UpdateMapper */
/* compiled from: UpdateMapper.kt */
public final class UpdateMapper {
    private final RoomUpdate mapAppUpdate(App app) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List<Split> list;
        List<String> list2;
        String str7;
        String str8;
        String str9;
        Obb obb = app.getObb();
        if (obb != null) {
            Obb.ObbItem main = obb.getMain();
            Obb.ObbItem patch = obb.getPatch();
            if (main != null) {
                str8 = main.getFilename();
                str7 = main.getPath();
                str9 = main.getMd5sum();
            } else {
                str9 = null;
                str8 = null;
                str7 = null;
            }
            if (patch != null) {
                String filename = patch.getFilename();
                String path = patch.getPath();
                str = patch.getMd5sum();
                str3 = filename;
                str4 = str9;
                str6 = str8;
                str5 = str7;
                str2 = path;
            } else {
                str3 = null;
                str2 = null;
                str = null;
                str4 = str9;
                str6 = str8;
                str5 = str7;
            }
        } else {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        long id = app.getId();
        String name = app.getName();
        String icon = app.getIcon();
        String packageName = app.getPackageName();
        File file = app.getFile();
        C10202j.m34174a((Object) file, "app.file");
        String md5sum = file.getMd5sum();
        File file2 = app.getFile();
        C10202j.m34174a((Object) file2, "app.file");
        String path2 = file2.getPath();
        long size = app.getSize();
        File file3 = app.getFile();
        C10202j.m34174a((Object) file3, "app.file");
        String vername = file3.getVername();
        File file4 = app.getFile();
        C10202j.m34174a((Object) file4, "app.file");
        String pathAlt = file4.getPathAlt();
        File file5 = app.getFile();
        C10202j.m34174a((Object) file5, "app.file");
        int vercode = file5.getVercode();
        File file6 = app.getFile();
        C10202j.m34174a((Object) file6, "app.file");
        Malware malware = file6.getMalware();
        C10202j.m34174a((Object) malware, "app.file\n        .malware");
        String name2 = malware.getRank().name();
        boolean z = app.hasAdvertising() || app.hasBilling();
        if (app.hasSplits()) {
            Aab aab = app.getAab();
            C10202j.m34174a((Object) aab, "app.aab");
            list = aab.getSplits();
        } else {
            list = C10529o.m35736a();
        }
        List<RoomSplit> mapSplits = mapSplits(list);
        if (app.hasSplits()) {
            Aab aab2 = app.getAab();
            C10202j.m34174a((Object) aab2, "app.aab");
            list2 = aab2.getRequiredSplits();
        } else {
            list2 = C10529o.m35736a();
        }
        List<String> mapRequiredSplits = mapRequiredSplits(list2);
        Store store = app.getStore();
        C10202j.m34174a((Object) store, "app.store");
        return new RoomUpdate(id, name, icon, packageName, md5sum, path2, size, vername, pathAlt, vercode, name2, str6, str5, str4, str3, str2, str, z, mapSplits, mapRequiredSplits, store.getName());
    }

    private final List<String> mapRequiredSplits(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (String add : list) {
            arrayList.add(add);
        }
        return arrayList;
    }

    private final List<RoomSplit> mapSplits(List<? extends Split> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Split split : list) {
            arrayList.add(new RoomSplit(split.getMd5sum(), split.getPath(), split.getType(), split.getName(), split.getFilesize()));
        }
        return arrayList;
    }

    public final List<RoomUpdate> mapAppUpdateList(List<? extends App> list) {
        C10202j.m34178b(list, "appList");
        ArrayList arrayList = new ArrayList();
        for (App mapAppUpdate : list) {
            arrayList.add(mapAppUpdate(mapAppUpdate));
        }
        return arrayList;
    }
}

package p015cm.aptoide.p016pt.aab;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¨\u0006\b"}, mo16641d2 = {"Lcm/aptoide/pt/aab/SplitsMapper;", "", "()V", "mapSplits", "", "Lcm/aptoide/pt/aab/Split;", "splits", "Lcm/aptoide/pt/dataprovider/model/v7/Split;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.aab.SplitsMapper */
/* compiled from: SplitsMapper.kt */
public final class SplitsMapper {
    public final List<Split> mapSplits(List<? extends Split> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Split split : list) {
            String name = split.getName();
            C10202j.m34174a((Object) name, "split.name");
            String type = split.getType();
            C10202j.m34174a((Object) type, "split.type");
            String path = split.getPath();
            C10202j.m34174a((Object) path, "split.path");
            long filesize = split.getFilesize();
            String md5sum = split.getMd5sum();
            C10202j.m34174a((Object) md5sum, "split.md5sum");
            arrayList.add(new Split(name, type, path, filesize, md5sum));
        }
        return arrayList;
    }
}

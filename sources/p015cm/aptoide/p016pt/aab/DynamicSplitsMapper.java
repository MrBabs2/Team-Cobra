package p015cm.aptoide.p016pt.aab;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.aab.DynamicSplitsResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¨\u0006\f"}, mo16641d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsMapper;", "", "()V", "mapDynamicConfigSplits", "", "Lcm/aptoide/pt/aab/Split;", "splits", "Lcm/aptoide/pt/dataprovider/model/v7/Split;", "mapDynamicSplits", "Lcm/aptoide/pt/aab/DynamicSplit;", "serverDynamicSplitsList", "Lcm/aptoide/pt/aab/DynamicSplitsResponse$DynamicSplit;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.aab.DynamicSplitsMapper */
/* compiled from: DynamicSplitsMapper.kt */
public final class DynamicSplitsMapper {
    private final List<Split> mapDynamicConfigSplits(List<? extends Split> list) {
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (Split split : list) {
            String name = split.getName();
            C10202j.m34174a((Object) name, "it.name");
            String type = split.getType();
            C10202j.m34174a((Object) type, "it.type");
            String path = split.getPath();
            C10202j.m34174a((Object) path, "it.path");
            long filesize = split.getFilesize();
            String md5sum = split.getMd5sum();
            C10202j.m34174a((Object) md5sum, "it.md5sum");
            arrayList.add(new Split(name, type, path, filesize, md5sum));
        }
        return arrayList;
    }

    public final List<DynamicSplit> mapDynamicSplits(List<? extends DynamicSplitsResponse.DynamicSplit> list) {
        C10202j.m34178b(list, "serverDynamicSplitsList");
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (DynamicSplitsResponse.DynamicSplit dynamicSplit : list) {
            String name = dynamicSplit.getName();
            C10202j.m34174a((Object) name, "it.name");
            String type = dynamicSplit.getType();
            C10202j.m34174a((Object) type, "it.type");
            String md5sum = dynamicSplit.getMd5sum();
            C10202j.m34174a((Object) md5sum, "it.md5sum");
            String path = dynamicSplit.getPath();
            C10202j.m34174a((Object) path, "it.path");
            Long filesize = dynamicSplit.getFilesize();
            C10202j.m34174a((Object) filesize, "it.filesize");
            long longValue = filesize.longValue();
            List<String> list2 = dynamicSplit.deliveryTypes;
            C10202j.m34174a((Object) list2, "it.deliveryTypes");
            List<Split> splits = dynamicSplit.getSplits();
            C10202j.m34174a((Object) splits, "it.splits");
            arrayList.add(new DynamicSplit(name, type, md5sum, path, longValue, list2, mapDynamicConfigSplits(splits)));
        }
        return arrayList;
    }
}

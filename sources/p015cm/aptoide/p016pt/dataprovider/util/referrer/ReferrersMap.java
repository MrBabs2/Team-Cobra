package p015cm.aptoide.p016pt.dataprovider.util.referrer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: cm.aptoide.pt.dataprovider.util.referrer.ReferrersMap */
public class ReferrersMap extends ConcurrentHashMap<String, List<Long>> {
    public void add(String str, long j) {
        if (j != -1) {
            if (!containsKey(str)) {
                put(str, new LinkedList());
            }
            ((List) get(str)).add(Long.valueOf(j));
        }
    }
}

package p015cm.aptoide.p016pt.dataprovider.util;

import java.util.HashMap;
import p015cm.aptoide.p016pt.dataprovider.p021ws.RefreshBody;

/* renamed from: cm.aptoide.pt.dataprovider.util.HashMapNotNull */
public class HashMapNotNull<K, V> extends HashMap<K, V> implements RefreshBody {
    public V put(K k, V v) {
        return v != null ? super.put(k, v) : v;
    }

    public void setRefresh(boolean z) {
    }
}

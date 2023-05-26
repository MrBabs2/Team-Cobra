package androidx.work;

import androidx.work.C0829e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends C0833h {
    /* renamed from: a */
    public C0829e mo4624a(List<C0829e> list) {
        C0829e.C0830a aVar = new C0829e.C0830a();
        HashMap hashMap = new HashMap();
        for (C0829e a : list) {
            hashMap.putAll(a.mo4715a());
        }
        aVar.mo4724a((Map<String, Object>) hashMap);
        return aVar.mo4725a();
    }
}

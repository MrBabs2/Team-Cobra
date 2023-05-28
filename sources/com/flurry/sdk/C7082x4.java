package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.x4 */
public final class C7082x4 implements C6823f7<C7095z> {
    /* renamed from: a */
    public final /* synthetic */ void mo23539a(Object obj) {
        C7095z zVar = (C7095z) obj;
        String str = zVar.f13361a;
        String str2 = zVar.f13362b;
        Map map = zVar.f13363c;
        if (map == null) {
            map = new HashMap();
        }
        map.put("fl.origin.attribute.version", str2);
        if (map.size() > 10) {
            int size = map.size();
            C6792d1.m14487d("OriginAttributeFrame", "MaxOriginParams exceeded: ".concat(String.valueOf(size)));
            map.clear();
            map.put("fl.parameter.limit.exceeded", String.valueOf(size));
        }
        C6925m2.m14707a().mo23649a(new C6755b6(new C6776c6(str, map)));
        C6792d1.m14476a(4, "OriginAttributeObserver", "Origin attribute name: " + zVar.f13361a + ". Origin attribute version: " + zVar.f13362b + ". Origin attribute params: " + zVar.f13363c);
    }
}

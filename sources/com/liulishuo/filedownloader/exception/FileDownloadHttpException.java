package com.liulishuo.filedownloader.exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p112n.p312h.p313a.p318f0.C10771f;

public class FileDownloadHttpException extends RuntimeException {

    /* renamed from: f */
    private final int f25219f;

    public FileDownloadHttpException(int i, Map<String, List<String>> map, Map<String, List<String>> map2) {
        super(C10771f.m36504a("response code error: %d, \n request headers: %s \n response headers: %s", Integer.valueOf(i), map, map2));
        this.f25219f = i;
        m29066a(map);
        m29066a(map);
    }

    /* renamed from: a */
    public int mo32693a() {
        return this.f25219f;
    }

    /* renamed from: a */
    private static Map<String, List<String>> m29066a(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), new ArrayList((Collection) next.getValue()));
        }
        return hashMap;
    }
}

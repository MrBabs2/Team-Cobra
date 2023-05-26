package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzard
public final class zzazr {

    /* renamed from: a */
    private static Map<String, List<Map<String, Object>>> f18718a = new HashMap();

    /* renamed from: b */
    private static List<MediaCodecInfo> f18719b;

    /* renamed from: c */
    private static final Object f18720c = new Object();

    @TargetApi(16)
    /* renamed from: a */
    public static List<Map<String, Object>> m20456a(String str) {
        synchronized (f18720c) {
            if (f18718a.containsKey(str)) {
                List<Map<String, Object>> list = f18718a.get(str);
                return list;
            }
            try {
                synchronized (f18720c) {
                    if (f18719b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            f18719b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (Build.VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f18719b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f18719b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            f18719b = Collections.emptyList();
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo next : f18719b) {
                    if (!next.isEncoder() && Arrays.asList(next.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", next.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = next.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", m20457a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", m20457a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", m20457a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", m20457a(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f18718a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f18718a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static Integer[] m20457a(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzdmj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzdmi<MessageType extends zzdmi<MessageType, BuilderType>, BuilderType extends zzdmj<MessageType, BuilderType>> implements zzdpk {
    private static boolean zzhcg = false;
    protected int zzhcf = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo29062a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final zzdmr mo29064e() {
        try {
            C7634ju j = zzdmr.m23768j(mo29133h());
            mo29128a(j.mo26142b());
            return j.mo26141a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: g */
    public final byte[] mo29065g() {
        try {
            byte[] bArr = new byte[mo29133h()];
            zzdni a = zzdni.m23812a(bArr);
            mo29128a(a);
            a.mo29105c();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29063a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    protected static <T> void m23752a(Iterable<T> iterable, List<? super T> list) {
        zzdod.m24034a(iterable);
        if (iterable instanceof zzdot) {
            List<?> e = ((zzdot) iterable).mo29154e();
            zzdot zzdot = (zzdot) list;
            int size = list.size();
            for (Object next : e) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzdot.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzdot.size() - 1; size2 >= size; size2--) {
                        zzdot.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zzdmr) {
                    zzdot.mo29152a((zzdmr) next);
                } else {
                    zzdot.add((String) next);
                }
            }
        } else if (iterable instanceof C7558hw) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}

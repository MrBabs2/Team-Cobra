package p413s;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u001f\b\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\rH\u0002R\u001e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo16641d2 = {"Lokio/Options;", "Ljava/util/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$jvm", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$jvm", "()[I", "get", "index", "Companion", "jvm"}, mo16642k = 1, mo16643mv = {1, 1, 11})
/* renamed from: s.q */
/* compiled from: Options.kt */
public final class C12920q extends AbstractList<C12911i> implements RandomAccess {

    /* renamed from: h */
    public static final C12921a f33175h = new C12921a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C12911i[] f33176f;

    /* renamed from: g */
    private final int[] f33177g;

    /* renamed from: s.q$a */
    /* compiled from: Options.kt */
    public static final class C12921a {
        private C12921a() {
        }

        /* renamed from: a */
        public final C12920q mo41273a(C12911i... iVarArr) {
            C12911i[] iVarArr2 = iVarArr;
            C10202j.m34178b(iVarArr2, "byteStrings");
            int i = 0;
            if (iVarArr2.length == 0) {
                return new C12920q(new C12911i[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List l = C10519k.m35654l(iVarArr);
            C10535s.m35757c(l);
            ArrayList arrayList = new ArrayList(iVarArr2.length);
            for (C12911i iVar : iVarArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List d = C10529o.m35745d((Integer[]) Arrays.copyOf(numArr, numArr.length));
                int length = iVarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    d.set(C10529o.m35734a(l, iVarArr2[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                    i2++;
                    i3++;
                }
                if (((C12911i) l.get(0)).mo41239s() > 0) {
                    int i4 = 0;
                    while (i4 < l.size()) {
                        C12911i iVar2 = (C12911i) l.get(i4);
                        int i5 = i4 + 1;
                        int i6 = i5;
                        while (i6 < l.size()) {
                            C12911i iVar3 = (C12911i) l.get(i6);
                            if (!iVar3.mo41225b(iVar2)) {
                                continue;
                                break;
                            }
                            if (!(iVar3.mo41239s() != iVar2.mo41239s())) {
                                throw new IllegalArgumentException(("duplicate option: " + iVar3).toString());
                            } else if (((Number) d.get(i6)).intValue() > ((Number) d.get(i4)).intValue()) {
                                l.remove(i6);
                                d.remove(i6);
                            } else {
                                i6++;
                            }
                        }
                        i4 = i5;
                    }
                    C12905f fVar = new C12905f();
                    m41695a(this, 0, fVar, 0, l, 0, 0, d, 53, (Object) null);
                    int[] iArr = new int[((int) m41693a(fVar))];
                    while (!fVar.mo41169g()) {
                        iArr[i] = fVar.readInt();
                        i++;
                    }
                    return new C12920q((C12911i[]) iVarArr.clone(), iArr, (DefaultConstructorMarker) null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public /* synthetic */ C12921a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        static /* bridge */ /* synthetic */ void m41695a(C12921a aVar, long j, C12905f fVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m41694a((i4 & 1) != 0 ? 0 : j, fVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: a */
        private final void m41694a(long j, C12905f fVar, int i, List<? extends C12911i> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C12905f fVar2;
            C12905f fVar3 = fVar;
            int i8 = i;
            List<? extends C12911i> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C12911i) list3.get(i11)).mo41239s() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C12911i iVar = (C12911i) list.get(i2);
                C12911i iVar2 = (C12911i) list3.get(i10 - 1);
                if (i8 == iVar.mo41239s()) {
                    int intValue = list4.get(i9).intValue();
                    int i12 = i9 + 1;
                    i4 = i12;
                    i5 = intValue;
                    iVar = (C12911i) list3.get(i12);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (iVar.mo41216a(i8) != iVar2.mo41216a(i8)) {
                    int i13 = 1;
                    for (int i14 = i4 + 1; i14 < i10; i14++) {
                        if (((C12911i) list3.get(i14 - 1)).mo41216a(i8) != ((C12911i) list3.get(i14)).mo41216a(i8)) {
                            i13++;
                        }
                    }
                    long a = j + m41693a(fVar3) + ((long) 2) + ((long) (i13 * 2));
                    fVar3.writeInt(i13);
                    fVar3.writeInt(i5);
                    for (int i15 = i4; i15 < i10; i15++) {
                        byte a2 = ((C12911i) list3.get(i15)).mo41216a(i8);
                        if (i15 == i4 || a2 != ((C12911i) list3.get(i15 - 1)).mo41216a(i8)) {
                            fVar3.writeInt((int) a2 & 255);
                        }
                    }
                    C12905f fVar4 = new C12905f();
                    while (i4 < i10) {
                        byte a3 = ((C12911i) list3.get(i4)).mo41216a(i8);
                        int i16 = i4 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i10) {
                                i6 = i10;
                                break;
                            } else if (a3 != ((C12911i) list3.get(i17)).mo41216a(i8)) {
                                i6 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i6 && i8 + 1 == ((C12911i) list3.get(i4)).mo41239s()) {
                            fVar3.writeInt(list4.get(i4).intValue());
                            i7 = i6;
                            fVar2 = fVar4;
                        } else {
                            fVar3.writeInt(((int) (a + m41693a(fVar4))) * -1);
                            i7 = i6;
                            fVar2 = fVar4;
                            m41694a(a, fVar4, i8 + 1, list, i4, i6, list2);
                        }
                        fVar4 = fVar2;
                        i4 = i7;
                    }
                    fVar3.mo41135a((C12892a0) fVar4);
                    return;
                }
                int min = Math.min(iVar.mo41239s(), iVar2.mo41239s());
                int i18 = i8;
                int i19 = 0;
                while (i18 < min && iVar.mo41216a(i18) == iVar2.mo41216a(i18)) {
                    i19++;
                    i18++;
                }
                long a4 = j + m41693a(fVar3) + ((long) 2) + ((long) i19) + 1;
                fVar3.writeInt(-i19);
                fVar3.writeInt(i5);
                int i20 = i8 + i19;
                while (i8 < i20) {
                    fVar3.writeInt((int) iVar.mo41216a(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i20 == ((C12911i) list3.get(i4)).mo41239s()) {
                        fVar3.writeInt(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C12905f fVar5 = new C12905f();
                fVar3.writeInt(((int) (m41693a(fVar5) + a4)) * -1);
                m41694a(a4, fVar5, i20, list, i4, i3, list2);
                fVar3.mo41135a((C12892a0) fVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        private final long m41693a(C12905f fVar) {
            return fVar.size() / ((long) 4);
        }
    }

    public /* synthetic */ C12920q(C12911i[] iVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVarArr, iArr);
    }

    /* renamed from: a */
    public static final C12920q m41685a(C12911i... iVarArr) {
        return f33175h.mo41273a(iVarArr);
    }

    /* renamed from: a */
    public /* bridge */ boolean mo41260a(C12911i iVar) {
        return super.contains(iVar);
    }

    /* renamed from: b */
    public /* bridge */ int mo41263b(C12911i iVar) {
        return super.indexOf(iVar);
    }

    /* renamed from: c */
    public /* bridge */ int mo41264c(C12911i iVar) {
        return super.lastIndexOf(iVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof C12911i : true) {
            return mo41260a((C12911i) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ boolean mo41267d(C12911i iVar) {
        return super.remove(iVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof C12911i : true) {
            return mo41263b((C12911i) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof C12911i : true) {
            return mo41264c((C12911i) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof C12911i : true) {
            return mo41267d((C12911i) obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return mo41262b();
    }

    private C12920q(C12911i[] iVarArr, int[] iArr) {
        this.f33176f = iVarArr;
        this.f33177g = iArr;
    }

    /* renamed from: a */
    public final C12911i[] mo41261a() {
        return this.f33176f;
    }

    /* renamed from: b */
    public int mo41262b() {
        return this.f33176f.length;
    }

    /* renamed from: c */
    public final int[] mo41265c() {
        return this.f33177g;
    }

    public C12911i get(int i) {
        return this.f33176f[i];
    }
}

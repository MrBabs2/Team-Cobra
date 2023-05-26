package org.parceler;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.parceler.C12420e;
import org.parceler.p399h.C12427a;
import org.parceler.p399h.C12428b;
import org.parceler.p399h.C12429c;
import org.parceler.p399h.C12430d;
import org.parceler.p399h.C12431e;
import org.parceler.p399h.C12432f;
import org.parceler.p399h.C12433g;
import org.parceler.p399h.C12434h;
import org.parceler.p399h.C12435i;
import org.parceler.p399h.C12437k;
import org.parceler.p399h.C12438l;
import org.parceler.p399h.C12439m;
import org.parceler.p399h.C12440n;

final class NonParcelRepository implements C12425f<C12420e.C12423c> {

    /* renamed from: b */
    private static final NonParcelRepository f32160b = new NonParcelRepository();

    /* renamed from: a */
    private final Map<Class, C12420e.C12423c> f32161a;

    public static final class BooleanArrayParcelable extends ConverterParcelable<boolean[]> {
        public static final C12342a CREATOR = new C12342a();

        /* renamed from: h */
        private static final C12428b f32162h = new C12428b();

        /* renamed from: org.parceler.NonParcelRepository$BooleanArrayParcelable$a */
        private static final class C12342a implements Parcelable.Creator<BooleanArrayParcelable> {
            private C12342a() {
            }

            public BooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new BooleanArrayParcelable(parcel);
            }

            public BooleanArrayParcelable[] newArray(int i) {
                return new BooleanArrayParcelable[i];
            }
        }

        public BooleanArrayParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32162h);
        }

        public BooleanArrayParcelable(boolean[] zArr) {
            super((Object) zArr, (C12426g) f32162h);
        }
    }

    public static final class BooleanParcelable extends ConverterParcelable<Boolean> {
        public static final C12344b CREATOR = new C12344b();

        /* renamed from: h */
        private static final C12437k<Boolean> f32163h = new C12343a();

        /* renamed from: org.parceler.NonParcelRepository$BooleanParcelable$b */
        private static final class C12344b implements Parcelable.Creator<BooleanParcelable> {
            private C12344b() {
            }

            public BooleanParcelable createFromParcel(Parcel parcel) {
                return new BooleanParcelable(parcel);
            }

            public BooleanParcelable[] newArray(int i) {
                return new BooleanParcelable[i];
            }
        }

        public BooleanParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32163h);
        }

        /* renamed from: org.parceler.NonParcelRepository$BooleanParcelable$a */
        static class C12343a extends C12437k<Boolean> {
            C12343a() {
            }

            /* renamed from: a */
            public void mo40364b(Boolean bool, Parcel parcel) {
                parcel.writeBooleanArray(new boolean[]{bool.booleanValue()});
            }

            /* renamed from: b */
            public Boolean m40714b(Parcel parcel) {
                return Boolean.valueOf(parcel.createBooleanArray()[0]);
            }
        }

        public BooleanParcelable(boolean z) {
            super((Object) Boolean.valueOf(z), (C12426g) f32163h);
        }
    }

    public static final class ByteArrayParcelable extends ConverterParcelable<byte[]> {
        public static final C12346b CREATOR = new C12346b();

        /* renamed from: h */
        private static final C12437k<byte[]> f32164h = new C12345a();

        /* renamed from: org.parceler.NonParcelRepository$ByteArrayParcelable$b */
        private static final class C12346b implements Parcelable.Creator<ByteArrayParcelable> {
            private C12346b() {
            }

            public ByteArrayParcelable createFromParcel(Parcel parcel) {
                return new ByteArrayParcelable(parcel);
            }

            public ByteArrayParcelable[] newArray(int i) {
                return new ByteArrayParcelable[i];
            }
        }

        public ByteArrayParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32164h);
        }

        /* renamed from: org.parceler.NonParcelRepository$ByteArrayParcelable$a */
        static class C12345a extends C12437k<byte[]> {
            C12345a() {
            }

            /* renamed from: a */
            public void mo40364b(byte[] bArr, Parcel parcel) {
                parcel.writeByteArray(bArr);
            }

            /* renamed from: b */
            public byte[] m40719b(Parcel parcel) {
                return parcel.createByteArray();
            }
        }

        public ByteArrayParcelable(byte[] bArr) {
            super((Object) bArr, (C12426g) f32164h);
        }
    }

    public static final class ByteParcelable extends ConverterParcelable<Byte> {
        public static final C12348b CREATOR = new C12348b();

        /* renamed from: h */
        private static final C12437k<Byte> f32165h = new C12347a();

        /* renamed from: org.parceler.NonParcelRepository$ByteParcelable$b */
        private static final class C12348b implements Parcelable.Creator<ByteParcelable> {
            private C12348b() {
            }

            public ByteParcelable createFromParcel(Parcel parcel) {
                return new ByteParcelable(parcel);
            }

            public ByteParcelable[] newArray(int i) {
                return new ByteParcelable[i];
            }
        }

        public ByteParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32165h);
        }

        /* renamed from: org.parceler.NonParcelRepository$ByteParcelable$a */
        static class C12347a extends C12437k<Byte> {
            C12347a() {
            }

            /* renamed from: a */
            public void mo40364b(Byte b, Parcel parcel) {
                parcel.writeByte(b.byteValue());
            }

            /* renamed from: b */
            public Byte m40722b(Parcel parcel) {
                return Byte.valueOf(parcel.readByte());
            }
        }

        public ByteParcelable(Byte b) {
            super((Object) b, (C12426g) f32165h);
        }
    }

    public static final class CharArrayParcelable extends ConverterParcelable<char[]> {
        public static final C12349a CREATOR = new C12349a();

        /* renamed from: h */
        private static final C12429c f32166h = new C12429c();

        /* renamed from: org.parceler.NonParcelRepository$CharArrayParcelable$a */
        private static final class C12349a implements Parcelable.Creator<CharArrayParcelable> {
            private C12349a() {
            }

            public CharArrayParcelable createFromParcel(Parcel parcel) {
                return new CharArrayParcelable(parcel);
            }

            public CharArrayParcelable[] newArray(int i) {
                return new CharArrayParcelable[i];
            }
        }

        public CharArrayParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32166h);
        }

        public CharArrayParcelable(char[] cArr) {
            super((Object) cArr, (C12426g) f32166h);
        }
    }

    public static final class CharacterParcelable extends ConverterParcelable<Character> {
        public static final C12351b CREATOR = new C12351b();

        /* renamed from: h */
        private static final C12437k<Character> f32167h = new C12350a();

        /* renamed from: org.parceler.NonParcelRepository$CharacterParcelable$b */
        private static final class C12351b implements Parcelable.Creator<CharacterParcelable> {
            private C12351b() {
            }

            public CharacterParcelable createFromParcel(Parcel parcel) {
                return new CharacterParcelable(parcel);
            }

            public CharacterParcelable[] newArray(int i) {
                return new CharacterParcelable[i];
            }
        }

        public CharacterParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32167h);
        }

        /* renamed from: org.parceler.NonParcelRepository$CharacterParcelable$a */
        static class C12350a extends C12437k<Character> {
            C12350a() {
            }

            /* renamed from: a */
            public void mo40364b(Character ch, Parcel parcel) {
                parcel.writeCharArray(new char[]{ch.charValue()});
            }

            /* renamed from: b */
            public Character m40726b(Parcel parcel) {
                return Character.valueOf(parcel.createCharArray()[0]);
            }
        }

        public CharacterParcelable(Character ch) {
            super((Object) ch, (C12426g) f32167h);
        }
    }

    public static final class CollectionParcelable extends ConverterParcelable<Collection> {
        public static final C12353b CREATOR = new C12353b();

        /* renamed from: h */
        private static final C12430d f32168h = new C12352a();

        /* renamed from: org.parceler.NonParcelRepository$CollectionParcelable$a */
        static class C12352a extends C12427a {
            C12352a() {
            }

            /* renamed from: b */
            public Object mo40378b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(CollectionParcelable.class.getClassLoader()));
            }

            /* renamed from: b */
            public void mo40379b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$CollectionParcelable$b */
        private static final class C12353b implements Parcelable.Creator<CollectionParcelable> {
            private C12353b() {
            }

            public CollectionParcelable createFromParcel(Parcel parcel) {
                return new CollectionParcelable(parcel);
            }

            public CollectionParcelable[] newArray(int i) {
                return new CollectionParcelable[i];
            }
        }

        public CollectionParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32168h);
        }

        public CollectionParcelable(Collection collection) {
            super((Object) collection, (C12426g) f32168h);
        }
    }

    public static final class DoubleParcelable extends ConverterParcelable<Double> {
        public static final C12355b CREATOR = new C12355b();

        /* renamed from: h */
        private static final C12437k<Double> f32171h = new C12354a();

        /* renamed from: org.parceler.NonParcelRepository$DoubleParcelable$b */
        private static final class C12355b implements Parcelable.Creator<DoubleParcelable> {
            private C12355b() {
            }

            public DoubleParcelable createFromParcel(Parcel parcel) {
                return new DoubleParcelable(parcel);
            }

            public DoubleParcelable[] newArray(int i) {
                return new DoubleParcelable[i];
            }
        }

        public DoubleParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32171h);
        }

        /* renamed from: org.parceler.NonParcelRepository$DoubleParcelable$a */
        static class C12354a extends C12437k<Double> {
            C12354a() {
            }

            /* renamed from: a */
            public void mo40364b(Double d, Parcel parcel) {
                parcel.writeDouble(d.doubleValue());
            }

            /* renamed from: b */
            public Double m40732b(Parcel parcel) {
                return Double.valueOf(parcel.readDouble());
            }
        }

        public DoubleParcelable(Double d) {
            super((Object) d, (C12426g) f32171h);
        }
    }

    public static final class FloatParcelable extends ConverterParcelable<Float> {
        public static final C12357b CREATOR = new C12357b();

        /* renamed from: h */
        private static final C12437k<Float> f32172h = new C12356a();

        /* renamed from: org.parceler.NonParcelRepository$FloatParcelable$b */
        private static final class C12357b implements Parcelable.Creator<FloatParcelable> {
            private C12357b() {
            }

            public FloatParcelable createFromParcel(Parcel parcel) {
                return new FloatParcelable(parcel);
            }

            public FloatParcelable[] newArray(int i) {
                return new FloatParcelable[i];
            }
        }

        public FloatParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32172h);
        }

        /* renamed from: org.parceler.NonParcelRepository$FloatParcelable$a */
        static class C12356a extends C12437k<Float> {
            C12356a() {
            }

            /* renamed from: a */
            public void mo40364b(Float f, Parcel parcel) {
                parcel.writeFloat(f.floatValue());
            }

            /* renamed from: b */
            public Float m40736b(Parcel parcel) {
                return Float.valueOf(parcel.readFloat());
            }
        }

        public FloatParcelable(Float f) {
            super((Object) f, (C12426g) f32172h);
        }
    }

    public static final class IBinderParcelable extends ConverterParcelable<IBinder> {
        public static final C12359b CREATOR = new C12359b();

        /* renamed from: h */
        private static final C12437k<IBinder> f32173h = new C12358a();

        /* renamed from: org.parceler.NonParcelRepository$IBinderParcelable$b */
        private static final class C12359b implements Parcelable.Creator<IBinderParcelable> {
            private C12359b() {
            }

            public IBinderParcelable createFromParcel(Parcel parcel) {
                return new IBinderParcelable(parcel);
            }

            public IBinderParcelable[] newArray(int i) {
                return new IBinderParcelable[i];
            }
        }

        public IBinderParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32173h);
        }

        /* renamed from: org.parceler.NonParcelRepository$IBinderParcelable$a */
        static class C12358a extends C12437k<IBinder> {
            C12358a() {
            }

            /* renamed from: a */
            public void mo40364b(IBinder iBinder, Parcel parcel) {
                parcel.writeStrongBinder(iBinder);
            }

            /* renamed from: b */
            public IBinder m40740b(Parcel parcel) {
                return parcel.readStrongBinder();
            }
        }

        public IBinderParcelable(IBinder iBinder) {
            super((Object) iBinder, (C12426g) f32173h);
        }
    }

    public static final class IntegerParcelable extends ConverterParcelable<Integer> {
        public static final C12361b CREATOR = new C12361b();

        /* renamed from: h */
        private static final C12437k<Integer> f32174h = new C12360a();

        /* renamed from: org.parceler.NonParcelRepository$IntegerParcelable$b */
        private static final class C12361b implements Parcelable.Creator<IntegerParcelable> {
            private C12361b() {
            }

            public IntegerParcelable createFromParcel(Parcel parcel) {
                return new IntegerParcelable(parcel);
            }

            public IntegerParcelable[] newArray(int i) {
                return new IntegerParcelable[i];
            }
        }

        public IntegerParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32174h);
        }

        /* renamed from: org.parceler.NonParcelRepository$IntegerParcelable$a */
        static class C12360a extends C12437k<Integer> {
            C12360a() {
            }

            /* renamed from: a */
            public void mo40364b(Integer num, Parcel parcel) {
                parcel.writeInt(num.intValue());
            }

            /* renamed from: b */
            public Integer m40744b(Parcel parcel) {
                return Integer.valueOf(parcel.readInt());
            }
        }

        public IntegerParcelable(Integer num) {
            super((Object) num, (C12426g) f32174h);
        }
    }

    public static final class LinkedHashMapParcelable extends ConverterParcelable<LinkedHashMap> {
        public static final C12363b CREATOR = new C12363b();

        /* renamed from: h */
        private static final C12433g f32175h = new C12362a();

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashMapParcelable$a */
        static class C12362a extends C12433g {
            C12362a() {
            }

            /* renamed from: b */
            public void mo40397b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }

            /* renamed from: c */
            public void mo40399c(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }

            /* renamed from: b */
            public Object mo40396b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: c */
            public Object mo40398c(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashMapParcelable$b */
        private static final class C12363b implements Parcelable.Creator<LinkedHashMapParcelable> {
            private C12363b() {
            }

            public LinkedHashMapParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashMapParcelable(parcel);
            }

            public LinkedHashMapParcelable[] newArray(int i) {
                return new LinkedHashMapParcelable[i];
            }
        }

        public LinkedHashMapParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32175h);
        }

        public LinkedHashMapParcelable(LinkedHashMap linkedHashMap) {
            super((Object) linkedHashMap, (C12426g) f32175h);
        }
    }

    public static final class LinkedHashSetParcelable extends ConverterParcelable<LinkedHashSet> {
        public static final C12365b CREATOR = new C12365b();

        /* renamed from: h */
        private static final C12434h f32176h = new C12364a();

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashSetParcelable$a */
        static class C12364a extends C12434h {
            C12364a() {
            }

            /* renamed from: b */
            public Object mo40378b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(LinkedHashSetParcelable.class.getClassLoader()));
            }

            /* renamed from: b */
            public void mo40379b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashSetParcelable$b */
        private static final class C12365b implements Parcelable.Creator<LinkedHashSetParcelable> {
            private C12365b() {
            }

            public LinkedHashSetParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashSetParcelable(parcel);
            }

            public LinkedHashSetParcelable[] newArray(int i) {
                return new LinkedHashSetParcelable[i];
            }
        }

        public LinkedHashSetParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32176h);
        }

        public LinkedHashSetParcelable(LinkedHashSet linkedHashSet) {
            super((Object) linkedHashSet, (C12426g) f32176h);
        }
    }

    public static final class LinkedListParcelable extends ConverterParcelable<LinkedList> {
        public static final C12367b CREATOR = new C12367b();

        /* renamed from: h */
        private static final C12435i f32177h = new C12366a();

        /* renamed from: org.parceler.NonParcelRepository$LinkedListParcelable$a */
        static class C12366a extends C12435i {
            C12366a() {
            }

            /* renamed from: b */
            public Object mo40378b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(LinkedListParcelable.class.getClassLoader()));
            }

            /* renamed from: b */
            public void mo40379b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedListParcelable$b */
        private static final class C12367b implements Parcelable.Creator<LinkedListParcelable> {
            private C12367b() {
            }

            public LinkedListParcelable createFromParcel(Parcel parcel) {
                return new LinkedListParcelable(parcel);
            }

            public LinkedListParcelable[] newArray(int i) {
                return new LinkedListParcelable[i];
            }
        }

        public LinkedListParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32177h);
        }

        public LinkedListParcelable(LinkedList linkedList) {
            super((Object) linkedList, (C12426g) f32177h);
        }
    }

    public static final class ListParcelable extends ConverterParcelable<List> {
        public static final C12369b CREATOR = new C12369b();

        /* renamed from: h */
        private static final C12427a f32178h = new C12368a();

        /* renamed from: org.parceler.NonParcelRepository$ListParcelable$a */
        static class C12368a extends C12427a {
            C12368a() {
            }

            /* renamed from: b */
            public Object mo40378b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(ListParcelable.class.getClassLoader()));
            }

            /* renamed from: b */
            public void mo40379b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ListParcelable$b */
        private static final class C12369b implements Parcelable.Creator<ListParcelable> {
            private C12369b() {
            }

            public ListParcelable createFromParcel(Parcel parcel) {
                return new ListParcelable(parcel);
            }

            public ListParcelable[] newArray(int i) {
                return new ListParcelable[i];
            }
        }

        public ListParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32178h);
        }

        public ListParcelable(List list) {
            super((Object) list, (C12426g) f32178h);
        }
    }

    public static final class LongParcelable extends ConverterParcelable<Long> {
        public static final C12371b CREATOR = new C12371b();

        /* renamed from: h */
        private static final C12437k<Long> f32179h = new C12370a();

        /* renamed from: org.parceler.NonParcelRepository$LongParcelable$b */
        private static final class C12371b implements Parcelable.Creator<LongParcelable> {
            private C12371b() {
            }

            public LongParcelable createFromParcel(Parcel parcel) {
                return new LongParcelable(parcel);
            }

            public LongParcelable[] newArray(int i) {
                return new LongParcelable[i];
            }
        }

        public LongParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32179h);
        }

        /* renamed from: org.parceler.NonParcelRepository$LongParcelable$a */
        static class C12370a extends C12437k<Long> {
            C12370a() {
            }

            /* renamed from: a */
            public void mo40364b(Long l, Parcel parcel) {
                parcel.writeLong(l.longValue());
            }

            /* renamed from: b */
            public Long m40758b(Parcel parcel) {
                return Long.valueOf(parcel.readLong());
            }
        }

        public LongParcelable(Long l) {
            super((Object) l, (C12426g) f32179h);
        }
    }

    public static final class MapParcelable extends ConverterParcelable<Map> {
        public static final C12373b CREATOR = new C12373b();

        /* renamed from: h */
        private static final C12431e f32180h = new C12372a();

        /* renamed from: org.parceler.NonParcelRepository$MapParcelable$a */
        static class C12372a extends C12431e {
            C12372a() {
            }

            /* renamed from: b */
            public void mo40397b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }

            /* renamed from: c */
            public void mo40399c(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }

            /* renamed from: b */
            public Object mo40396b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: c */
            public Object mo40398c(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$MapParcelable$b */
        private static final class C12373b implements Parcelable.Creator<MapParcelable> {
            private C12373b() {
            }

            public MapParcelable createFromParcel(Parcel parcel) {
                return new MapParcelable(parcel);
            }

            public MapParcelable[] newArray(int i) {
                return new MapParcelable[i];
            }
        }

        public MapParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32180h);
        }

        public MapParcelable(Map map) {
            super((Object) map, (C12426g) f32180h);
        }
    }

    public static final class ParcelableParcelable implements Parcelable, C12419d<Parcelable> {
        public static final C12374a CREATOR = new C12374a();

        /* renamed from: f */
        private Parcelable f32181f;

        /* renamed from: org.parceler.NonParcelRepository$ParcelableParcelable$a */
        private static final class C12374a implements Parcelable.Creator<ParcelableParcelable> {
            private C12374a() {
            }

            public ParcelableParcelable createFromParcel(Parcel parcel) {
                return new ParcelableParcelable(parcel);
            }

            public ParcelableParcelable[] newArray(int i) {
                return new ParcelableParcelable[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f32181f, i);
        }

        public Parcelable getParcel() {
            return this.f32181f;
        }

        private ParcelableParcelable(Parcel parcel) {
            this.f32181f = parcel.readParcelable(ParcelableParcelable.class.getClassLoader());
        }

        private ParcelableParcelable(Parcelable parcelable) {
            this.f32181f = parcelable;
        }
    }

    public static final class SetParcelable extends ConverterParcelable<Set> {
        public static final C12376b CREATOR = new C12376b();

        /* renamed from: h */
        private static final C12432f f32182h = new C12375a();

        /* renamed from: org.parceler.NonParcelRepository$SetParcelable$a */
        static class C12375a extends C12432f {
            C12375a() {
            }

            /* renamed from: b */
            public Object mo40378b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(SetParcelable.class.getClassLoader()));
            }

            /* renamed from: b */
            public void mo40379b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SetParcelable$b */
        private static final class C12376b implements Parcelable.Creator<SetParcelable> {
            private C12376b() {
            }

            public SetParcelable createFromParcel(Parcel parcel) {
                return new SetParcelable(parcel);
            }

            public SetParcelable[] newArray(int i) {
                return new SetParcelable[i];
            }
        }

        public SetParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32182h);
        }

        public SetParcelable(Set set) {
            super((Object) set, (C12426g) f32182h);
        }
    }

    public static final class SparseArrayParcelable extends ConverterParcelable<SparseArray> {
        public static final C12378b CREATOR = new C12378b();

        /* renamed from: h */
        private static final C12438l f32183h = new C12377a();

        /* renamed from: org.parceler.NonParcelRepository$SparseArrayParcelable$a */
        static class C12377a extends C12438l {
            C12377a() {
            }

            /* renamed from: b */
            public Object mo40419b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(SparseArrayParcelable.class.getClassLoader()));
            }

            /* renamed from: b */
            public void mo40420b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SparseArrayParcelable$b */
        private static final class C12378b implements Parcelable.Creator<SparseArrayParcelable> {
            private C12378b() {
            }

            public SparseArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseArrayParcelable(parcel);
            }

            public SparseArrayParcelable[] newArray(int i) {
                return new SparseArrayParcelable[i];
            }
        }

        public SparseArrayParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32183h);
        }

        public SparseArrayParcelable(SparseArray sparseArray) {
            super((Object) sparseArray, (C12426g) f32183h);
        }
    }

    public static final class SparseBooleanArrayParcelable extends ConverterParcelable<SparseBooleanArray> {
        public static final C12380b CREATOR = new C12380b();

        /* renamed from: h */
        private static final C12437k<SparseBooleanArray> f32184h = new C12379a();

        /* renamed from: org.parceler.NonParcelRepository$SparseBooleanArrayParcelable$b */
        private static final class C12380b implements Parcelable.Creator<SparseBooleanArrayParcelable> {
            private C12380b() {
            }

            public SparseBooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseBooleanArrayParcelable(parcel);
            }

            public SparseBooleanArrayParcelable[] newArray(int i) {
                return new SparseBooleanArrayParcelable[i];
            }
        }

        public SparseBooleanArrayParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32184h);
        }

        /* renamed from: org.parceler.NonParcelRepository$SparseBooleanArrayParcelable$a */
        static class C12379a extends C12437k<SparseBooleanArray> {
            C12379a() {
            }

            /* renamed from: a */
            public void mo40364b(SparseBooleanArray sparseBooleanArray, Parcel parcel) {
                parcel.writeSparseBooleanArray(sparseBooleanArray);
            }

            /* renamed from: b */
            public SparseBooleanArray m40770b(Parcel parcel) {
                return parcel.readSparseBooleanArray();
            }
        }

        public SparseBooleanArrayParcelable(SparseBooleanArray sparseBooleanArray) {
            super((Object) sparseBooleanArray, (C12426g) f32184h);
        }
    }

    public static final class StringParcelable implements Parcelable, C12419d<String> {
        public static final C12381a CREATOR = new C12381a();

        /* renamed from: f */
        private String f32185f;

        /* renamed from: org.parceler.NonParcelRepository$StringParcelable$a */
        private static final class C12381a implements Parcelable.Creator<StringParcelable> {
            private C12381a() {
            }

            public StringParcelable createFromParcel(Parcel parcel) {
                return new StringParcelable(parcel);
            }

            public StringParcelable[] newArray(int i) {
                return new StringParcelable[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f32185f);
        }

        public String getParcel() {
            return this.f32185f;
        }

        private StringParcelable(Parcel parcel) {
            this.f32185f = parcel.readString();
        }

        private StringParcelable(String str) {
            this.f32185f = str;
        }
    }

    public static final class TreeMapParcelable extends ConverterParcelable<Map> {
        public static final C12383b CREATOR = new C12383b();

        /* renamed from: h */
        private static final C12439m f32186h = new C12382a();

        /* renamed from: org.parceler.NonParcelRepository$TreeMapParcelable$a */
        static class C12382a extends C12439m {
            C12382a() {
            }

            /* renamed from: b */
            public void mo40397b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }

            /* renamed from: c */
            public void mo40399c(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }

            /* renamed from: b */
            public Object mo40396b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: c */
            public Object mo40398c(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$TreeMapParcelable$b */
        private static final class C12383b implements Parcelable.Creator<TreeMapParcelable> {
            private C12383b() {
            }

            public TreeMapParcelable createFromParcel(Parcel parcel) {
                return new TreeMapParcelable(parcel);
            }

            public TreeMapParcelable[] newArray(int i) {
                return new TreeMapParcelable[i];
            }
        }

        public TreeMapParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32186h);
        }

        public TreeMapParcelable(Map map) {
            super((Object) map, (C12426g) f32186h);
        }
    }

    public static final class TreeSetParcelable extends ConverterParcelable<Set> {
        public static final C12385b CREATOR = new C12385b();

        /* renamed from: h */
        private static final C12440n f32187h = new C12384a();

        /* renamed from: org.parceler.NonParcelRepository$TreeSetParcelable$a */
        static class C12384a extends C12440n {
            C12384a() {
            }

            /* renamed from: b */
            public Object mo40378b(Parcel parcel) {
                return C12420e.m40844a(parcel.readParcelable(TreeSetParcelable.class.getClassLoader()));
            }

            /* renamed from: b */
            public void mo40379b(Object obj, Parcel parcel) {
                parcel.writeParcelable(C12420e.m40843a(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$TreeSetParcelable$b */
        private static final class C12385b implements Parcelable.Creator<TreeSetParcelable> {
            private C12385b() {
            }

            public TreeSetParcelable createFromParcel(Parcel parcel) {
                return new TreeSetParcelable(parcel);
            }

            public TreeSetParcelable[] newArray(int i) {
                return new TreeSetParcelable[i];
            }
        }

        public TreeSetParcelable(Parcel parcel) {
            super(parcel, (C12426g) f32187h);
        }

        public TreeSetParcelable(Set set) {
            super((Object) set, (C12426g) f32187h);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$b */
    private static class C12387b implements C12420e.C12423c<boolean[]> {
        private C12387b() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(boolean[] zArr) {
            return new BooleanArrayParcelable(zArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$c */
    private static class C12388c implements C12420e.C12423c<Boolean> {
        private C12388c() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Boolean bool) {
            return new BooleanParcelable(bool.booleanValue());
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$d */
    private static class C12389d implements C12420e.C12423c<Bundle> {
        private C12389d() {
        }

        /* renamed from: a */
        public Parcelable mo40437a(Bundle bundle) {
            return bundle;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Parcelable mo40434a(Object obj) {
            Bundle bundle = (Bundle) obj;
            mo40437a(bundle);
            return bundle;
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$e */
    private static class C12390e implements C12420e.C12423c<byte[]> {
        private C12390e() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(byte[] bArr) {
            return new ByteArrayParcelable(bArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$f */
    private static class C12391f implements C12420e.C12423c<Byte> {
        private C12391f() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Byte b) {
            return new ByteParcelable(b);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$g */
    private static class C12392g implements C12420e.C12423c<char[]> {
        private C12392g() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(char[] cArr) {
            return new CharArrayParcelable(cArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$h */
    private static class C12393h implements C12420e.C12423c<Character> {
        private C12393h() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Character ch) {
            return new CharacterParcelable(ch);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$i */
    private static class C12394i implements C12420e.C12423c<Collection> {
        private C12394i() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Collection collection) {
            return new CollectionParcelable(collection);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$j */
    private static class C12395j implements C12420e.C12423c<Double> {
        private C12395j() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Double d) {
            return new DoubleParcelable(d);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$k */
    private static class C12396k implements C12420e.C12423c<Float> {
        private C12396k() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Float f) {
            return new FloatParcelable(f);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$l */
    private static class C12397l implements C12420e.C12423c<IBinder> {
        private C12397l() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(IBinder iBinder) {
            return new IBinderParcelable(iBinder);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$m */
    private static class C12398m implements C12420e.C12423c<Integer> {
        private C12398m() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Integer num) {
            return new IntegerParcelable(num);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$n */
    private static class C12399n implements C12420e.C12423c<LinkedHashMap> {
        private C12399n() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(LinkedHashMap linkedHashMap) {
            return new LinkedHashMapParcelable(linkedHashMap);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$o */
    private static class C12400o implements C12420e.C12423c<LinkedHashSet> {
        private C12400o() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(LinkedHashSet linkedHashSet) {
            return new LinkedHashSetParcelable(linkedHashSet);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$p */
    private static class C12401p implements C12420e.C12423c<LinkedList> {
        private C12401p() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(LinkedList linkedList) {
            return new LinkedListParcelable(linkedList);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$q */
    private static class C12402q implements C12420e.C12423c<List> {
        private C12402q() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(List list) {
            return new ListParcelable(list);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$r */
    private static class C12403r implements C12420e.C12423c<Long> {
        private C12403r() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Long l) {
            return new LongParcelable(l);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$s */
    private static class C12404s implements C12420e.C12423c<Map> {
        private C12404s() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Map map) {
            return new MapParcelable(map);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$t */
    static class C12405t implements C12420e.C12423c<Parcelable> {
        C12405t() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Parcelable parcelable) {
            return new ParcelableParcelable(parcelable);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$u */
    private static class C12406u implements C12420e.C12423c<Set> {
        private C12406u() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Set set) {
            return new SetParcelable(set);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$v */
    private static class C12407v implements C12420e.C12423c<SparseArray> {
        private C12407v() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(SparseArray sparseArray) {
            return new SparseArrayParcelable(sparseArray);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$w */
    private static class C12408w implements C12420e.C12423c<SparseBooleanArray> {
        private C12408w() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(SparseBooleanArray sparseBooleanArray) {
            return new SparseBooleanArrayParcelable(sparseBooleanArray);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$x */
    private static class C12409x implements C12420e.C12423c<String> {
        private C12409x() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(String str) {
            return new StringParcelable(str);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$y */
    private static class C12410y implements C12420e.C12423c<Map> {
        private C12410y() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Map map) {
            return new TreeMapParcelable(map);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$z */
    private static class C12411z implements C12420e.C12423c<Set> {
        private C12411z() {
        }

        /* renamed from: a */
        public Parcelable mo40434a(Set set) {
            return new TreeSetParcelable(set);
        }
    }

    private NonParcelRepository() {
        HashMap hashMap = new HashMap();
        this.f32161a = hashMap;
        hashMap.put(Collection.class, new C12394i());
        this.f32161a.put(List.class, new C12402q());
        this.f32161a.put(ArrayList.class, new C12402q());
        this.f32161a.put(Set.class, new C12406u());
        this.f32161a.put(HashSet.class, new C12406u());
        this.f32161a.put(TreeSet.class, new C12411z());
        this.f32161a.put(SparseArray.class, new C12407v());
        this.f32161a.put(Map.class, new C12404s());
        this.f32161a.put(HashMap.class, new C12404s());
        this.f32161a.put(TreeMap.class, new C12410y());
        this.f32161a.put(Integer.class, new C12398m());
        this.f32161a.put(Long.class, new C12403r());
        this.f32161a.put(Double.class, new C12395j());
        this.f32161a.put(Float.class, new C12396k());
        this.f32161a.put(Byte.class, new C12391f());
        this.f32161a.put(String.class, new C12409x());
        this.f32161a.put(Character.class, new C12393h());
        this.f32161a.put(Boolean.class, new C12388c());
        this.f32161a.put(byte[].class, new C12390e());
        this.f32161a.put(char[].class, new C12392g());
        this.f32161a.put(boolean[].class, new C12387b());
        this.f32161a.put(IBinder.class, new C12397l());
        this.f32161a.put(Bundle.class, new C12389d());
        this.f32161a.put(SparseBooleanArray.class, new C12408w());
        this.f32161a.put(LinkedList.class, new C12401p());
        this.f32161a.put(LinkedHashMap.class, new C12399n());
        this.f32161a.put(SortedMap.class, new C12410y());
        this.f32161a.put(SortedSet.class, new C12411z());
        this.f32161a.put(LinkedHashSet.class, new C12400o());
    }

    /* renamed from: a */
    public static NonParcelRepository m40711a() {
        return f32160b;
    }

    public Map<Class, C12420e.C12423c> get() {
        return this.f32161a;
    }

    private static class ConverterParcelable<T> implements Parcelable, C12419d<T> {

        /* renamed from: f */
        private final T f32169f;

        /* renamed from: g */
        private final C12426g<T, T> f32170g;

        public int describeContents() {
            return 0;
        }

        public T getParcel() {
            return this.f32169f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f32170g.mo40475a(this.f32169f, parcel);
        }

        private ConverterParcelable(Parcel parcel, C12426g<T, T> gVar) {
            this(gVar.mo40474a(parcel), gVar);
        }

        private ConverterParcelable(T t, C12426g<T, T> gVar) {
            this.f32170g = gVar;
            this.f32169f = t;
        }
    }
}

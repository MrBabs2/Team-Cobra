package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p050l.p066e.C4868a;

public abstract class VersionedParcel {

    /* renamed from: a */
    protected final C4868a<String, Method> f2887a;

    /* renamed from: b */
    protected final C4868a<String, Method> f2888b;

    /* renamed from: c */
    protected final C4868a<String, Class> f2889c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C4868a<String, Method> aVar, C4868a<String, Method> aVar2, C4868a<String, Class> aVar3) {
        this.f2887a = aVar;
        this.f2888b = aVar2;
        this.f2889c = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4490a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4491a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4494a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4495a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4496a(boolean z);

    /* renamed from: a */
    public void mo4497a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4498a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo4499a(int i);

    /* renamed from: a */
    public boolean mo4500a(boolean z, int i) {
        if (!mo4499a(i)) {
            return z;
        }
        return mo4513d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract VersionedParcel mo4502b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo4503b(int i);

    /* renamed from: b */
    public void mo4509b(boolean z, int i) {
        mo4503b(i);
        mo4496a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo4511c(int i);

    /* renamed from: c */
    public boolean mo4512c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo4513d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo4514e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract CharSequence mo4515f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo4516g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract <T extends Parcelable> T mo4517h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo4518i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public <T extends C0793b> T mo4519j() {
        String i = mo4518i();
        if (i == null) {
            return null;
        }
        return mo4487a(i, mo4502b());
    }

    /* renamed from: a */
    public int mo4484a(int i, int i2) {
        if (!mo4499a(i2)) {
            return i;
        }
        return mo4516g();
    }

    /* renamed from: b */
    public void mo4510b(byte[] bArr, int i) {
        mo4503b(i);
        mo4498a(bArr);
    }

    /* renamed from: a */
    public String mo4489a(String str, int i) {
        if (!mo4499a(i)) {
            return str;
        }
        return mo4518i();
    }

    /* renamed from: b */
    public void mo4507b(CharSequence charSequence, int i) {
        mo4503b(i);
        mo4494a(charSequence);
    }

    /* renamed from: a */
    public byte[] mo4501a(byte[] bArr, int i) {
        if (!mo4499a(i)) {
            return bArr;
        }
        return mo4514e();
    }

    /* renamed from: b */
    public void mo4504b(int i, int i2) {
        mo4503b(i2);
        mo4511c(i);
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo4485a(T t, int i) {
        if (!mo4499a(i)) {
            return t;
        }
        return mo4517h();
    }

    /* renamed from: b */
    public void mo4508b(String str, int i) {
        mo4503b(i);
        mo4495a(str);
    }

    /* renamed from: a */
    public CharSequence mo4488a(CharSequence charSequence, int i) {
        if (!mo4499a(i)) {
            return charSequence;
        }
        return mo4515f();
    }

    /* renamed from: b */
    public void mo4505b(Parcelable parcelable, int i) {
        mo4503b(i);
        mo4491a(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4492a(C0793b bVar) {
        if (bVar == null) {
            mo4495a((String) null);
            return;
        }
        m3570b(bVar);
        VersionedParcel b = mo4502b();
        mo4493a(bVar, b);
        b.mo4490a();
    }

    /* renamed from: b */
    public void mo4506b(C0793b bVar, int i) {
        mo4503b(i);
        mo4492a(bVar);
    }

    /* renamed from: b */
    private void m3570b(C0793b bVar) {
        try {
            mo4495a(m3567a((Class<? extends C0793b>) bVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: b */
    private Method m3569b(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method method = this.f2887a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f2887a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: a */
    public <T extends C0793b> T mo4486a(T t, int i) {
        if (!mo4499a(i)) {
            return t;
        }
        return mo4519j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0793b> T mo4487a(String str, VersionedParcel versionedParcel) {
        try {
            return (C0793b) m3569b(str).invoke((Object) null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    private Method m3568b(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f2888b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a = m3567a((Class<? extends C0793b>) cls);
        System.currentTimeMillis();
        Method declaredMethod = a.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f2888b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0793b> void mo4493a(T t, VersionedParcel versionedParcel) {
        try {
            m3568b((Class) t.getClass()).invoke((Object) null, new Object[]{t, versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    private Class m3567a(Class<? extends C0793b> cls) throws ClassNotFoundException {
        Class cls2 = this.f2889c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f2889c.put(cls.getName(), cls3);
        return cls3;
    }
}

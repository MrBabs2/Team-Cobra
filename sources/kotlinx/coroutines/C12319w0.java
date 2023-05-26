package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.w0 */
/* compiled from: JobSupport.kt */
final class C12319w0 implements C12201f1 {

    /* renamed from: f */
    private final boolean f32140f;

    public C12319w0(boolean z) {
        this.f32140f = z;
    }

    /* renamed from: b */
    public boolean mo38848b() {
        return this.f32140f;
    }

    /* renamed from: c */
    public C12311t1 mo38849c() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo38848b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}

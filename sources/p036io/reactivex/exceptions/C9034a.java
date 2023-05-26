package p036io.reactivex.exceptions;

/* renamed from: io.reactivex.exceptions.a */
/* compiled from: Exceptions */
public final class C9034a {
    /* renamed from: a */
    public static void m29708a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}

package p036io.reactivex.exceptions;

/* renamed from: io.reactivex.exceptions.UndeliverableException */
public final class UndeliverableException extends IllegalStateException {
    public UndeliverableException(Throwable th) {
        super("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
    }
}

package kotlin.p392j0;

/* renamed from: kotlin.j0.l */
/* compiled from: StringNumberConversionsJVM.kt */
final class C12118l {

    /* renamed from: a */
    public static final C12113j f31891a;

    static {
        new C12118l();
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f31891a = new C12113j("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|" + "(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|" + "((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|" + "(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private C12118l() {
    }
}

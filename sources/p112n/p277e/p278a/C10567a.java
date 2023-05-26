package p112n.p277e.p278a;

/* renamed from: n.e.a.a */
public enum C10567a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    

    /* renamed from: f */
    private final String f28423f;

    private C10567a(String str) {
        this.f28423f = str;
    }

    public final String toString() {
        return this.f28423f;
    }
}

package kotlin.p392j0;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.p220g0.C9146c;

/* renamed from: kotlin.j0.k */
/* compiled from: Regex.kt */
public final class C12117k {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C12106h m39972b(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C12109i(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C9146c m39971b(MatchResult matchResult, int i) {
        return C9150f.m29854d(matchResult.start(i), matchResult.end(i));
    }
}

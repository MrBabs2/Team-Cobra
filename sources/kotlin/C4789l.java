package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlin.l */
/* compiled from: Metadata.kt */
public @interface C4789l {
    /* renamed from: bv */
    int[] mo16639bv() default {};

    /* renamed from: d1 */
    String[] mo16640d1() default {};

    /* renamed from: d2 */
    String[] mo16641d2() default {};

    /* renamed from: k */
    int mo16642k() default 1;

    /* renamed from: mv */
    int[] mo16643mv() default {};

    /* renamed from: pn */
    String mo16644pn() default "";

    /* renamed from: xi */
    int mo16645xi() default 0;

    /* renamed from: xs */
    String mo16646xs() default "";
}

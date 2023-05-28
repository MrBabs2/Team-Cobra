package com.airbnb.epoxy;

/* renamed from: com.airbnb.epoxy.z */
/* compiled from: ImmutableModelException */
class C5641z extends RuntimeException {
    C5641z(C5631s sVar, int i) {
        this(sVar, "", i);
    }

    /* renamed from: a */
    private static String m10731a(C5631s sVar, String str, int i) {
        return str + " Position: " + i + " Model: " + sVar.toString() + "\n\n" + "Epoxy attribute fields on a model cannot be changed once the model is added to a controller. Check that these fields are not updated, or that the assigned objects are not mutated, outside of the buildModels method. The only exception is if the change is made inside an Interceptor callback. Consider using an interceptor if you need to change a model after it is added to the controller and before it is set on the adapter. If the model is already set on the adapter then you must call `requestModelBuild` instead to recreate all models.";
    }

    C5641z(C5631s sVar, String str, int i) {
        super(m10731a(sVar, str, i));
    }
}

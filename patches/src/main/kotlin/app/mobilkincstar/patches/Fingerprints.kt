package app.mobilkincstar.patches

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.methodCall
import com.android.tools.smali.dexlib2.AccessFlags

object BiometricUtilsFingerprint : Fingerprint(
    definingClass = "Lcom/sbaiahmed1/reactnativebiometrics/BiometricUtils;",
    name = "isDeviceRooted",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    parameters = listOf("Landroid/content/Context;"),
    filters = listOf(
        methodCall(
            definingClass = "Lcom/sbaiahmed1/reactnativebiometrics/BiometricUtils;",
            name = "checkRootMethod1"
        )
    )
)

object ScreenshotProtectionFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/C1570f;",
    name = "a",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Landroid/view/Window;", "I", "I")
)

object SSLPinningFingerprint : Fingerprint(
    definingClass = "Lokhttp3/CertificatePinner;",
    name = "check",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;", "Ljava/util/List;")
)

object KeyboardDetectionFingerprint : Fingerprint(
    definingClass = "Lcom/learnium/RNDeviceInfo/RNDeviceModule;",
    name = "hasKeyboard",
    accessFlags = listOf(AccessFlags.PRIVATE),
    returnType = "Z",
    parameters = listOf("Ljava/lang/String;")
)

object TamperReporterFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/k;",
    name = "a",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;")
)

object TamperThreadStarterFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/k;",
    name = "b",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf()
)

object MainApplicationOnCreateFingerprint : Fingerprint(
    definingClass = "Lcom/mobilkincstar/MainApplication;",
    name = "onCreate",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf(),
    filters = listOf(
        methodCall(
            definingClass = "Ligknimiyn/ac;",
            name = "d",
            returnType = "Z"
        )
    )
)

object ProtectorRegistrationFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/E;",
    name = "a",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "V",
    parameters = listOf("Ljava/lang/Class;", "I")
)

object IntegrityStatusFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/ac;",
    name = "d",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf()
)

object ProtectorInitFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/ac;",
    name = "c",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.SYNCHRONIZED),
    returnType = "V",
    parameters = listOf()
)

object ProtectorInitInternalFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/ac;",
    name = "d",
    accessFlags = listOf(AccessFlags.PRIVATE, AccessFlags.STATIC, AccessFlags.SYNCHRONIZED),
    returnType = "V",
    parameters = listOf("Ligknimiyn/O;")
)

object ProtectorBaseOnCreateFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/O;",
    name = "onCreate",
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "V",
    parameters = listOf()
)

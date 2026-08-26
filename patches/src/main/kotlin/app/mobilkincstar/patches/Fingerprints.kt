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

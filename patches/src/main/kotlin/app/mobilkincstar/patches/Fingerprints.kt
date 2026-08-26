package app.mobilkincstar.patches

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.methodCall
import com.android.tools.smali.dexlib2.AccessFlags

object BiometricUtilsFingerprint : Fingerprint(
    definingClass = "Lcom/sbaiahmed1/reactnativebiometrics/BiometricUtils;",
    name = "isDeviceRooted",
    returnType = "Z",
    parameters = listOf("Landroid/content/Context;")
)

object SSLPinningFingerprint : Fingerprint(
    definingClass = "Lokhttp3/CertificatePinner;",
    name = "check",
    returnType = "V",
    parameters = listOf("Ljava/lang/String;", "Ljava/util/List;")
)

object KeyboardDetectionFingerprint : Fingerprint(
    definingClass = "Lcom/learnium/RNDeviceInfo/RNDeviceModule;",
    name = "hasKeyboard",
    returnType = "Z",
    parameters = listOf("Ljava/lang/String;")
)

object TamperReporterFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/k;",
    name = "a",
    returnType = "V",
    parameters = listOf("Ljava/lang/String;")
)

object TamperThreadStarterFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/k;",
    name = "b",
    returnType = "V",
    parameters = listOf()
)

object IntegrityStatusFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/ac;",
    name = "d",
    returnType = "Z",
    parameters = listOf()
)

object ProtectorInitFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/ac;",
    name = "c",
    returnType = "V",
    parameters = listOf()
)

object ProtectorInitInternalFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/ac;",
    name = "d",
    returnType = "V",
    parameters = listOf("Ligknimiyn/O;")
)

object ProtectorBaseOnCreateFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/O;",
    name = "onCreate",
    returnType = "V",
    parameters = listOf()
)

object MainApplicationOnCreateFingerprint : Fingerprint(
    definingClass = "Lcom/mobilkincstar/MainApplication;",
    name = "onCreate",
    returnType = "V",
    parameters = listOf()
)

object ReactModalScreenshotFingerprint : Fingerprint(
    definingClass = "Lcom/facebook/react/views/modal/d;",
    name = "c",
    returnType = "Z",
    parameters = listOf("Landroid/app/Activity;")
)

object ProtectorService1Fingerprint : Fingerprint(
    definingClass = "Ligknimiyn/o;",
    name = "onCreate",
    returnType = "V",
    parameters = listOf()
)

object ProtectorService2Fingerprint : Fingerprint(
    definingClass = "Ligknimiyn/n;",
    name = "onCreate",
    returnType = "V",
    parameters = listOf()
)

object ProtectorService3Fingerprint : Fingerprint(
    definingClass = "Ligknimiyn/B;",
    name = "onCreate",
    returnType = "V",
    parameters = listOf()
)

object ProtectorLifecycleFingerprint : Fingerprint(
    definingClass = "Ligknimiyn/C1571g;",
    name = "onActivityResumed",
    returnType = "V",
    parameters = listOf("Landroid/app/Activity;")
)

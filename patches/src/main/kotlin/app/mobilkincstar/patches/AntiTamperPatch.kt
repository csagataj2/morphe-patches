package app.mobilkincstar.patches

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.mobilkincstar.patches.shared.Constants.COMPATIBILITY_MOBILKINCSTAR

@Suppress("unused")
val antiTamperPatch = bytecodePatch(
    name = "Disable Tamper Protection",
    description = "Prevents the application from crashing or hanging when it detects modifications.",
    default = true
) {
    compatibleWith(COMPATIBILITY_MOBILKINCSTAR)

    execute {
        TamperReporterFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )

        TamperThreadStarterFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )

        ProtectorInitFingerprint.method.addInstructions(
            0,
            """
                const-string v0, "dorsum_clavis_kincstar"
                invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
                return-void
            """
        )

        ProtectorInitInternalFingerprint.method.addInstructions(
            0,
            """
                return-void
            """
        )

        ProtectorBaseOnCreateFingerprint.method.addInstructions(
            0,
            """
                invoke-super {p0}, Landroid/app/Application;->onCreate()V
                return-void
            """
        )

        MainApplicationOnCreateFingerprint.method.addInstructions(
            0,
            """
                invoke-super {p0}, Ligknimiyn/O;->onCreate()V
                invoke-static {p0}, Lcom/facebook/react/z;->a(Landroid/content/Context;)V
                return-void
            """
        )
    }
}

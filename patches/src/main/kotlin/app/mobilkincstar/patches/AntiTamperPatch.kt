package app.mobilkincstar.patches

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.mobilkincstar.patches.shared.Constants.COMPATIBILITY_MOBILKINCSTAR

@Suppress("unused")
val antiTamperPatch = bytecodePatch(
    name = "Disable Tamper Protection",
    description = "Prevents the application from crashing when it detects modifications.",
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
    }
}

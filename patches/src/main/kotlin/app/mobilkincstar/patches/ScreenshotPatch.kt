package app.mobilkincstar.patches

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.mobilkincstar.patches.shared.Constants.COMPATIBILITY_MOBILKINCSTAR

@Suppress("unused")
val screenshotPatch = bytecodePatch(
    name = "Disable Screenshot Protection",
    description = "Allows taking screenshots and screen recording in MobilKincstár.",
    default = true
) {
    compatibleWith(COMPATIBILITY_MOBILKINCSTAR)

    execute {
        ScreenshotProtectionFingerprint.method.addInstructions(
            0,
            """
                const/16 v0, 0x2000
                not-int v0, v0
                and-int/2addr p1, v0
                and-int/2addr p2, v0
                invoke-virtual {p0, p1, p2}, Landroid/view/Window;->setFlags(II)V
                return-void
            """
        )
    }
}

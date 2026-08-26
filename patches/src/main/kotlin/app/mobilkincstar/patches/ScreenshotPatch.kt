package app.mobilkincstar.patches

import app.morphe.patcher.patch.bytecodePatch
import app.mobilkincstar.patches.shared.Constants.COMPATIBILITY_MOBILKINCSTAR

@Suppress("unused")
val screenshotPatch = bytecodePatch(
    name = "Disable Screenshot Protection",
    description = "Allows taking screenshots and screen recording in MobilKincstár. (Currently disabled due to compatibility issues)",
    default = false
) {
    compatibleWith(COMPATIBILITY_MOBILKINCSTAR)

    execute {
        // TODO: Target Java call sites instead of native wrapper
    }
}

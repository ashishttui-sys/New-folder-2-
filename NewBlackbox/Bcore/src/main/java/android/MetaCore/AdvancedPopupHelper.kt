package android.MetaCore

import android.app.Activity
import org.lsposed.lsparanoid.Obfuscate

/**
 * Panel UI has been intentionally disabled for AAR builds.
 * Keeping this API as a no-op preserves binary compatibility.
 */
@Obfuscate
object AdvancedPopupHelper {

    @JvmStatic
    fun show(activity: Activity) {
        // no-op: panel removed by request
    }
}

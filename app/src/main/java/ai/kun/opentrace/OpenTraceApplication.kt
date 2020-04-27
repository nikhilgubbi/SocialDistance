package ai.kun.opentrace

import ai.kun.opentrace.util.NotificationUtils
import ai.kun.opentrace.worker.BLETrace
import android.app.Application

class OpenTraceApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        BLETrace.init(applicationContext!!)
        NotificationUtils.init(applicationContext!!)
    }
}
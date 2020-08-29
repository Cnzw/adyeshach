package ink.ptms.adyeshach

import ink.ptms.adyeshach.api.Settings
import ink.ptms.adyeshach.common.script.Kether
import ink.ptms.adyeshach.common.script.ScriptService
import io.izzel.taboolib.Version
import io.izzel.taboolib.loader.Plugin
import io.izzel.taboolib.loader.PluginBase
import io.izzel.taboolib.module.config.TConfig
import io.izzel.taboolib.module.inject.TInject

object Adyeshach : Plugin() {

    @TInject(locale = "Language")
    lateinit var conf: TConfig
        private set

    var settings = Settings()
        private set

    override fun onLoad() {
        if (Version.isBefore(Version.v1_9)) {
            PluginBase.setDisabled(true)
            println("[Adyeshach] Sorry, The Adyeshach not supported this minecraft version.")
        }
    }

    fun reload() {
        settings = Settings()
    }
}

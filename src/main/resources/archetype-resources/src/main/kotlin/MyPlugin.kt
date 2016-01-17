#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

import com.google.inject.Inject
import ninja.leaping.configurate.commented.CommentedConfigurationNode
import ninja.leaping.configurate.loader.ConfigurationLoader
import org.slf4j.Logger
import org.spongepowered.api.Game
import org.spongepowered.api.event.game.state.GamePreInitializationEvent
import org.spongepowered.api.event.game.state.GameStoppingServerEvent
import org.spongepowered.api.plugin.Plugin
import org.spongepowered.api.config.DefaultConfig
import org.spongepowered.api.event.Listener

/**
 * A simple sponge plugin
 */
@Plugin(id = PomData.ARTIFACT_ID, name = PomData.NAME, version = PomData.VERSION)
class MyPlugin {
    // These are all injected on plugin load for users to work from
    @Inject private lateinit var logger: Logger
    // Give us a configuration to work from
    @Inject @DefaultConfig(sharedRoot = true) private lateinit var configLoader: ConfigurationLoader<CommentedConfigurationNode>
    @Inject private lateinit var game: Game

    @Listener
    fun onPreInit(event: GamePreInitializationEvent) {
        // Perform initialization tasks here
    }

    @Listener
    fun disable(event: GameStoppingServerEvent) {
        // Perform shutdown tasks here
    }
}

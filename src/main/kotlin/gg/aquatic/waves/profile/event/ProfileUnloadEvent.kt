package gg.aquatic.waves.profile.event

import gg.aquatic.waves.profile.AquaticPlayer
import gg.aquatic.waves.util.event.AquaticEvent

class ProfileUnloadEvent(
    val profile: AquaticPlayer
): AquaticEvent() {
}
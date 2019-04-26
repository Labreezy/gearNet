package memscan

/**
 * memscan.XrdApi
 * provides [PlayerData]
 * provides [MatchData]
 */
interface XrdApi {

    /**
     * @return Is Xrd running and ready to serve data
     */
    fun isConnected(): Boolean

    /**
     * @return a List of the Xrd lobby's active players and their data
     */
    fun getXrdData(): List<PlayerData>

}


class PlayerData(
    val steamUserId: Long,
    val displayName: String,
    val characterId: Byte,
    val cabinetLoc: Byte,
    val playerSide: Byte,
    val matchesWon: Int,
    val matchesSum: Int,
    val loadingPct: Int)


class MatchData(
    val players: Pair<PlayerData, PlayerData>,
    val tension: Pair<Int, Int>,
    val health: Pair<Int, Int>,
    val burst: Pair<Int, Int>,
    val timer: Int
    // Buttons pressed?
    // Direction pressed?
    // Tension Pulse?
    // Stun level?
)
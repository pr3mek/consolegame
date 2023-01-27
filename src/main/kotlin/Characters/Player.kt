package Style.Characters
import Style.Game.Coordinate
import Style.Places.Capital

class Player(private val _name: String) {
    val name = _name
        get() = field.capitalize().trim()

    var actualcoordinate : Coordinate = Coordinate(Capital().coordinate.x, Capital().coordinate.y)
    var isCombat = false
    var exp = 1
    var lvl = 1
    var healPoints = 100

    var attack = 55
    var protection = 1

    fun isCombat(player: Player) {
        player.isCombat = true
    }
}
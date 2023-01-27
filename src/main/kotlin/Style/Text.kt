package Style

val WORLD_NAME = "Dungeon Explore"
const val START_LOCATION = "Stolica"

val WELCOME_INFO = "Aby poruszać się po świecie $WORLD_NAME wystarczy, że wpiszesz odpowiedną komendę. Dla każdego etapu gry dostępne sa komenty, aby zobaczyć listę komend wpisz help\n" +
        "Jeżeli to nie jest Twoja pierwsza przygoda z $WORLD_NAME możesz stworzyć nową postać."

const val NO_CHARACTER = "Najpierw się przedstaw! Stwórz swoją postać!"

val CHARACTER_CREATED = fun(playerName: String) : String { return "$playerName, my się już poznaliśmy!" }

const val NO_COMMAND = "Nie wiem co to znaczy.. spróbuj inaczej."
val HELLO_MESS = "Witaj w świecie $WORLD_NAME! Czeka Cię niezapomniana przygoda...!"
const val YOUR_TURN = "Twój ruch: "
const val CHANGE_LOCATION = "Wybierz lokację z listy i potwierdź, żeby się do niej przenieść."
val APROVE_LOCATION = fun(name: String) : String { return "Czy na pewno chcesz się przenieść do lokacji $name?" }
const val CHOOSE_LOCATION = "Wybierz lokację, do której chcesz się przenieść."
val ACTUAL_LOCATION = fun(name: String) : String { return "Obecnie znajdujesz się w lokacji $name"}
val WRONG_LOCATION = fun(name: String) : String { return "Już jesteś w $name, nie możesz się tu przenieść jeszcze raz"}
//val ATTACKED = fun(name: String, lvl: Int) : String { return isCombat("Zostałeś zaatakowany przez $name, lvl: $lvl!") }
const val MISS = "MISS"

//val TAKE_DAMAGE = fun(monsterName: String, damageValue: Int) : String {
//    return "Otrzymałeś ${TextColors.red(damageValue.toString())} obrażeń od $monsterName"}

val PLAYER_HEALTH = fun(health: Int) : String {
    return "Zostało Ci $health zdrowia." }

//val GIVE_DAMAGE = fun(damageValue: Int) : String {
//   return "Zadałeś ${ attackValue(damageValue.toString()) } obrażeń przeciwnikowi." }
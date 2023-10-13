package behavioral.command.airconditioner

class TurnACOnCommand(private val ac: AirConditioner): ICommand {
    override fun execute() {
        ac.turnOnAC()
    }
}

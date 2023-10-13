package behavioral.command.airconditioner

class TurnACOffCommand(private val ac: AirConditioner): ICommand {
    override fun execute() {
        ac.turnOffAC()
    }
}
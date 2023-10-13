package behavioral.command.airconditioner

fun main(args: Array<String>) {
    val ac = AirConditioner()
    val remote = MyRemoteControl()
    remote.setCommand(TurnACOnCommand(ac))
    remote.pressButton()
}

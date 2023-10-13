package behavioral.mediator.airtrafficcontrol

class Runway(private val iatcMediator: IATCMediator): Command {
    init {
        iatcMediator.setLandingStatus(true)
    }

    override fun land() {
        println("Landing permission granted")
        iatcMediator.setLandingStatus(true)
    }
}

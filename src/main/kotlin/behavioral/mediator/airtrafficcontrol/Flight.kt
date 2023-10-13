package behavioral.mediator.airtrafficcontrol

class Flight(private val atcIATCMediator: IATCMediator) {

    fun land() {
        if(atcIATCMediator.isLandingOK()) {
            println("Successfully Landed.")
            atcIATCMediator.setLandingStatus(true)
        } else {
            println("Waiting for landing")
        }
    }

    fun getReady() {
        println("Ready for landing")
    }

}

package behavioral.mediator.airtrafficcontrol

fun main() {
    val atcMediator = ATCMediator()
    val sparrow = Flight(atcMediator)
    val mainRunway = Runway(atcMediator)
    atcMediator.registerFlight(sparrow)
    atcMediator.registerRunway(mainRunway)
    sparrow.getReady()
    mainRunway.land()
    sparrow.land()
}

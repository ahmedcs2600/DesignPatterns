package behavioral.mediator.airtrafficcontrol

interface IATCMediator {
    fun registerRunway(runway: Runway)
    fun registerFlight(flight: Flight)
    fun isLandingOK(): Boolean
    fun setLandingStatus(status: Boolean)
}

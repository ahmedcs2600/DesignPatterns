package behavioral.mediator.airtrafficcontrol

class ATCMediator: IATCMediator {

    private lateinit var flight: Flight
    private lateinit var runway: Runway
    private var land = false

    override fun registerRunway(runway: Runway) {
        this.runway = runway
    }

    override fun registerFlight(flight: Flight) {
        this.flight = flight
    }

    override fun isLandingOK(): Boolean {
        return land
    }

    override fun setLandingStatus(status: Boolean) {
        land = true
    }
}

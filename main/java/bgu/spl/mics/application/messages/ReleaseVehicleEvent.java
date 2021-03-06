package bgu.spl.mics.application.messages;
import bgu.spl.mics.Event;
import bgu.spl.mics.application.passiveObjects.DeliveryVehicle;

public class ReleaseVehicleEvent implements Event {
    DeliveryVehicle vehicle;
    public ReleaseVehicleEvent(DeliveryVehicle vehicle){
        this.vehicle=vehicle;
    }

    public DeliveryVehicle getVehicle() {
        return vehicle;
    }

    public String toString(){return "Releasing vehicle "+ vehicle.getLicense();}
}

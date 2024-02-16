package lowleveldesign.elevator;

import java.util.List;

public class InternalElevatorButtonDispatcher {
    private List<ElevatorController> elevatorControllerList;

    public InternalElevatorButtonDispatcher(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }


    public List<ElevatorController> getElevatorControllerList() {
        return elevatorControllerList;
    }

    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitRequest(ElevatorCar elevatorCar, int destinationFloor, Direction direction) {
        elevatorControllerList.get(elevatorCar.getElevatorId()).submitNewRequest(elevatorCar, destinationFloor, direction);
    }
}

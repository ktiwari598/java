package lowleveldesign.elevator;

public class InternalElevatorButton {
    private InternalElevatorButtonDispatcher internalElevatorButtonDispatcher;

    public InternalElevatorButton(InternalElevatorButtonDispatcher internalElevatorButtonDispatcher) {
        this.internalElevatorButtonDispatcher = internalElevatorButtonDispatcher;
    }

    public void pressButton(ElevatorCar elevatorCar, int destinationFloor, Direction direction) {
        internalElevatorButtonDispatcher.submitRequest(elevatorCar, destinationFloor, direction);
    }

    public InternalElevatorButtonDispatcher getInternalElevatorButtonDispatcher() {
        return internalElevatorButtonDispatcher;
    }

    public void setInternalElevatorButtonDispatcher(InternalElevatorButtonDispatcher internalElevatorButtonDispatcher) {
        this.internalElevatorButtonDispatcher = internalElevatorButtonDispatcher;
    }
}

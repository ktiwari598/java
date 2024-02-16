package lowleveldesign.elevator;

public class ElevatorCar {
    private int elevatorId;
    private int currentFloor;
    private InternalElevatorButton internalElevatorButton;

    private Status status;
    private Direction direction;

    public ElevatorCar(int elevatorId, int currentFloor, InternalElevatorButton internalElevatorButton, Status status, Direction direction) {
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
        this.internalElevatorButton = internalElevatorButton;
        this.status = status;
        this.direction = direction;
    }

    public void move() {

    }

    public int getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public InternalElevatorButton getInternalElevatorButton() {
        return internalElevatorButton;
    }

    public void setInternalElevatorButton(InternalElevatorButton internalElevatorButton) {
        this.internalElevatorButton = internalElevatorButton;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}

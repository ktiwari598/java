package lowleveldesign.elevator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorController {
    private ElevatorCar elevatorCar;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

    private Queue<Integer> pendingQueue = new LinkedList<>();

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public void submitNewRequest(ElevatorCar elevatorCar, int destinationFloor, Direction direction) {
        Direction elevatorDirection = elevatorCar.getDirection();
        int currentFloor = elevatorCar.getCurrentFloor();
        if(elevatorDirection.equals(direction)) {
            if(destinationFloor < currentFloor) {
                pendingQueue.add(destinationFloor);
            }
        }
        else {
            maxHeap.add(destinationFloor);
        }
    }

    public void controlElevatorCar() {

    }

}

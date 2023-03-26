package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        List<Car> cars = setRacingCars();
        Racing racing = new Racing(cars, inputView.inputTryCount());
        for (int i = 0; i < racing.getTryCount(); i++) {
            racing.race();
            for(Car car : cars) resultView.printRace(car);
            resultView.printEmptyLine();
        }
        resultView.printRaceResult(racing.getWinner());
    }

    private static List<Car> setRacingCars(){
        InputView inputView = new InputView();
        int carCount = inputView.inputCarCount();
        List<Car> cars = new ArrayList<>(carCount);
        for (int i = 0; i < carCount; i++) {
            Car car = new Car(inputView.inputCarName(i + 1));
            cars.add(car);
        }
        return cars;
    }
}

package racingcar;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RacingCarService {
    public RacingResponse racing(String inputName, int inputTryNumber) {
        System.out.println("inputName" + inputName);
        System.out.println("inputTryNumber" + inputTryNumber);
//        int carCount = inputView.inputCarCount();
//        List<Car> cars = new ArrayList<>(carCount);
//        for (int i = 0; i < carCount; i++) {
//            Car car = new Car(inputView.inputCarName(i + 1));
//            cars.add(car);
//        }
//        Racing racing = new Racing(cars, inputView.inputTryCount());
//        for (int i = 0; i < racing.getTryCount(); i++) {
//            racing.race();
//            for(Car car : cars) resultView.printRace(car);
//            resultView.printEmptyLine();
//        }
//        resultView.printRaceResult(racing.getWinner());
        RacingResponse racingResponse = new RacingResponse();
        return racingResponse;
    }
}

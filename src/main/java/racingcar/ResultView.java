package racingcar;

public class ResultView {
    public void printRace(Car car) {
        System.out.println(car.getName() + " : " + car.getPrintScore());
    }
    public void printEmptyLine() {
        System.out.println();
    }

    public void printRaceResult(String winner) {
        System.out.println("최종 우승자: " + winner);
    }
}

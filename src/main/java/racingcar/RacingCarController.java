package racingcar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RacingCarController {
    final RacingCarService racingCarService;

    public RacingCarController(RacingCarService racingCarService) {
        this.racingCarService = racingCarService;
    }

    @PostMapping("/plays")
    public ResponseEntity<RacingResponse> racingGame(@RequestBody RacingRequest racingRequest) {
        RacingResponse racingResponse = racingCarService.racing(racingRequest.getNames(),
                racingRequest.getCount());
        return ResponseEntity.ok().body(racingResponse);
    }

//    @GetMapping("playsList")
//    public ResponseEntity<List<PlayResultOut>> racingStart() {
//        return new ResponseEntity<>(racingService.playList(),
//                HttpStatus.OK);
//    }
}

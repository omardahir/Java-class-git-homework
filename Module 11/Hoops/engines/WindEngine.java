package engines;

import models.GameModel;
import models.BallModel;

public class WindEngine {
  public void updateState(GameModel state) {
    double  pastXPosition = state.getBall().getxVelocity();
    state.getBall().setxVelocity(pastXPosition -.01);
  }
}

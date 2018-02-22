package engines;

import models.GameModels;

public class CollisionEngine {
  public void updateState(GameModel gameModel) {
    if (gameModel.getBall().getY() < 0) {
      gameModel.getBall().setY(0);
      double oldYVelocity = gameModel.getBall().getyVelocity();
      gameModel.getBall().setyVelocity(-(oldYVelocity))
    }
  }
}

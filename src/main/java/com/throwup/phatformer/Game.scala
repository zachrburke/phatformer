package com.throwup.phatformer

import org.newdawn.slick.{Graphics, GameContainer, BasicGame, AppGameContainer}

class Game extends BasicGame("A Slick 2D Game") {
  /** A counter... */
  private val player: Player = new Player()

  override def render(container: GameContainer, g: Graphics) {
    player.render(g)
  }

  override def init(container: GameContainer) {
  }

  override def update(container: GameContainer, delta: Int) {
    player.update(container, delta)
  }
}

object Game {
  val WIDTH: Int = 800
  val HEIGHT: Int = 600

  def main(args: Array[String]) {
    val app: AppGameContainer = new AppGameContainer(new Game)
    app.setDisplayMode(WIDTH, HEIGHT, false)
    app.setForceExit(false)
    app.start
  }
}

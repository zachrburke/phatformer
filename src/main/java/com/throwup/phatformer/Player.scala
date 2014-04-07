package com.throwup.phatformer

import org.newdawn.slick.{Input, GameContainer, Graphics}

class Player {

  var x: Float = 395f
  var y: Float = 295f

  val speed: Float = 0.5f

  def update(container: GameContainer, delta: Int) {
    val input = container.getInput

    if (input.isKeyDown(Input.KEY_A)) {
      x -= speed
    }
    if (input.isKeyDown(Input.KEY_S)) {
      y += speed
    }
    if (input.isKeyDown(Input.KEY_D)) {
      x += speed
    }
    if (input.isKeyDown(Input.KEY_W)) {
      y -= speed
    }
  }

  def render(g: Graphics) {
    g.drawRect(x, y, 10, 10)
  }

}

package com.lishoupeng;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

/**
 * @Description
 * @Author lishoupeng
 * @Date 2023/8/28 15:24
 */
public class BasicGameApp extends GameApplication {

  @Override
  protected void initSettings(GameSettings settings) {
    settings.setWidth(800);
    settings.setHeight(600);
    settings.setTitle("Basic Game App");
  }

  public static void main(String[] args) {
    launch(args);
  }
}
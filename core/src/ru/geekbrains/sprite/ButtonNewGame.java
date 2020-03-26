package ru.geekbrains.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.base.ScaledButton;
import ru.geekbrains.math.Rect;
import ru.geekbrains.screen.GameScreen;

public class ButtonNewGame extends ScaledButton {
    private static final float PADDING = 0.05f;

    private GameScreen gameScreen;

    public ButtonNewGame (TextureAtlas atlas, GameScreen gameScreen) {
        super(atlas.findRegion("button_new_game"));
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.07f);
        setBottom(worldBounds.getBottom() + PADDING*6);
    }

    @Override
    public void action() {

    }
}

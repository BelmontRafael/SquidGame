package chon.group.game.drawer;

public interface EnvironmentDrawer {

    void clearEnvironment();

    void drawBackground();

    void drawAgents();

    void drawLifeBar();

    void drawStatusPanel();

    void drawPauseScreen();

    void drawGameOverScreen();

    void drawVictoryScreen();

    void drawCollectibles();

    void drawScore();
}
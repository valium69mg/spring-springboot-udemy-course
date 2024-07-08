package gameWithBeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameRunnerConfiguration {

	
	@Bean
	public GameRunner GameRunner(Game marioGame) {
		var gameRunner = new GameRunner(marioGame);
		return gameRunner;
	}
	
	@Bean
	public Game marioGame() {
		var game = new MarioGame();
		return game;
	}

}

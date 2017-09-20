package com.drmilk.nbawrapper.domain;

import java.util.List;

import com.drmilk.nbawrapper.domain.utils.boxscore.Boxscore;
import com.drmilk.nbawrapper.domain.utils.scoreboard.GameDetails;
import com.drmilk.nbawrapper.domain.utils.scoreboard.Scoreboard;
import com.drmilk.nbawrapper.exception.BoxscoreNotFoundException;
import com.drmilk.nbawrapper.exception.ScoreboardNotFoundException;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LeagueTest extends TestCase {

	public void testGetValidScoreboard() throws ScoreboardNotFoundException {
		Scoreboard league = League.getScoreboard(25, 12, 2016);
		Assert.assertNotNull(league);
		List<GameDetails> gameList = league.getGames();
		Assert.assertEquals(5, gameList.size());
		Assert.assertEquals(new Integer(5), league.getNumGames());
		boolean cavsWarGameFoud = false;
		for (GameDetails game : gameList) {
			if (game.getHomeTeamScore().getTriCode().equals("CLE")
					&& game.getVisitingTeamScore().getTriCode().equals("GSW")) {
				cavsWarGameFoud = true;
				break;
			}
		}
		Assert.assertTrue(cavsWarGameFoud);
	}

	public void testGetValidBoxscore() throws BoxscoreNotFoundException {
		Boxscore boxscore = League.getBoxscore(25, 12, 2016, "0021600457");
		Assert.assertNotNull(boxscore);
		Assert.assertEquals("109", boxscore.getBasicGameData().getHomeTeam().getScore());
		Assert.assertEquals("108", boxscore.getBasicGameData().getVisitingTeam().getScore());
	}
}

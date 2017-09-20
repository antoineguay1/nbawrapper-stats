package com.drmilk.nbawrapper.domain;

import com.drmilk.nbawrapper.exception.TeamNotFoundException;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TeamTest extends TestCase {

	public void testGetHawksShortProfileFromTeamId() throws TeamNotFoundException {
		TeamMin teamMin = Team.getShortProfileByTeamId("1610612737");
		Assert.assertNotNull(teamMin);
		Assert.assertEquals(Team.LOGO_BASE_URL + "ATL" + Team.LOGO_END_URL, teamMin.getLogoUrl());
		Assert.assertEquals("Atlanta Hawks", teamMin.getFullName());
		Assert.assertEquals("ATL", teamMin.getTriCode());
	}

	public void testGetHawksFromPersonId() throws TeamNotFoundException {
		Team team = Team.getTeamById("1610612737");
		Assert.assertNotNull(team);
		Assert.assertEquals("Atlanta", team.getCity());
		Assert.assertEquals("Atlanta Hawks", team.getFullName());
		Assert.assertTrue(team.getGames().size() > 0);
		Assert.assertTrue(team.getRoster().size() > 0);
		Assert.assertNotNull(team.getTeamLeaders());
		Assert.assertEquals(Team.LOGO_BASE_URL + "ATL" + Team.LOGO_END_URL, team.getLogoUrl());
	}

	public void testSearchForHawksByTeamName() throws TeamNotFoundException {
		Team team = Team.getTeamByNameKeywords("Hawks");
		Assert.assertNotNull(team);
		Assert.assertEquals("Atlanta", team.getCity());
		Assert.assertEquals("Atlanta Hawks", team.getFullName());
		Assert.assertTrue(team.getGames().size() > 0);
		Assert.assertTrue(team.getRoster().size() > 0);
		Assert.assertNotNull(team.getTeamLeaders());
		Assert.assertEquals(Team.LOGO_BASE_URL + "ATL" + Team.LOGO_END_URL, team.getLogoUrl());
	}
	
	public void testSearchForRaptorsByCity() throws TeamNotFoundException {
		Team team = Team.getTeamByNameKeywords("Toronto");
		Assert.assertNotNull(team);
		Assert.assertEquals("Toronto", team.getCity());
		Assert.assertEquals("Toronto Raptors", team.getFullName());
		Assert.assertTrue(team.getGames().size() > 0);
		Assert.assertTrue(team.getRoster().size() > 0);
		Assert.assertNotNull(team.getTeamLeaders());
	}

	public void testGetTeamFromInvalidTeamId() {
		try {
			Team.getTeamById("invalidID");
			Assert.assertTrue(false);
		} catch (TeamNotFoundException e) {
			Assert.assertTrue(true);
		}
	}

}

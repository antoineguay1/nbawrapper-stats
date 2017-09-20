package com.drmilk.nbawrapper.domain;

import java.util.Map;

import com.drmilk.nbawrapper.exception.TeamNotFoundException;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TeamTest extends TestCase {
	
	public void testGetHawksShortProfileFromTeamId() throws TeamNotFoundException {
		Map<String, String> resultMap = Team.getShortProfileByTeamId("1610612737");
		Assert.assertNotNull(resultMap);
		Assert.assertEquals(Team.LOGO_BASE_URL + "ATL" + Team.LOGO_END_URL, resultMap.get("logoUrl"));
		Assert.assertEquals("Atlanta Hawks", resultMap.get("fullName"));
		Assert.assertEquals("ATL", resultMap.get("triCode"));
	}
	
	public void testGetHawksFromPersonId() throws TeamNotFoundException {
		Team team = new Team("1610612737");
		Assert.assertNotNull(team);
		Assert.assertEquals("Atlanta", team.getCity());
		Assert.assertEquals("Atlanta Hawks", team.getFullName());
		Assert.assertTrue(team.getGames().size() > 0);
		Assert.assertTrue(team.getRoster().size() > 0);
		Assert.assertNotNull(team.getTeamLeaders());
		Assert.assertEquals(Team.LOGO_BASE_URL + "ATL" + Team.LOGO_END_URL, team.getLogoUrl());
	}
	
	public void testGetTeamFromInvalidTeamId() {
		try {
			new Team("invalidID");
			Assert.assertTrue(false);
		} catch (TeamNotFoundException e) {
			Assert.assertTrue(true);
		}
	}

}

package com.drmilk.nbawrapper.domain;

import java.util.Map;

import com.drmilk.nbawrapper.exception.PlayerNotFoundException;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author Antoine Guay
 *
 */
public class PlayerTest extends TestCase {

	public void testGetDennisSchroderShortProfileFromPersonId() throws PlayerNotFoundException {
		Map<String, String> nameMap = Player.getShortProfileByPersonId("203471");
		Assert.assertNotNull(nameMap);
		Assert.assertEquals("Dennis", nameMap.get("firstName"));
		Assert.assertEquals("Schroder", nameMap.get("lastName"));
	}
	
	public void testGetDennisSchroderFromPersonId() throws PlayerNotFoundException {
		Player player = new Player("203471");
		Assert.assertNotNull(player);
		Assert.assertEquals("Dennis", player.getFirstName());
		Assert.assertEquals("Schroder", player.getLastName());
		Assert.assertEquals("Germany", player.getCountry());
		Assert.assertEquals("2013", player.getNbaDebutYear());
		Assert.assertEquals(Player.HEADSHOT_BASE_URL + "203471" + Player.HEADSHOT_END_URL, player.getHeadshotUrl());
		Assert.assertNotNull(player.getHeadshotImage());
	}
	
	public void testSearchRussellWestbrook() throws PlayerNotFoundException {
		Player player = Player.searchPlayer("westbrook");
		Assert.assertNotNull(player);
		Assert.assertEquals("Russell", player.getFirstName());
		Assert.assertEquals("Westbrook", player.getLastName());
	}
	
	public void testSearchLebronJames() throws PlayerNotFoundException {
		Player player = Player.searchPlayer("lebron");
		Assert.assertNotNull(player);
		Assert.assertEquals("LeBron", player.getFirstName());
		Assert.assertEquals("James", player.getLastName());
	}
	
	public void testGetPlayerFromInvalidPersonId() {
		try {
			new Player("invalidID");
			Assert.assertTrue(false);
		} catch (PlayerNotFoundException e) {
			Assert.assertTrue(true);
		}
	}
}

package com.drmilk.nbawrapper.domain;

import com.drmilk.nbawrapper.exception.PlayerNotFoundException;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author Antoine Guay
 *
 */
public class PlayerTest extends TestCase {

	public void testGetDennisSchroderShortProfileFromPersonId() throws PlayerNotFoundException {
		PlayerMin playerMin = Player.getPlayerMinById("203471");
		Assert.assertNotNull(playerMin);
		Assert.assertEquals("Dennis", playerMin.getFirstName());
		Assert.assertEquals("Schroder", playerMin.getLastName());
	}

	public void testGetDennisSchroderFromPersonId() throws PlayerNotFoundException {
		Player player = Player.getPlayerById("203471");
		Assert.assertNotNull(player);
		Assert.assertEquals("Dennis", player.getFirstName());
		Assert.assertEquals("Schroder", player.getLastName());
		Assert.assertEquals("Germany", player.getCountry());
		Assert.assertEquals("2013", player.getNbaDebutYear());
		Assert.assertEquals(Player.HEADSHOT_BASE_URL + "203471" + Player.HEADSHOT_END_URL, player.getHeadshotUrl());
		Assert.assertNotNull(player.getHeadshotImage());
	}

	public void testSearchRussellWestbrook() throws PlayerNotFoundException {
		Player player = Player.getPlayerByNameKeywords("westbrook");
		Assert.assertNotNull(player);
		Assert.assertEquals("Russell", player.getFirstName());
		Assert.assertEquals("Westbrook", player.getLastName());
	}

	public void testSearchLebronJames() throws PlayerNotFoundException {
		Player player = Player.getPlayerByNameKeywords("lebron");
		Assert.assertNotNull(player);
		Assert.assertEquals("LeBron", player.getFirstName());
		Assert.assertEquals("James", player.getLastName());
	}

	public void testGetPlayerFromInvalidPersonId() {
		try {
			Player.getPlayerById("invalidID");
			Assert.assertTrue(false);
		} catch (PlayerNotFoundException e) {
			Assert.assertTrue(true);
		}
	}
}

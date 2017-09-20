# nbawrapper-stats
Wrapper for NBA player/team stats and even more!
## Getting a player's statistics
### Using keywords
To get a player's complete statistics using keywords to search him, you can use the static method getPlayerByNameKeywords of the Player class.
```java
Player player1 = Player.getPlayerByNameKeywords("westbrook");
System.out.println(player1.getFirstName()); // Russell
System.out.println(player1.getFirstName()); // Westbrook
```
### Using the player ID
To get a player's complete statistics using his ID, you can use the static method getPlayerById of the Player class.
```java
Player player1 = Player.getPlayerById("203471");
System.out.println(player1.getFirstName()); // Dennis
System.out.println(player1.getFirstName()); // Schroder
```
### Get player's short profile
You can also get a player's minimal informations, useful when displaying a roster for instance, using the static method getPlayerMinById of the Player class.
```java
PlayerMin playerMin = Player.getPlayerMinById("203471");
System.out.println(playerMin.getFirstName()); // Dennis
System.out.println(playerMin.getFirstName()); // Schroder
```

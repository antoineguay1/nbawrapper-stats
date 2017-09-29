# nbawrapper-stats
Java wrapper for NBA player/team/league stats and even more!
## Installing
### Using Maven
```xml
<dependency>
    <groupId>com.antoineguay</groupId>
    <artifactId>nbawrapper</artifactId>
    <version>0.0.2</version>
</dependency>
```
## Getting a player's profile
The Player object contains contains all the player's general information about his draft, height, weight, stats, etc. It also contains the player's headshot image.
### Using keywords
To get a player's complete profile using keywords to search him, you can use the static method getPlayerByNameKeywords of the Player class.
```java
Player player = Player.getPlayerByNameKeywords("westbrook");
System.out.println(player.getFirstName()); // Russell
System.out.println(player.getLastName()); // Westbrook
```
### Using the player ID
To get a player's complete profile using his ID, you can use the static method getPlayerById of the Player class.
```java
Player player = Player.getPlayerById("203471");
System.out.println(player.getFirstName()); // Dennis
System.out.println(player.getLastName()); // Schroder
```
### Get player's short profile
You can also get a player's minimal profile, useful when displaying a roster for instance, using the static method getPlayerMinById of the Player class.
```java
PlayerMin playerMin = Player.getPlayerMinById("203471");
System.out.println(playerMin.getFirstName()); // Dennis
System.out.println(playerMin.getLastName()); // Schroder
```
## Getting a team's profile
The Team object contains a team's roster, stats leaders, games this season as well as the url to its logo image. It also contains general information.
### Using keywords
To get a team's complete profile using keywords to search it, you can use the static method getTeamByNameKeywords of the Team class.
```java
Team toronto = Team.getTeamByNameKeywords("Toronto");
System.out.println(toronto.getCity()); // Toronto
System.out.println(toronto.getFullName()); // Toronto Raptors

Team hawks = Team.getTeamByNameKeywords("Hawks");
System.out.println(hawks.getCity()); // Atlanta
System.out.println(hawks.getFullName()); // Atlanta Hawks
```
### Using the team ID
To get a team's complete profile using its ID, you can use the static method getTeamById of the Team class.
```java
Team team = Team.getTeamById("1610612737");
System.out.println(team.getCity()); // Atlanta
System.out.println(team.getFullName()); // Atlanta Hawks
```
### Get team's short profile
You can also get a team's minimal profile, useful when displaying a list of teams for instance, using the static method getShortProfileByTeamId of the Team class.
```java
TeamMin teamMin = Team.getShortProfileByTeamId("1610612737");
System.out.println(teamMin.getCity()); // Atlanta
System.out.println(teamMin.getFullName()); // Atlanta Hawks
```
## Getting a scoreboard
### Using a date
You can get the scoreboard on a certain date using the static method getScoreboard of League. For instance, to get the scoreboard on December 25th 2016, you can use this snippet of code
```java
Scoreboard scoreboard = League.getScoreboard(25, 12, 2016);
// From this scoreboard, you can access different information
List<GameDetails> gameList = scoreboard.getGames();
```
## Getting a boxscore
### Using a date and a game ID
You can get the boxscore of a certain game using the static method getBoxscore of League. For instance, to get the boxscore of the game between the Cavaliers and the Warriors on December 25th 2016, you can use this snippet of code
```java
Boxscore boxscore = League.getBoxscore(25, 12, 2016, "0021600457");
System.out.println(boxscore.getBasicGameData().getHomeTeam().getScore()); // 109
System.out.println(boxscore.getBasicGameData().getVisitingTeam().getScore()); // 108
```

package za.ac.cput.assignment2;

/**
 * GamesTest.java
 * This is a Test class, testing different Java Collection Interfaces.
 * @Author Keenan Barends   219002959
 * @Date 16 May 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GamesTest {

    Games games1, games2, games3, games4, games5;

    private Collection<Games> titles = new LinkedList<>();
    private Map<Integer, Games> gamesDevs = new HashMap();
    private Set<Games> devs = new HashSet();
    private List<Games> games = new ArrayList();

    @BeforeEach
    void setUp() {

        // Initializing Objects
        games1 = new Games("Gmod", "Valve");
        games2 = new Games("Need For Speed", "EA Games");
        games3 = new Games("Halo Infinite", "343 Studios");
        games4 = new Games("Black Ops 2", "Treyarch");
        games5 = new Games("Grand Theft Auto 5", "Rockstar");

        // Adding to Interfaces
        titles.add(games3);
        titles.add(games4);

        gamesDevs.put(1, games1);
        gamesDevs.put(5, games5);

        devs.add(games1);
        devs.add(games5);

        games.add(games1);
        games.add(games5);
    }

    @Test
    void addCollection()
    {
        // Add & Test Case for Collection
        titles.add(games1);
        titles.add(games2);
        titles.add(games5);

        System.out.println("Collection : " + titles);
        System.out.println("Number of Titles : " + titles.size());
        assertEquals(5, titles.size());
  }

  @Test
  void addList()
  {
      // Add & Test Case for List Collection
      games.add(games2);
      games.add(games3);
      games.add(games4);

      System.out.println("\nList : " + games);
      System.out.println("Number of Games : " + games.size());
      assertEquals(5, games.size());
  }

  @Test
  void addMap()
  {
      // Add & Test Case for Map Collection
      gamesDevs.put(2, games2);
      gamesDevs.put(3, games3);
      gamesDevs.put(4, games4);

      System.out.println("\nMap : " + gamesDevs);
      System.out.println("Number of Games and Developers : " + gamesDevs.size());
      assertEquals(5, gamesDevs.size());
  }

    @Test
    void addSet()
    {
        // Add & Test Case for Set Collection
        devs.add(games2);
        devs.add(games3);
        devs.add(games4);

        System.out.println("\nSet : " + devs);
        System.out.println("Number of Developers : " + devs.size());
        assertEquals(5, devs.size());

    }


  @Test
  void removeCollection()
  {
      // Remove for Collection
      titles.remove(games3);
      System.out.println(titles);
      System.out.println("Number of Titles : " + titles.size());
      assertEquals(1, titles.size());
  }

  @Test
  void removeList()
  {
    // Remove for List Collection
      games.remove(1);
      System.out.println("\n\n" + games);
      System.out.println("Number of Games : " + games.size());
      assertEquals(1, games.size());
  }

  @Test
  void removeSet()
  {
      // Remove for Set Collection
      devs.remove(games5);
      System.out.println("\n\n" + devs);
      System.out.println("Number of Developers : " + devs.size());
      assertEquals(1, devs.size());
  }

  @Test
  void removeMap()
  {
      // Remove for Map Collection
      gamesDevs.remove(1);
      System.out.println(gamesDevs);
      System.out.println("Number of Games and Developers : " + gamesDevs.size());
      assertEquals(1, gamesDevs.size());
  }


  @Test
    void findCollection()
  {
      // Find & Test Case for Collection

        if(titles.contains(games3))
        {
            System.out.println("\n" + games3 + "is in the Collection.");

        }
        else
        {
            System.out.println(games3 + "is not in the Collection.");
        }

      assertEquals(true, titles.contains(games3));
  }

    @Test
    void findMap()
    {
        // Find & Test Case for Map

        if(gamesDevs.containsKey(1))
        {
            System.out.println(1 + " is in the Map Collection.");

        }
        else
        {
            System.out.println(1 + " is not in the Map Collection.");
        }

        assertEquals(true, gamesDevs.containsKey(1));

    }

    @Test
    void findSet()
    {
        // Find & Test Case for Set

        if(devs.contains(games3))

        {
            System.out.println(games3 + " is in the Collection.");

        }
        else
        {
            System.out.println(games3 + " is not in the Collection.");
        }

        assertEquals(false, devs.contains(games3));

    }

    @Test
    void findList()
    {
        // Find & Test Case for List

        if(games.contains(games1))
        {
            System.out.println(games1 + " is in the List Collection.");

        }
        else
        {
            System.out.println(games1 + " is not in the List Collection.");
        }

        assertEquals(true, games.contains(games1));


    }
}
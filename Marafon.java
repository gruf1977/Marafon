package Lesson_1.Marathon;

import Lesson_1.Marathon.Obstacle.Obstacle;

public class Marafon {



    public static void Start(Team team, Course cours){



        for (Competitor c : team.ushastniki) {
            for (Obstacle o : cours.prepyatstvia) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }


    }
}

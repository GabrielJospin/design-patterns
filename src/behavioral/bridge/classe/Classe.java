package behavioral.bridge.classe;

import behavioral.bridge.utils.ClassAbility;
import behavioral.bridge.utils.Point;

import java.util.Arrays;

public abstract class Classe {


    protected Classe(int social_points, int explorer_points, Point[] limit_align) {
        SOCIAL_POINTS = social_points;
        EXPLORER_POINTS = explorer_points;
        if(limit_align.length > 4)
            throw new IllegalArgumentException("limit_align must be a quadrilateral");
        LIMIT_ALIGN = limit_align;
    }

    public enum primaryAbility {STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA}

    final int SOCIAL_POINTS;
    final int EXPLORER_POINTS;
    final Point[] LIMIT_ALIGN;

    public abstract int getLevel();
    public abstract int upLevel();
    public abstract String getBackStory();
    private double multiplyVectors(Point v1pa, Point v1pb, Point v2pa, Point v2pb){
        double v1X = v1pb.x - v1pa.x;
        double v1Y = v1pb.y - v1pa.y;
        double v2X = v1pb.x - v1pa.x;
        double v2Y = v1pb.y - v1pa.y;

        return (v1X * v2X) + (v2Y * v1Y);
    }

    private double pointsDistance(Point pointA, Point pointB){
        double deltaX = Math.pow(pointA.x - pointB.x, 2);
        double deltaY = Math.pow(pointA.y - pointB.y, 2);
        return Math.sqrt(deltaX + deltaY);
    }


    private double angleBetweenPoints(Point pointA, Point pointB, Point pointC){
        return Math.abs(Math.acos(multiplyVectors(pointA, pointC, pointB, pointC) /
                pointsDistance(pointA, pointC) * pointsDistance(pointB, pointC)));
    }

    public boolean isInAlignOfClass(Point align) {
        double angleSum = 0;
        for(Point pointA: LIMIT_ALIGN){
            for(Point pointB: LIMIT_ALIGN){
                angleSum += angleBetweenPoints(pointA, pointB, align);
            }
        }
        return angleSum <= 2 * Math.PI;
    }
    public abstract ClassAbility[] getAllClassAbility();
    public abstract ClassAbility getClassAbilityFromId(String id);

    @Override
    public String toString() {
        return "Classe{" +
                "SOCIAL_POINTS=" + SOCIAL_POINTS +
                ", EXPLORER_POINTS=" + EXPLORER_POINTS +
                ", LIMIT_ALIGN=" + Arrays.toString(LIMIT_ALIGN) +
                '}';
    }
}

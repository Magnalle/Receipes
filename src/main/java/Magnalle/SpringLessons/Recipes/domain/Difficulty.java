package Magnalle.SpringLessons.Recipes.domain;

public enum Difficulty {
    EASY, MODERATE, HARD;

    @Override
    public String toString() {
        switch(this){
            case EASY: return "Easy";
            case MODERATE: return "Moderate";
            case HARD: return "Hard";
            default: return "";
        }
    }
}

package Model;

public class Riddle {
    int level;
    int id;
    String solution;
    String name;
    String category;
    boolean isSolved;
    String message;

    public Riddle(int level, String name)  {
        this.level=level;
        this.name=name;
        this.isSolved=false;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }

    public int getLevel() {
        return level;
    }

    public String getSolution() {
        return solution;
    }

    public String getName() {
        return name;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
    public void setSolution(String msg) {
        this.solution = msg;
    }
    public boolean solveRiddle(String userGuess) throws AlreadySolvedException {
        boolean isSolved = false;
        if (!this.isSolved) {
            if (this.solution.equals(userGuess)) {
                isSolved = true;
                this.isSolved = true;
                return isSolved;
            } else {
                return isSolved;
            }
        } else throw new AlreadySolvedException("Riddle "+this.name + " has been solved");
    }
}
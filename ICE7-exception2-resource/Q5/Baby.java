public class Baby {
    private boolean isHungry;

    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public void eat(String food) throws NotHungryException {
        if (isHungry) {
            System.out.println("Eating " + food);
        } else {
            throw new NotHungryException("Baby is not hungry");
        }
    }
}

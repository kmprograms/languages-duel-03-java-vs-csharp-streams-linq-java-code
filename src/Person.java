public record Person (String name, int age) {
    public boolean hasAgeBetween(int ageFrom, int ageTo) {
        return ageFrom <= age && age <= ageTo;
    }
}

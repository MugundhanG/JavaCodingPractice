package ShallowAndDeepCopies;

class ShallowAndDeepPractice {
    String stName;
    int year;
    String platform;


    ShallowAndDeepPractice(String stName, int year, String platform) {
        this.stName = stName;
        this.year = year;
        this.platform = platform;
    }

    // Shallow copy (default assignment)
    //In a shallow copy, only the references to the objects are copied.
    //Any changes made to the original object will also be reflected in the copy.
    public ShallowAndDeepPractice shallowCopy() {
        return this;
    }

    // Deep copy (creating a new object)
    //In a deep copy, a complete copy of the object and all its referenced objects is created.
    //Changes made to one object will not affect the other or the original one.
    public ShallowAndDeepPractice deepCopy() {
        return new ShallowAndDeepPractice(this.stName, this.year, this.platform);
    }

}


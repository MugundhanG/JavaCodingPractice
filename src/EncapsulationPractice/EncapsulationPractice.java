package EncapsulationPractice;

public class EncapsulationPractice {
    //Make the class fields private.
    private String code;
    private int codeDuration;

    public EncapsulationPractice(String code, int codeDuration) {
        this.code = code;
        this.codeDuration = codeDuration;
    }

    // Getter for code (public method to access private field)
    public String getCode() {
        System.out.println(code);
        return code;
    }

    // Setter for code (public method to modify private field)
    public void setCode(String code) {
        this.code = code;
    }

    public int getCodeDuration() {
        return codeDuration;
    }

    public void setCodeDuration(int codeDuration) {
        if(codeDuration > 1) {
            this.codeDuration = codeDuration;
        }
    }

    public void displayEncapsulationCode() {
        System.out.println("Encapsulation Code: " + code);
    }

    public void displayEncapsulationDuration() {
        System.out.println("Encapsulation Duration: " + codeDuration);
    }

}

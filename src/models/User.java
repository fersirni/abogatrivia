package models;

public class User {

    private Long id;
    private String email;
    private String name;
    private String lastName;
    // TODO:
    // private Trivia currentGame;
    // private History history;

    public User(String email, String name, String lastName) {
        this.email = email;
        this.name = format(name);
        this.lastName = format(lastName);
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String format(String text){
        //"PONCE De LEON"
        String formattedText = "";
        // Setea el texto ingresado todo en minusculas
        String textInLowerCase = text.toLowerCase();
        String[] words = textInLowerCase.split(" ");
        //["ponce","de","leon"]
        // for (int i = 0; i menor words.length ;i++) { String word = words[i];
        for(String word : words) {
            // Te da una copia del texto desde el indice cero hasta el indice 1
            String firstLetter = word.substring(0, 1);
            String firstLetterUppcase = firstLetter.toUpperCase();
            String restOfTheText = word.substring(1);
            formattedText = formattedText + firstLetterUppcase + restOfTheText + " ";
        }
        if(formattedText.endsWith(" ")) {
            //"Ponce Del L e o n  "
            // 01234567891011121314
            formattedText = formattedText.substring(0, formattedText.length() - 1);
        }
        return formattedText;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

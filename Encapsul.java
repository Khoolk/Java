//Encapsulation makes sure sensitive data is hidden from user
//must declare class variable /attribute as private
//provide public get & set methods to access & update value of private variable

public class Encapsul {

    private String name;
//private variable can be accessed if public get & set methods are provided
//get method returns the variable value

    public String getName() {
        return name;
    }
//set method sets the value by taking the parameter and assign to the variable, "this" refer to current object

    public void setName(String newName) {
        this.name = newName;
    }
}
//method syntax start with get or set, followed by variable name with first letter in upper case

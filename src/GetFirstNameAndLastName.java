class NameMe{
    public String firstName,lastName;
    public String fullName;
    public  NameMe(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getName()
    {
        fullName =firstName+" "+lastName;
        return fullName;
    }
}
public class GetFirstNameAndLastName {
    public static void main(String[] args) {
        NameMe names = new NameMe("Jhon", "De");
        System.out.println(names.firstName);
        System.out.println(names.lastName);
        System.out.println(names.getName());
    }
}

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

public class Task01_05Home {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.add("5486866", "Петрова");
        phone.add("54855856", "Косолапова");
        phone.add("55225266", "Худякова");
        phone.add("552121266", "Петракова");
        phone.add("5451121216", "Иванова");
        phone.add("58855556", "Петрова");
        phone.add("548552266", "Рыбакова");
        phone.add("588555555", "Худякова");
        phone.add("558554422252", "Петрова");
        phone.print("Худякова");
    }
}

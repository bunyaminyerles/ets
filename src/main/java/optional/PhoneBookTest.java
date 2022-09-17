package optional;

import java.util.Optional;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    public PhoneBookTest(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

    public static void main(String[] args) {
        PhoneBookTest p = new PhoneBookTest(new PhoneBook());
        System.out.println(p.find("Ahmet",""));
    }

    public String find(String name, String phoneNumber){
        return getPhoneBook().findNameByPhone(phoneNumber).orElse(getPhoneBook().findPhoneByName(name).orElse(null));
    }

}

package optional;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {{
        put("Ahmet", "05123456789");
        put("Mehmet", "05987654321");
        put("Ali", "05555555555");
    }};

    public PhoneBook() {
    }

    public HashMap<String,String> getPhoneBookEntries() {
        return PHONE_NUMBERS;
    }

    public Optional<String> findPhoneByName(String name){
        return Optional.ofNullable((PHONE_NUMBERS.get(name)));
    }

    public Optional<String> findNameByPhone(String phoneNumber){
        return PHONE_NUMBERS.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(phoneNumber))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    @Override
    public String toString() {
        return "PhoneBook{}";
    }
}

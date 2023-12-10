package lab13;
import java.util.StringTokenizer;
public class ex3 {
        public static void main(String[] args) {
            String addressString1 = "Россия, Московский, Москва, Микрарайон Б, 1, 1, 1";
            Address address1 = new Address(addressString1, ",");
            System.out.println("Адрес 1:");
            System.out.println(address1);
        }

    }
    class Address {
        private String country;
        private String region;
        private String city;
        private String street;
        private String house;
        private String building;
        private String apartment;

        public Address(String addressString, String delimiter) {
            String[] parts = addressString.split(delimiter);
            if (parts.length >= 7) {
                country = parts[0].trim();
                region = parts[1].trim();
                city = parts[2].trim();
                street = parts[3].trim();
                house = parts[4].trim();
                building = parts[5].trim();
                apartment = parts[6].trim();
            } else {
                System.out.println("Неверный формат адреса");
            }
        }
        @Override
        public String toString() {
            return "Страна: " + country +
                    "\nРегион: " + region +
                    "\nГород: " + city +
                    "\nУлица: " + street +
                    "\nДом: " + house +
                    "\nКорпус: " + building +
                    "\nКвартира: " + apartment;
        }
}
